/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio14B {
//Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de $1000.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int contador=0,mil=0; float sueldo,suma=0;
		while (contador<10) {
			System.out.print("Inserte un sueldo ("+(contador+1)+"/10): ");
			sueldo=Entrada.nextInt();
			contador++;suma+=sueldo;
			if (sueldo>1000){mil++;}
			else {}
		}
		System.out.println("La suma de los 10 sueldos es: $"+suma+"\nHay "+mil+" sueldos mayores de $1000.");
		
		Entrada.close();
		
	}

}
