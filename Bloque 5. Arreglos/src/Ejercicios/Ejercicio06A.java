/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio06A {
/*
 * Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma:
 * 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de B, etc.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int j=0, x, tablaA[]=new int [12], tablaB[]=new int [12], tablaC[]=new int [24];
		
		
		System.out.println("Números de la serie A");
		for (x=0; x<12; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/12): ");
			tablaA[x]=Entrada.nextInt();
		}
		
		System.out.println("\nNúmeros de la serie B");
		for (x=0; x<12; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/12): ");
			tablaB[x]=Entrada.nextInt();
		}
		
		x=0;
		while(x<12) {
			for(int i=0; i<3; i++) {tablaC[j]=tablaA[x+i];j++;}
			for(int i=0; i<3; i++) {tablaC[j]=tablaB[x+i];j++;}
			x+=3;
		}
		System.out.print("\nNúmeros ordenados: ");
		for (x=0;x<24;x++) {System.out.print(tablaC[x]+" ");}
		
		Entrada.close();
	}
}