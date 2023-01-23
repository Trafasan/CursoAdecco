/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio07B {
//Pedir números hasta que se introduzca uno negativo, y calcular la media.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		int número, contador=0, suma=0;
		
		System.out.print("Inserte un número: ");
		número=Entrada.nextInt();
		
		while (número>=0) {
			contador++; suma+=número;
			System.out.print("Inserte otro número: ");
			número=Entrada.nextInt();
		}
		if (contador!=0) {
			float media=suma/contador;
			System.out.println("La media de todos los números insertados es "+media);
		}
		else {
			System.out.println("ERROR\nNo se puede dividir entre 0");
		}
		
		Entrada.close();

	}

}
