package com.sandra.fundamentosJava.teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class Bucles {
	private static String opcion;
	private static Scanner sc;
	
	public static void temario() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado del tema 'Bucles': ", "TEORÍA DE BUCLES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Bucle while", "Bucle do...while", "Bucle for"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Bucle while" -> bucleWhile();
			case "Bucle do...while" -> bucleDoWhile();
			case "Bucle for" -> bucleFor();
			case "Volver atrás" -> MenuUtils.subMenu("Bucles");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void bucleWhile() {
		System.out.println("""
				Los bucles son una estructura de control que permite repetir una o varias instrucciones cuantas veces sea necesario,
				Por tanto, ayuda a llevar a cabo una tarea repetitíva en una cantidad de líneas muy pequeña y de forma prácticamente automática.
				El bucle while se ejecuta si se cumplen las condiciones, la cual se comprueba cada vez que se ejecuta el código dentro de este.
				Cabe destacar que el bucle se repetirá infinitamente si la condición es siempre cierta.
				""");
		sc = new Scanner (System.in);
		System.out.print("Introduzca el número final de la serie: ");
		int contador = sc.nextInt();
		sc.nextLine();
		int x=1;
		while (x<=contador) {
			System.out.printf("%d ", x);
			x++;
		}
		System.out.println("\n");
	}
	
	private static void bucleDoWhile() {
		System.out.println("""
				El bucle do...while solo se diferencia del bucle while en el momento de la comprobación de la condición.
				En este bucle, la condición se comprueba tras ejecutar el código dentro de este, por lo que siempre se ejecutará al menos una vez.
				""");
		sc = new Scanner (System.in);
		System.out.print("Introduzca el número final de la serie: ");
		int contador=sc.nextInt();
		int x=1;
		do {
			System.out.printf("%d ", x);
			x+=3;
		} while(x<=contador);
		System.out.println("\n");
	}
	
	private static void bucleFor() {
		System.out.println("""
				El bucle for es una estructura parecida al bucle while ya que se pueden inicializar una o más variables y modificarlas
				en cada iteración junto a la declaración de la concidión. El orden de los valores dentro de los paréntesis es el siguiente:
				1. Se inicializa(n) la(s) variable(s). Las variables se separarán con comas.
				2. Se declara(n) la(s) condición(es).
				3. Se modifica(n) el(los) iterador(es). Esta modificación se realiza al final de cada repetición del bucle.
				Si no se incluyen la inicialización ni la modificación, este bucle se comportará como un bucle while.
				""");
		sc = new Scanner(System.in);
		System.out.print("Introduzca el número final de la serie: ");
		int contador = sc.nextInt();
		sc.nextLine();
		for (int x=2; x<=contador; x+=2) System.out.printf("%d ", x);
		System.out.println("\n");
	}
	

}
