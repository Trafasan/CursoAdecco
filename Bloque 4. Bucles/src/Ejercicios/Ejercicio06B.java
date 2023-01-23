/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio06B {
//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		int número,suma=0;
		
		System.out.print("Inserte un número :");
		número=Entrada.nextInt();
		
		while (número!=0) {
			suma+=número;
			System.out.print("Inserte otro número: ");
			número=Entrada.nextInt();
		}
		System.out.println("La suma de todos los datos introducidos es "+suma);
		
		Entrada.close();

	}

}
