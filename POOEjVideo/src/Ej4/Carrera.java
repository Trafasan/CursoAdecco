package Ej4;

public class Carrera {
	private int numero;
	private String nombre;
	private float tiempo;
	
	public Carrera(int numero, String nombre, float tiempo) {
		this.numero = numero;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public float getTiempo() {return tiempo;}
	
	public String mostrarDatos() {
		return "Número: "+numero+"\nNombre: "+nombre+"\nTiempo: "+tiempo+" s\n";
	}
}