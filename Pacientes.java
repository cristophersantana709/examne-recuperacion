package examen_recuperacion;
import java.io.Serializable;
public class Pacientes implements Serializable {
	public String pacienteID;
	public String nombres;
	public String apellidos;
	public String genero;
	public String tiposangre;
	public String telefono;
	public String direccion;
	public Pacientes(String pacienteID, String nombres, String apellidos, String genero, String tiposangre,
			String telefono, String direccion) {
		super();
		this.pacienteID = pacienteID;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
		this.tiposangre = tiposangre;
		this.telefono = telefono;
		direccion = direccion;
	}
	public Pacientes() {
		super();
	}
	public void Imprimir() {
		System.out.println("pacienteID: "+this.pacienteID);
		System.out.println("Nombres: "+this.nombres);
		System.out.println("apellidos: "+this.apellidos);
		System.out.println("genero: "+this.genero);
		System.out.println("telefono: "+this.telefono);
		System.out.println("direccion: " +this.direccion);
		System.out.println("Tipo de sangre: "+this.tiposangre);
	}	

}
