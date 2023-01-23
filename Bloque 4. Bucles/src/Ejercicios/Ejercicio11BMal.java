/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio11BMal {
//Diseñar un programa que muestre el producto de los 10 primeros números impares.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número,contador=0,mult=1;
		
		while (contador<10) {
			System.out.print("Inserte un número impar ("+(contador+1)+"/10): ");
			número=Entrada.nextInt();
			if (número%2!=0) {contador++; mult*=número;}
		}
		System.out.println("El producto de los 10 números impares es "+mult+'.');
		
		Entrada.close();

	}

}
