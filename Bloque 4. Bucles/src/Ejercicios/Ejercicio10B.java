/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio10B {
//Pedir 10 números y escribir la suma total.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número,suma=0,contador=0;
		
		do {
			System.out.print("Inserte un número ("+(contador+1)+"/10): ");
			número=Entrada.nextInt();
			contador++; suma+=número;
		} while (contador<10);
		System.out.println("La suma de los 10 números es "+suma+'.');
		
		Entrada.close();

	}

}
