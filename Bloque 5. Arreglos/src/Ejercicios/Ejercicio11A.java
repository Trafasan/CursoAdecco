/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio11A {
/*
 * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los cuardaremos en una tabla de tamaño 10.
 * Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número[]=new int [10], N, posición=0, y=0;
		boolean creciente=true;
		
		do {
			for(int x=0;x<5;x++) {
				System.out.print("Inserte un número ("+(x+1)+"/5): ");
				número[x]=Entrada.nextInt();
			}
			for (int x=0;x<4;x++) {
				if (número[x]<número[x+1]) {creciente=true;}
				else {creciente=false; break;}
			}
			if (creciente==false) {System.out.println("ERROR\nLa serie de números introducida no está ordenada de forma creciente");}
		} while (creciente==false);
		
		System.out.print("Inserte otro número: ");
		N=Entrada.nextInt();
		
		while (número[y]<N && y<5) {posición++; y++;}
		
		for (int x=4; x>=posición; x--) {número[x+1]=número[x];}
		
		número[posición]=N;
		
		System.out.print("Números de la serie ordenados:");
		for (int x=0;x<6;x++) {System.out.print(" "+número[x]);}
		
		Entrada.close();
		
	}
			
		

}
