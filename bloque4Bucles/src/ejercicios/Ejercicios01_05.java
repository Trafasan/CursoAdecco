/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios01_05 {
	public static void ejercicio01() {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
		Scanner sc=new Scanner(System.in);
		System.out.print("Inserte un número: ");
		int n = sc.nextInt();
		
		while (n>=0) {
			System.out.println("El cuadrado de "+n+" es "+(int)Math.pow(n, 2));
			System.out.print("Inserte otro número: ");
			n = sc.nextInt();
			}
		sc.close();
	}
	
	public static void ejercicio02() {
		// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int n = sc.nextInt();
		while (n!=0) {
			if (n>0) System.out.println("El número "+n+" es positivo.");
			else System.out.println("El número "+n+" es negativo.");
			System.out.print("Inserte otro número: ");
			n = sc.nextInt();
		}
		sc.close();
	}
	
	public static void ejercicio03() {
		// Leer números hasta que se introduzca un O. Para cada uno indicar si es par o impar.
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int n = sc.nextInt();
		while (n!=0) {
			if (n%2==0) System.out.println("El número "+n+" es par.");
			else System.out.println("El número "+n+" es impar.");
			System.out.print("Inserte otro número: ");
			n = sc.nextInt();
		}
		System.out.println("Hasta pronto :)");
		sc.close();
	}
	
	public static void ejercicio04() {
		// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int n = sc.nextInt();
		int contador=0;
		while (n>=0) {
			contador++;
			System.out.print("Inserte otro número: ");
			n=sc.nextInt();
		}
		System.out.println("Se han introducido "+contador+" número(s) no negativos.");
		sc.close();
	}
	
	public static void ejercicio05() {
		/*
		 * Realizar un juego para adivinar un número.
		 * Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor"
		 * según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta ya mostrar el número de intentos.
		 */
		Scanner sc = new Scanner (System.in);
		int nRandom = (int) ((Math.random() * (101 - 0)) + 0); // Esto genera un número aleatorio entre 0 y 100
		int contador = 0;
		System.out.print("Inserte un número: ");
		int n=sc.nextInt();
		contador++;
		while (n!=nRandom) {
			if (nRandom>n) {
				contador++;
				System.out.print("El número es mayor que "+n+"\nInserte otro número: ");
				n=sc.nextInt();
			}
			else {
				contador++;
				System.out.print("El número es menor que "+n+"\nInserte otro número: ");
				n=sc.nextInt();
			}
		}
		System.out.println("Enhorabuena, has acertado\nNúmero de intentos: "+contador);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio01();
		// ejercicio02();
		// ejercicio03();
		// ejercicio04();
		// ejercicio05();

	}

}
