/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio09A {
/*
 * Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo:
 * el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int números[]=new int [10];
		
		System.out.println("Números de la serie");
		for (int x=0;x<10;x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			números[x]=Entrada.nextInt();
		}
		System.out.print("Números de la serie ordenados:");
		for (int x=0;x<10;x++) {
			int y=x-1; if (y==-1) {y=9;}
			System.out.print(" "+números[y]);
		}
		
		Entrada.close();

	}

}
