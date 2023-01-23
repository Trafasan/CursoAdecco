
package Eliminar;

public class Coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	//Método
	public static void main(String [] args) {
		Coche coche1 = new Coche();
		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;
		
		System.out.println("· Color del primer coche: "+coche1.color);
		System.out.println("· Marca del primer coche: "+coche1.marca);
		System.out.println("· Kilómetros del primer coche: "+coche1.km);
		
		Coche coche2 = new Coche();
		coche2.color = "Rojo";
		coche2.marca = "Ferrari";
		coche2.km = 100;
		
		System.out.println("\n· Color del segundo coche: "+coche2.color);
		System.out.println("· Marca del segundo coche: "+coche2.marca);
		System.out.println("· Kilómetros del segundo coche: "+coche2.km);
		
	}
}
