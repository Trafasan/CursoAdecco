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
		Scanner Entrada = new Scanner (System.in);
		int N, resto;
		boolean Primo = true;
		System.out.print("Inserte un número: ");
		N=Entrada.nextInt();
		for (int x=N-1; x>1; x--) {
			resto = N%x;
			if(resto == 0) {Primo = false;}
		}
		if (Primo==false) {System.out.println("El número "+N+" no es un número primo.");}
		else {System.out.println("El número "+N+" es un número primo.");}
		Entrada.close();
	}
}