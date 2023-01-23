/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio02B {
//Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		int número;
		System.out.print("Inserte un número: ");
		número=Entrada.nextInt();
		
		while (número!=0) {
			if (número>0) {
				System.out.println("El número "+número+" es positivo.");
			}
			else {
				System.out.println("El número "+número+" es negativo.");
			}
			System.out.print("Inserte otro número: ");
			número=Entrada.nextInt();
		}
		
		Entrada.close();

	}

}
