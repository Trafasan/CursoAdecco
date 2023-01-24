/**
 * 
 */
package manualCurso;

/**
 * @author Sandra
 *
 */
public class Profesor extends Persona{
	// Atributos
	private int numeroDeEdadesEstudiantes;
	private int sumaDeEdadesEstudiantes;
	private float estudiantesEdadMedia;
	
	// Constructor parametrizado
	public Profesor(int id, int edad, int telefono, int numeroDeEdadesEstudiantes, int sumaDeEdadesEstudiantes, float estudiantesEdadMedia) {
		super(id, edad, telefono);
		this.numeroDeEdadesEstudiantes=numeroDeEdadesEstudiantes;
		this.sumaDeEdadesEstudiantes=sumaDeEdadesEstudiantes;
		this.estudiantesEdadMedia=estudiantesEdadMedia;
	}
	// Constructor por defecto
	public Profesor() {
		this.numeroDeEdadesEstudiantes=3;
		this.sumaDeEdadesEstudiantes=78;
		this.estudiantesEdadMedia=26.0f;
	}
	
	public int getNumeroDeEdadesEstudiantes() {return numeroDeEdadesEstudiantes;}
	public void setNumeroDeEdadesEstudiantes(int numeroDeEdadesEstudiantes) {this.numeroDeEdadesEstudiantes=numeroDeEdadesEstudiantes;}
	
	public int getSumaDeEdadesEstudiantes() {return sumaDeEdadesEstudiantes;}
	public void setSumaDeEdadesEstudiantes(int sumaDeEdadesEstudiantes) {this.sumaDeEdadesEstudiantes=sumaDeEdadesEstudiantes;}
	
	public float getEstudiantesEdadMedia() {return estudiantesEdadMedia;}
	public void setEstudiantesEdadMedia(float estudiantesEdadMedia) {this.estudiantesEdadMedia=estudiantesEdadMedia;}
	
	// Métodos
	public void mostrarInfo3() {}
	public void agregaredadEstudiante(int edadEst) {
		numeroDeEdadesEstudiantes++; sumaDeEdadesEstudiantes+=24; estudiantesEdadMedia=(float)sumaDeEdadesEstudiantes/numeroDeEdadesEstudiantes;
	}
}