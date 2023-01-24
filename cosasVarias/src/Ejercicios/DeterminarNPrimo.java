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
	public static void nPrimo() {
		Scanner sc = new Scanner (System.in);
		boolean esPrimo = true;
		System.out.print("Inserte un número: ");
		int N = sc.nextInt();
		for (int x=2; x<(N/2) && esPrimo; x++) if(N%x == 0) esPrimo = false;
		System.out.println(esPrimo ? "El número "+N+" es un número primo." : "El número "+N+" no es un número primo.");
		sc.close();
	}
	
	public static void nPrimoConBreak() {
		Scanner sc = new Scanner (System.in);
		boolean esPrimo = true;
		System.out.print("Inserte un número: ");
		int N = sc.nextInt();
		for (int x=2; x<(N/2); x++) {
			if(N%x == 0) {
				esPrimo = false;
				break;
			}
		}
		System.out.println(esPrimo ? "El número "+N+" es un número primo." : "El número "+N+" no es un número primo.");
		sc.close();
	}
	
	public static void main(String[] args) {
		nPrimo();
		nPrimoConBreak();
	}
}