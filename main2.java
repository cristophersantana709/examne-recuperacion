package examen_recuperacion;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main2 {

public static void main2(String[] args) {
	Inicializarbases_datos();
	MenuPrincipal();
}

public static void Inicializarbases_datos() {
	base_datos.guardarListaPacientes();  new ArrayList<Pacientes>();
	base_datos.leerListapacientes();
}

public static void MenuPrincipal() {
	Scanner sc = new Scanner(System.in);
	int opcion=0;	
	do {
		
		System.out.println("*********************************************");
		System.out.println("**********SISTEMA DE Doctores***********");
		System.out.println("*********************************************");
		System.out.println();
		System.out.println("************************");
		System.out.println("MENÚ DE OPCIONES");
		System.out.println("1.- Crear pacientes");
		System.out.println("2.- Consultar paciente");
		System.out.println("3.- Actualizar paciente");
		System.out.println("4.- eliminar paciente");
		System.out.println();
		System.out.print("Seleccione una opción:");
		opcion=sc.nextInt();
		
		switch(opcion)
		{
		case 1:
			Crearpaciente();
			break;
		case 2:
			Consultarpaciente();
			break;
		case 3:
			Actualizarpaciente();
			break;
		case 4:
			System.out.println("el paciente eliminado con exito");
			break;
		
		}
		
		System.out.println("************************");
		
	}while(opcion!=4);
		
}
		
public static void Crearpaciente() {
	Scanner sc = new Scanner(System.in);
	String pacienteID ="";
	String nombres ="";
	String apellidos="";
	String genero="";
	String tiposangre="";
	String telefono="";
	String direccion="";
	
	System.out.println("*********CREACIÓN DEL PACIENTE********");
	System.out.print("Ingrese El pacienteID: ");
	pacienteID= sc.nextLine(); 
	sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese El Nombres: ");
	nombres = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese La Apellidos: ");
	apellidos = sc.nextLine();
	sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese el genero: ");
	genero = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese La telefono: ");
	telefono = sc.nextLine();
	System.out.println();
	
	System.out.println("Ingrese direccion: ");
	direccion =sc.nextLine();
	System.out.println();
	
	System.out.println("Ingrese tipo de sangre: ");
	tiposangre =sc.nextLine();
	System.out.println();
	
	if(!ExistepacienteID(pacienteID)) {
		if(!ExisteNombrepaciente(nombres)) {
			Pacientes objEstudiante= new Pacientes (pacienteID, nombres, apellidos, genero, telefono , direccion, tiposangre );
			base_datos.listaPacientes.add(objEstudiante);
			System.out.println("paciente Ingresado con Éxito!");
			base_datos.guardarListaDoctores();
			objEstudiante.Imprimir();
		}
		else {
			System.out.println("El Nombre ya se encuentra Ingresado en el Sistema.");
		}
	}
	else {
		System.out.println("El Id ya se encuentra Ingresado en el Sistema.");
	}	
}

private static boolean ExisteNombrepaciente(String nombre) {
	for (Pacientes elemento : base_datos.listaPacientes) {
		if (elemento.nombres.equals(nombre)) {
			return true;
		}
	}
	return false;
}

private static boolean ExistepacienteID(String pacienteID) {
	for (Pacientes elemento : base_datos.listaPacientes) {
		if (elemento.nombres.equals(pacienteID)) {
			return true;
		}
	}
	return false;
}

public static void Consultarpaciente() {
	
	for (Pacientes elemento : base_datos.listaPacientes) {
		elemento.Imprimir();
	}
}

public static void Actualizarpaciente() {
    Scanner sc = new Scanner(System.in);
    String pacienteID ="";
	String nombres ="";
	String apellidos="";
	String genero="";
	String tiposangre="";
	String telefono="";
	String direccion="";

    System.out.println("********* MODIFICACIÓN DE LA PERSONA ********");
    System.out.print("Ingrese el ID de la persona a modificar: ");
    pacienteID = sc.nextLine();
    sc.nextLine();
    System.out.println();

    if (ExistepacienteID(pacienteID)) {
        for (int i = 0; i < base_datos.listaPacientes.size(); i++) {
            if (pacienteID == base_datos.listaPacientes.get(i).pacienteID) {
                base_datos.listaDoctores.get(i).Imprimir();
        		System.out.println("*********CREACIÓN DE PERSONA********");
        		System.out.print("Ingrese El pacienteID: ");
        		pacienteID= sc.nextLine(); 
        		sc.nextLine();
        		System.out.println();
        		
        		System.out.print("Ingrese El Nombres: ");
        		nombres = sc.nextLine();
        		System.out.println();
        		
        		System.out.print("Ingrese La Apellidos: ");
        		apellidos = sc.nextLine();
        		sc.nextLine();
        		System.out.println();
        		
        		System.out.print("Ingrese el genero: ");
        		genero = sc.nextLine();
        		System.out.println();
        		
        		System.out.print("Ingrese La telefono: ");
        		telefono = sc.nextLine();
        		System.out.println();
        		
        		System.out.println("Ingrese direccion: ");
        		direccion =sc.nextLine();
        		System.out.println();
        		
        		System.out.println("Ingrese tiposangre: ");
        		tiposangre =sc.nextLine();
        		System.out.println();

                base_datos.listaPacientes.get(i).pacienteID = pacienteID;
                base_datos.listaPacientes.get(i).nombres = nombres;
                base_datos.listaPacientes.get(i).apellidos = apellidos;
                base_datos.listaPacientes.get(i).genero = genero ;
                base_datos.listaPacientes.get(i).telefono = telefono ;
                base_datos.listaPacientes.get(i).direccion = direccion ;
                base_datos.listaPacientes.get(i).tiposangre = tiposangre ;
                base_datos.guardarListaPacientes();
                System.out.println("persona actualizado correctamente.");
                return;
            }
        }
    } else {
        System.out.println("El ID ingresado no coincide con los registros.");
    }
}

}
