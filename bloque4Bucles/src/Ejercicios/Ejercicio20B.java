/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio20B {
//Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int N, sueldo, Max=0;
		System.out.print("Inserte la cantidad de sueldos a introducir: ");
		N=Entrada.nextInt();
		
		for (int x=1;x<=N;x++) {
			System.out.print("Inserte un sueldo ("+x+"/"+N+"): ");
			sueldo=Entrada.nextInt();			
			Max=Math.max(sueldo, Max);
		}
		System.out.println("El sueldo máximo es de $"+Max);
		
		Entrada.close();
		
	}

}
