package Teoría;
/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class DatosPrimitivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte númeroA=13;
		System.out.println("Número entero: "+númeroA);
		/*
		 * La variable byte tiene como rango (-128,127).
		 * El espacio en memoria de byte es de 8 bits.
		 */
		short númeroB=-20913;
		System.out.println("Número entero: "+númeroB);
		/*
		 * La variable short tiene como rango (-32.768,32.767).
		 * El espacio en memoria de short es de 16 bits.
		 */
		int númeroC=1679420913;
		System.out.println("Número entero: "+númeroC);
		/*
		 * La variable int tiene como rango (-2.147.483.648,2.147.483.647).
		 * El espacio en memoria de int es de 32 bits.
		 */
		long númeroD=-2079420913;
		System.out.println("Número entero: "+númeroD);
		/*
		 * La variable long tiene como rango (-9.223.372.036.854.775.808,9.223.372.854.775.807).
		 * El espacio en memoria de long es de 64 bits.
		 */
		float decimalA=3.14f; //Es importante poner la f ya que daría error si faltase
		System.out.println("Número decimal: "+decimalA);
		/*
		 * La variable float tiene como rango (1,4e-45,3,4e38).
		 * El espacio en memoria de float es de 32 bits.
		 */
		double decimalB=3.14159265;
		System.out.println("Número decimal: "+decimalB);
		/*
		 * La variable double tiene como rango (4,9e-324,1,8e308).
		 * El espacio en memoria de float es de 64 bits.
		 */
		char Letra='J';
		System.out.println("Letra: "+Letra);
		char Número='2';
		System.out.println("Número: "+Número);
		char Símbolo='$';
		System.out.println("Símbolo: "+Símbolo);
		//Cuando solo es un caracter, se utiliza una coma 
		boolean DecisiónA=true;
		System.out.println("La decisión es: "+DecisiónA);
		boolean DecisiónB=false;
		System.out.println("La decisión es: "+DecisiónB);
	}

}
