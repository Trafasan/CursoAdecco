/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio12A {
/*
 * Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9).
 * Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada= new Scanner (System.in);
		int número[]=new int [10], posición;
		
		System.out.println("Números de la serie");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			número[x]=Entrada.nextInt();
		}
		
		do {
			System.out.print("\nInserte la posición del número a eliminar (del 0 al 9): ");
			posición=Entrada.nextInt();
		} while (posición<0 || posición>9);
		
		for (int x=posición; x<9; x++) {número[x]=número[x+1];}
		
		System.out.print("Serie nueva:");
		for (int x=0;x<9;x++) {System.out.print(" "+número[x]);}
		
		Entrada.close();

	}

}
