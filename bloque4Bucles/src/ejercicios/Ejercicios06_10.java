/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios06_10 {
	public static void ejercicio06() {
		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		Scanner sc =new Scanner (System.in);
		System.out.print("Inserte un número :");
		int n = sc.nextInt();
		int suma = 0;
		while (n!=0) {
			suma+=n;
			System.out.print("Inserte otro número: ");
			n = sc.nextInt();
		}
		System.out.println("La suma de todos los datos introducidos es "+suma);
		sc.close();
	}
	
	public static void ejercicio07() {
		// Pedir números hasta que se introduzca uno negativo, y calcular la media.
		Scanner sc=new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int n = sc.nextInt();
		int contador=0, suma=0;
		while (n>=0) {
			contador++;
			suma+=n;
			System.out.print("Inserte otro número: ");
			n=sc.nextInt();
		}
		if (contador!=0) {
			float media=suma/contador;
			System.out.println("La media de todos los números insertados es "+media);
		}
		else System.out.println("ERROR\nNo se puede dividir entre 0");
		sc.close();
	}
	
	public static void ejercicio08() {
		// Pedir un número N, y mostrar todos los números del 1 al N.
		Scanner sc=new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int num = sc.nextInt();
		int n1=1;
		while (n1<=num) {
			System.out.println(n1);
			n1++;
		}
		sc.close();
	}
	
	public static void ejercicio09() {
		// Escribir todos los números del 100 al 0 de 7 en 7.
		for (int n=100;n>=0;n-=7) {
			System.out.println(n);
		}
	}
	
	public static void ejercicio10() {
		// Pedir 10 números y escribir la suma total.
		Scanner sc=new Scanner (System.in);
		int suma=0, contador=0;
		do {
			System.out.print("Inserte un número ("+(contador+1)+"/10): ");
			int n = sc.nextInt();
			contador++;
			suma+=n;
		} while (contador<10);
		System.out.println("La suma de los 10 números es "+suma+'.');
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio06();
		// ejercicio07();
		// ejercicio08();
		// ejercicio09();
		// ejercicio10();

	}

}
