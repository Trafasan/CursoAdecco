/**
 * 
 */
package ManualCurso;

/**
 * @author Sandra
 *
 */
public class Persona {
	//atributos
	protected int id;
	protected int edad;
	protected int telefono;
	
	//Constructor parametrizado
	public Persona(int id, int edad, int telefono) {
		this.id=id;
		this.edad=edad;
		this.telefono=telefono;
	}
	//Constructor parametrizado
	public Persona(int edad, int telefono) {
		this.id=1;
		this.edad=edad;
		this.telefono=telefono;
	}
	//Constructor parametrizado
	public Persona(int telefono) {
		this.id=1;
		this.edad=30;
		this.telefono=telefono;
	}
	//Constructor por defecto
	public Persona() {
		this.id=2;
		this.edad=30;
		this.telefono=605487265;
	}
	
	public int getId() {return id;}
	public void setId(int id) {this.id=id;}
	
	public int getEdad() {return edad;}
	public void setEdad(int edad) {this.edad=edad;}
	
	public int getTelefono() {return telefono;}
	public void setTelefono(int telefono) {this.telefono=telefono;}
	
	// métodos
	public void mostrarInfo() {}
}