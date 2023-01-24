/**
 * 
 */
package manualCurso;

/**
 * @author Sandra
 *
 */
public class Estudiante extends Persona{
	// Atributos
	private int numeroDeNotas;
	private int sumaDeNotas;
	private float notaMedia;
	
	// Constructor parametrizado
	public Estudiante(int id, int edad, int telefono, int numeroDeNotas, int sumaDeNotas, float notaMedia) {
		super(id, edad, telefono);
		this.numeroDeNotas=numeroDeNotas;
		this.sumaDeNotas=sumaDeNotas;
		this.notaMedia=notaMedia;
	}
	// Constructor por defecto
	public Estudiante() {
		this.numeroDeNotas=3;
		this.sumaDeNotas=24;
		this.notaMedia=8.0f;
	}
	
	public int getNumeroDeNotas() {return numeroDeNotas;}
	public void setNumeroDeNotas(int numeroDeNotas) {this.numeroDeNotas=numeroDeNotas;}
	
	public int getSumaDeNotas() {return sumaDeNotas;}
	public void setSumaDeNotas(int sumaDeNotas) {this.sumaDeNotas=sumaDeNotas;}
	
	public float getNotaMedia() {return notaMedia;}
	public void setNotaMedia(float notaMedia) {this.notaMedia=notaMedia;}
	
	// Métodos
	public void mostrarInfo2() {}
	public void agregarNuevaNota() {
		numeroDeNotas++; sumaDeNotas+=5; notaMedia=(float)sumaDeNotas/numeroDeNotas;
	}
	public void agregarNuevaNota(float nota) {
		numeroDeNotas++; sumaDeNotas+=nota; notaMedia=(float)sumaDeNotas/numeroDeNotas;
	}
	public void agregarNuevaNota(float nota, boolean reinicio) {
		if(reinicio==false) {numeroDeNotas++; sumaDeNotas+=nota; notaMedia=(float)sumaDeNotas/numeroDeNotas;}
		else {sumaDeNotas=0; numeroDeNotas=0; notaMedia=0;}
	}
	public static Estudiante crearEstudiante() {
		Estudiante Elena = new Estudiante();
		
		System.out.println("\nElena");
		System.out.println("Id: "+Elena.getId()+"\t\t\tEdad: "+Elena.getEdad());
		System.out.println("Teléfono: "+Elena.getTelefono()+"\tNúmero de notas: "+Elena.getNumeroDeNotas());
		System.out.println("Suma de notas: "+Elena.getSumaDeNotas()+"\tNota media: "+Elena.getNotaMedia());
		
		return Elena;
		}
}