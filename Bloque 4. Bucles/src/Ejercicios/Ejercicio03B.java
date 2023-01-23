/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio03B {
//Leer números hasta que se introduzca un O. Para cada uno indicar si es par o impar.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		int número;
		System.out.print("Inserte un número: ");
		número=Entrada.nextInt();
		
		while (número!=0) {
			if (número%2==0) {
				System.out.println("El número "+número+" es par.");
			}
			else {
				System.out.println("El número "+número+" es impar.");
			}
			System.out.print("Inserte otro número: ");
			número=Entrada.nextInt();
		}
		System.out.println("Hasta pronto :)");
		
		Entrada.close();

	}

}
