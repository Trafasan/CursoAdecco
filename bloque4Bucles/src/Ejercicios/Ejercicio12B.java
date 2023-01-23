/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio12B {
//Pedir un número y calcular su factorial.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int N; long factorial=1;
		
		System.out.print("Inserte un número: ");
		N=Entrada.nextInt();
		
		for (int x=1;x<=N;x++) {factorial*=x;}
		System.out.println("El factorial de "+N+" es "+factorial+'.');
		
		Entrada.close();
		
	}

}
