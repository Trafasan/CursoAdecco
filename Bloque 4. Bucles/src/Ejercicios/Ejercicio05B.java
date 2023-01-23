/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio05B {
/*
 * Realizar un juego para adivinar un número.
 * Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números indicando "es mayor" o "es menor"
 * según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta ya mostrar el número de intentos.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		
		int N,número,contador=0;
		N=(int) (100*Math.random());
		
		System.out.print("Inserte un número: ");
		número=Entrada.nextInt();
		contador++;
		
		while (número!=N) {
			if (N>número) {
				contador++;
				System.out.print("El número es mayor que "+número+"\nInserte otro número: ");
				número=Entrada.nextInt();
			}
			else {
				contador++;
				System.out.print("El número es menor que "+número+"\nInserte otro número: ");
				número=Entrada.nextInt();
			}
		}
		System.out.println("Enhorabuena, has acertado\nNúmero de intentos: "+contador);
		
		Entrada.close();

	}

}
