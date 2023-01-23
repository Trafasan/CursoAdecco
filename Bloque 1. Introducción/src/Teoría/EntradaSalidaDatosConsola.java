package Teoría;
import java.util.Scanner;//Esta línea es vital para usar la clase Scanner

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class EntradaSalidaDatosConsola {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner EntradaE = new Scanner(System.in);
		int NúmeroE;
		System.out.print("Inserte un número entero: ");
		NúmeroE=EntradaE.nextInt();
		System.out.println("El número es: "+NúmeroE);
		
		EntradaE.close();
	
		Scanner EntradaD = new Scanner(System.in);
		float NúmeroD;
		System.out.print("Inserte un número decimal: ");
		/*
		 * Al meter en la consola el número decimal, hay que ponerlo con una coma.
		 * Si se pone un punto, la consola da error.
		 */
		NúmeroD=EntradaD.nextFloat();
		System.out.println("El número es: "+NúmeroD);
		
		EntradaD.close();
		
		Scanner EntradaC=new Scanner(System.in);
		String Cadena;
		System.out.print("Inserte una palabra: ");
		Cadena=EntradaC.next();//Esta acción guarda la cadena hasta el primer espacio que encuentre
		System.out.println("La palabra es: "+Cadena);
		
		EntradaC.close();
		
		Scanner EntradaCE=new Scanner(System.in);
		String CadenaE;
		System.out.print("Inserte una cadena: ");
		CadenaE=EntradaCE.nextLine();//Esta acción guarda la cadena entera
		System.out.println("La cadena es: "+CadenaE);
		
		EntradaCE.close();
		
		Scanner EntradaL=new Scanner(System.in);
		char Letra;
		System.out.print("Inserte una letra: ");
		Letra=EntradaL.next().charAt(0);//La última parte de la línea permite guardar solo el primer caracter
		System.out.println("La letra es: "+Letra);
		
		EntradaL.close();
		
	}
	

}
