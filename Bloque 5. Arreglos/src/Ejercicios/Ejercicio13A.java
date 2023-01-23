/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio13A {
/*
 * Leer 10 números enteros en una tabla.
 * Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int número[]=new int [10], pares[]=new int [10], impares[]=new int [10];
		int p=0, i=0;
		
		System.out.println("Números de la serie");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			número[x]=Entrada.nextInt();
			if (número[x]%2==0) {pares[p]=número[x]; p++;}
			else  {impares[i]=número[x]; i++;}
		}
		
		if (p!=0) {
			System.out.print("\nNúmeros pares insertados:");
			for (int x=0; x<p; x++) {System.out.print(" "+pares[x]);}
		}
		else {System.out.println("\nNo se insertaron números pares.");}
		
		if (i!=0) {
			System.out.print("\nNúmeros impares insertados:");
			for (int x=0; x<i; x++) {System.out.print(" "+impares[x]);}
		}
		else {System.out.println("\nNo se insertaron números impares.");}
		
		Entrada.close();

	}

}
