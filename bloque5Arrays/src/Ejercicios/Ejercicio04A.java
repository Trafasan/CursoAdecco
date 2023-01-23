/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio04A {
/*
 * Leer 10 números enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int[] número=new int [10];
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			número[x]=Entrada.nextInt();
		}
		System.out.println("La serie de números es: ");
		for (int x=0; x<5; x++) {
			System.out.println(número[x]);
			System.out.println(número[9-x]);
		}
		
		Entrada.close();

	}

}
