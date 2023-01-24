
package clasesYObjetos;

public class Coche {
	// Atributos
	String color;
	String marca;
	int km;
	
	// Constructor parametrizado
	public Coche(String color, String marca, int km) {
		this.color=color;
		this.marca=marca;
		this.km=km;
	}
	
	// Método
	public void datosCoche(Coche coche) {
		Coche coche1 = new Coche("Blanco", "Audi", 0);
		System.out.println("· Color del primer coche: "+coche.color);
		System.out.println("· Marca del primer coche: "+coche.marca);
		System.out.println("· Kilómetros del primer coche: "+coche.km);
		
		Coche coche2 = new Coche("Rojo", "Ferrari", 100);
		
	}
}
