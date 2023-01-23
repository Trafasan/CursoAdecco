/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio04B {
//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		int número,contador=0;
		System.out.print("Inserte un número: ");
		número=Entrada.nextInt();
		
		while (número>=0) {
			contador++;
			System.out.print("Inserte otro número: ");
			número=Entrada.nextInt();
		}
		System.out.println("Se han introducido "+contador+" número(s) no negativos.");
		
		Entrada.close();

	}

}
