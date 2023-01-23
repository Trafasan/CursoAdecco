/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio05A {
/*
 * Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma:
 * el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int[] númeroA= new int [10], númeroB= new int [10], tabla= new int [20];
		
		System.out.println("Números de la serie A");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			númeroA[x]=Entrada.nextInt();
		}
		
		System.out.println("\nNúmeros de la serie B");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			númeroB[x]=Entrada.nextInt();
		}
		
		int j=0;
		for(int x=0; x<10; x++) {tabla[j]=númeroA[x]; j++; tabla[j]=númeroB[x];j++;}
		
		System.out.print("\nNúmeros ordenados: ");
		for (int x=0;x<20;x++) {System.out.print(tabla[x]+" ");}
		
		Entrada.close();

	}

}
