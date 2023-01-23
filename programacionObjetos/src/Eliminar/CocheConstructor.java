
package Eliminar;

public class CocheConstructor {
	//Atributos
	String color;
	String marca;
	int km;
	
	public CocheConstructor(String color, String marca, int km) {
		this.color=color;
		this.marca=marca;
		this.km=km;
	}
	
	//Método
	public static void main(String [] args) {
		CocheConstructor coche1 = new CocheConstructor("Blanco", "Audi", 0);
		
		System.out.println("· Color del primer coche: "+coche1.color);
		System.out.println("· Marca del primer coche: "+coche1.marca);
		System.out.println("· Kilómetros del primer coche: "+coche1.km);
		
		CocheConstructor coche2 = new CocheConstructor("Rojo", "Ferrari", 100);
		
		System.out.println("\n· Color del segundo coche: "+coche2.color);
		System.out.println("· Marca del segundo coche: "+coche2.marca);
		System.out.println("· Kilómetros del segundo coche: "+coche2.km);
		
	}
}
