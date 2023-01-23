/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio01B {
//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		int número;
		
		System.out.print("Inserte un número: ");
		número=Entrada.nextInt();
		
		while (número>=0) {
			System.out.println("El cuadrado de "+número+" es "+(int)Math.pow(número, 2));
			
			System.out.print("Inserte otro número: ");
			número=Entrada.nextInt();
			}
		
		Entrada.close();

	}

}
