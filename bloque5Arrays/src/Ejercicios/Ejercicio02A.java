/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio02A {
//Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		float[] números=new float[5];
		for (int x=0;x<5;x++) {
			System.out.print("Inserte un número ("+(x+1)+"/5): ");
			números[x]=Entrada.nextFloat();
		}
		System.out.println("\nLos números son: ");
		for (int x=4;x>=0;x--) {
			System.out.println(" "+números[x]);
		}
		
		Entrada.close();

	}

}
