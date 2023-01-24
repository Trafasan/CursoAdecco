/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios21_22 {
	public static void ejercicio21() {
		// Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
		Scanner sc = new Scanner (System.in);
		boolean negativo=false;
		for (int x=1;x<=10;x++) {
			System.out.print("Inserte un número ("+x+"/10): ");
			int n = sc.nextInt();
			if (n<0) negativo=true;
		}
		if (negativo==true) System.out.println("\nSe ha introducido al menos un número negativo.");
		else System.out.println("\nNo se han introducido números negativos.");
		sc.close();
	}
	
	public static void ejercicio22() {
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		Scanner sc = new Scanner (System.in);
		float nota;
		boolean suspensos=false;
		for (int x=1; x<=5; x++) {
			do {
				System.out.print("Inserte una calificación ("+x+"/5): ");
				nota = sc.nextFloat();
			} while (nota<0 || nota>10);
			if (nota<5) suspensos=true;
		}
		if (suspensos==true) System.out.println("\nHay uno o más suspendidos.");
		else System.out.println("\nNo hay ningún suspendido.");
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio21();
		// ejercicio22();

	}

}
