/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio08A {
/*
 * Diseñar una aplicación que declare una tabla de 10 elementos enteros.
 * Leer mediante el teclado 8 números.
 * Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detras.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		int número[]=new int [10];
		
		System.out.println("Números de la serie");
		for (int x=0;x<8;x++) {
			System.out.print("Inserte un número ("+(x+1)+"/8): ");
			número[x]=Entrada.nextInt();
		}
		System.out.print("\nInserte un nuevo número: ");
		int Nnuevo=Entrada.nextInt();
		System.out.print("Inserte su posición: ");
		int y=Entrada.nextInt(); y--;
		
		for (int x=7;x>=y;x--) {número[x+1]=número[x];}
		número[y]=Nnuevo;
		System.out.print("\nLa nueva serie es: ");
		for (int x=0;x<9;x++) {System.out.print(número[x]);}
		 
		 Entrada.close();
		
	}
	

}
