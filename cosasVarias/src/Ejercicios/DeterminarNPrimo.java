/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class DeterminarNPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N, resto;
		boolean esPrimo = true;
		System.out.print("Inserte un número: ");
		N=sc.nextInt();
		for (int x=N-1; x>1; x--) {
			while (esPrimo) {
				resto = N%x;
				if(resto == 0) {esPrimo = false;}
			}
		}
		if (esPrimo==false) {System.out.println("El número "+N+" no es un número primo.");}
		else {System.out.println("El número "+N+" es un número primo.");}
		sc.close();
	}
}