package examen_recuperacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class base_datos {
	
	public static List<Doctores> listaDoctores;
		
		public static void guardarListaDoctores() {
			String  nombreArchivo="C:\\BaseDatosISTLC\\ArchDoctores";
			try(ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream(nombreArchivo))){
			salida.writeObject(base_datos.listaDoctores);
			System.out.println("Producto Grabado con Éxito!");
				
			} catch (IOException e) {
				System.out.println("Ocurrió un error al grabar el producto! ");
			}
		
		}
		
		public static void leerListaDoctor() {
			String  nombreArchivo="C:\\BaseDatosISTLC\\ArchDoctores";
			try  (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
				base_datos.listaDoctores= (ArrayList<Doctores>) entrada.readObject();
				
			} catch (IOException | ClassNotFoundException e) {
				System.out.println("Ocurrió un error al leer el producto! ");
			}
		
		}
	public static List<Pacientes> listaPacientes;

	public static void guardarListaPacientes() {
		String  nombreArchivo="C:\\BaseDatosISTLC\\ArchPacientes";
		try(ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream(nombreArchivo))){
		salida.writeObject(base_datos.listaPacientes);
		System.out.println("Producto Grabado con Éxito!");
			
		} 
		catch (IOException e) {
			System.out.println("Ocurrió un error al grabar el producto! ");
			}

	}

	public static void leerListapacientes() {
		String  nombreArchivo="C:\\BaseDatosISTLC\\ArchEstudiantes";
		try  (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
			base_datos.listaPacientes= (ArrayList<Pacientes>) entrada.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Ocurrió un error al leer el producto! ");
	}
	}
	}

