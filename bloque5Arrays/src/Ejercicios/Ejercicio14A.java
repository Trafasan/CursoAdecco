/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio14A {
/*
 * Leer dos series de 10 enteros, que estarán ordenados crecientemente.
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int serieA[]=new int [10], serieB[]=new int[10];
		boolean crecienteA=true, crecienteB=true;
		
		System.out.println("Números de la serie A");
		do {
			for(int x=0;x<10;x++) {
				System.out.print("Inserte un número ("+(x+1)+"/10): ");
				serieA[x]=Entrada.nextInt();
			}
			for (int x=0;x<9;x++) {
				if (serieA[x]<serieA[x+1]) {crecienteA=true;}
				else {crecienteA=false; break;}
			}
			if (crecienteA==false) {System.out.println("\nERROR\nLa serie de números introducida no está ordenada de forma creciente\n");}
		} while (crecienteA==false);
		
		System.out.println("\nNúmeros de la serie B");
		do {
			for(int x=0;x<10;x++) {
				System.out.print("Inserte un número ("+(x+1)+"/10): ");
				serieB[x]=Entrada.nextInt();
			}
			for (int x=0;x<9;x++) {
				if (serieB[x]<serieB[x+1]) {crecienteB=true;}
				else {crecienteB=false; break;}
			}
			if (crecienteB==false) {System.out.println("\nERROR\nLa serie de números introducida no está ordenada de forma creciente\n");}
		} while (crecienteB==false);
		
		int serieC[]=new int [20], a=0, b=0, c=0;
		while (a<10 && b<10) {
			if (serieA[a]<serieB[b]) {serieC[c]=serieA[a]; a++;}
			else {serieC[c]=serieB[b]; b++;}
			c++;
		}
		
		if (a==10) {while (b<10) {serieC[c]=serieB[b]; b++; c++;}}
		else {while (a<10) {serieC[c]=serieA[a]; a++; c++;}}
		
		System.out.print("\nSerie ordenada:");
		for (int x=0;x<20;x++) {System.out.print(" "+serieC[x]);}
		
		Entrada.close();

	}

}
