/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio08B {
//Pedir un número N, y mostrar todos los números del 1 al N.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número=1,N;
		
		System.out.print("Inserte un número: ");
		N=Entrada.nextInt();
		
		while (número<=N) {
			System.out.println(número);
			número++;
		}
		
		Entrada.close();

	}

}
