package ClasesYObjetos;

public class Persona {
	//Atributos
	String nombre;
	int edad;
	String dni;
	
	//Método constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre; //Sin "this.", el nombre sería null
		this.edad = edad; //Sin "this.", la edad sería 0
	}
	
	public Persona(String dni) {
		this.dni = dni;
	}
	
	public void correr() {
		System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón.");
	}
	
	public void correr(int km) {
		System.out.println("He corrido "+km+" kilómetros.");
	}
	
}
