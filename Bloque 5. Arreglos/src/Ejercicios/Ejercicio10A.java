/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio10A {
// Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo (N es digitado por el usuario).
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int números[]=new int [10], último, N;
		
		System.out.println("Números de la serie");
		for (int x=0;x<10;x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			números[x]=Entrada.nextInt();
		}
		System.out.print("\nInserte el número de desplazamientos: ");
		N=Entrada.nextInt();
		
		for(int y=1;y<=N;y++) {
			último= números[9];
			for (int x=8; x>=0;x--) {números[x+1]=números[x];}
			números[0]=último;
		}
		
		System.out.print("Números de la serie ordenados:");
		for (int x=0;x<10;x++) {System.out.print(" "+números[x]);}
		
		Entrada.close();

	}

}
