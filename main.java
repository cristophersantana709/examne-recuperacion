package examen_recuperacion;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Inicializarbases_datos();
			MenuPrincipal();
		}
		
		public static void Inicializarbases_datos() {
			base_datos.guardarListaDoctores();  new ArrayList<Doctores>();
			base_datos.leerListaDoctor();
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
				System.out.println("1.- Crear doctores");
				System.out.println("2.- Consultar doctores");
				System.out.println("3.- Actualizar doctores");
				System.out.println("4.- eliminar doctor");
				System.out.println();
				System.out.print("Seleccione una opción:");
				opcion=sc.nextInt();
				
				switch(opcion)
				{
				case 1:
					Creardoctores();
					break;
				case 2:
					Consultardoctores();
					break;
				case 3:
					Actualizardoctores();
					break;
				case 4:
					System.out.println("el doctor fue elimanado con exito!!");
					break;
				
				}
				
				System.out.println("************************");
				
			}while(opcion!=4);
				
		}
				
		public static void Creardoctores() {
			Scanner sc = new Scanner(System.in);
			String DoctorID ="";
			String nombres="";
			String apellidos = "";
			String especialidad ="";
			String telefono = "";
			String email;
			
			System.out.println("*********CREACIÓN DE PERSONA********");
			System.out.print("Ingrese El DoctorID: ");
			DoctorID= sc.nextLine(); 
			sc.nextLine();
			System.out.println();
			
			System.out.print("Ingrese El Nombres: ");
			nombres = sc.nextLine();
			System.out.println();
			
			System.out.print("Ingrese La Apellidos: ");
			apellidos = sc.nextLine();
			sc.nextLine();
			System.out.println();
			
			System.out.print("Ingrese el especialidad: ");
			especialidad = sc.nextLine();
			System.out.println();
			
			System.out.print("Ingrese La telefono: ");
			telefono = sc.nextLine();
			System.out.println();
			
			System.out.println("Ingrese email: ");
			email =sc.nextLine();
			System.out.println();
			if(!ExisteDoctoreID(DoctorID)) {
				if(!ExisteNombreDoctores(nombres)) {
					Doctores objEstudiante= new Doctores (DoctorID, nombres, apellidos, especialidad, telefono , email);
					base_datos.listaDoctores.add(objEstudiante);
					System.out.println("Doctor Ingresado con Éxito!");
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

		private static boolean ExisteNombreDoctores(String nombre) {
			for (Doctores elemento : base_datos.listaDoctores) {
				if (elemento.nombres.equals(nombre)) {
					return true;
				}
			}
			return false;
		}

		private static boolean ExisteDoctoreID(String DoctorID) {
			for (Doctores elemento : base_datos.listaDoctores) {
				if (elemento.nombres.equals(DoctorID)) {
					return true;
				}
			}
			return false;
		}
		
		public static void Consultardoctores() {
			
			for (Doctores elemento : base_datos.listaDoctores) {
				elemento.Imprimir();
			}
		}
		
		public static void Actualizardoctores() {
		    Scanner sc = new Scanner(System.in);
		    String DoctorID ="";
			String nombres="";
			String apellidos = "";
			String especialidad ="";
			String telefono = "";
			String email;
			

		    System.out.println("********* MODIFICACIÓN DE LA PERSONA ********");
		    System.out.print("Ingrese el ID de la persona a modificar: ");
		    DoctorID = sc.nextLine();
		    sc.nextLine();
		    System.out.println();

		    if (ExisteDoctoreID(DoctorID)) {
		        for (int i = 0; i < base_datos.listaDoctores.size(); i++) {
		            if (DoctorID == base_datos.listaDoctores.get(i).DoctorID) {
		                base_datos.listaDoctores.get(i).Imprimir();
		        		System.out.println("*********CREACIÓN DE PERSONA********");
		        		System.out.print("Ingrese El DoctorID: ");
		        		DoctorID= sc.nextLine(); 
		        		sc.nextLine();
		        		System.out.println();
		        		
		        		System.out.print("Ingrese El Nombres: ");
		        		nombres = sc.nextLine();
		        		System.out.println();
		        		
		        		System.out.print("Ingrese La Apellidos: ");
		        		apellidos = sc.nextLine();
		        		sc.nextLine();
		        		System.out.println();
		        		
		        		System.out.print("Ingrese el especialidad: ");
		        		especialidad = sc.nextLine();
		        		System.out.println();
		        		
		        		System.out.print("Ingrese La telefono: ");
		        		telefono = sc.nextLine();
		        		System.out.println();
		        		
		        		System.out.println("Ingrese email: ");
		        		email =sc.nextLine();
		        		System.out.println();

		                base_datos.listaDoctores.get(i).DoctorID = DoctorID;
		                base_datos.listaDoctores.get(i).nombres = nombres;
		                base_datos.listaDoctores.get(i).apellidos = apellidos;
		                base_datos.listaDoctores.get(i).especialidad = especialidad ;
		                base_datos.listaDoctores.get(i).telefono = telefono ;
		                base_datos.listaDoctores.get(i).Email = email ;

		                base_datos.guardarListaDoctores();
		                System.out.println("persona actualizado correctamente.");
		                return;
		            }
		        }
		    } else {
		        System.out.println("El ID ingresado no coincide con los registros.");
		    }
		}

	}

