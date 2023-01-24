package clasesYObjetos;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("Alejandro", 21);
		p1.correr();
		System.out.print("\n");
		Persona p2 = new Persona("12345678A");
		p2.correr(100);
		System.out.print("\n");
		Coche coche1 = new Coche("Blanco", "Audi", 0);
		coche1.datosCoche(coche1);
		System.out.print("\n");
		Coche coche2 = new Coche("Rojo", "Ferrari", 100);
		coche2.datosCoche(coche2);
	}

}
