package examen_recuperacion;
import java.io.Serializable;
public class Doctores implements Serializable {
	public String DoctorID;
	public String nombres;
	public String apellidos;
	public String especialidad;
	public String telefono;
	public String Email;
	public Doctores(String doctorID, String nombres, String apellidos, String especialidad, String telefono,
			String email) {
		super();
		DoctorID = doctorID;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
		this.telefono = telefono;
		Email = email;
	}
	public Doctores() {
		super();
	}
	
	public void Imprimir() {
		System.out.println("DoctoID: "+this.DoctorID);
		System.out.println("Nombres: "+this.nombres);
		System.out.println("apellidos: "+this.apellidos);
		System.out.println("especialidad: "+this.especialidad);
		System.out.println("telefono: "+this.telefono);
		System.out.println("Email: " +this.Email);
	}	

}
