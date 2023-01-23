/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio22B {
//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		float nota; boolean suspensos=false;
		
		for (int x=1; x<=5; x++) {
			do {
				System.out.print("Inserte una calificación ("+x+"/5): ");
				nota=Entrada.nextFloat();
			} while (nota<0 || nota>10);
			if (nota<5) {suspensos=true;}
		}
		if (suspensos==true){System.out.println("\nHay uno o más suspendidos.");}
		else {System.out.println("\nNo hay ningún suspendido.");}
		
		Entrada.close();

	}

}
