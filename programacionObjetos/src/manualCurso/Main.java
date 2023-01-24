/**
 * 
 */
package manualCurso;

/**
 * @author Sandra
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Estudiante Juan = new Estudiante(1, 25, 687432596, 3, 26, 0); // Si no se ponen parámetros, se imprimen los del constructor por defecto
		
		Juan.agregarNuevaNota(5, false);
		
		System.out.println("Juan");
		System.out.println("Id: "+Juan.getId()+"\t\t\tEdad: "+Juan.getEdad());
		System.out.println("Teléfono: "+Juan.getTelefono()+"\tNúmero de notas: "+Juan.getNumeroDeNotas());
		System.out.println("Suma de notas: "+Juan.getSumaDeNotas()+"\tNota media: "+Juan.getNotaMedia());
		
		Estudiante.crearEstudiante();
		
	}
}