package com.sandra.fundamentosJava.ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class EjOperadores {
	private static String opcion;
	private static Scanner sc;
	
	public static void ejercicios() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un ejercicio del tema 'Operadores': ", "EJERCICIOS DE OPERADORES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Ejercicio 1" -> ejercicio01();
			case "Ejercicio 2" -> ejercicio02();
			case "Ejercicio 3" -> ejercicio03();
			case "Ejercicio 4" -> ejercicio04();
			case "Ejercicio 5" -> ejercicio05();
			case "Ejercicio 6" -> ejercicio06();
			case "Ejercicio 7" -> ejercicio07();
			case "Ejercicio 8" -> ejercicio08();
			case "Volver atrás" -> MenuUtils.subMenu("Operadores");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void ejercicio01() {
		System.out.println("1. Hacer un programa que calcule e imprima la suma de tres calificaciones.");
		sc = new Scanner(System.in);
		float notaA, notaB, notaC, suma;
		System.out.print("Introduzca sus tres calificaciones: ");
		notaA = sc.nextFloat();
		notaB = sc.nextFloat();
		notaC = sc.nextFloat();
		suma = notaA+notaB+notaC;
		System.out.printf("La suma de sus tres calificaciones es %.2f.\n\n", suma);
	}
	
	private static void ejercicio02() {
		System.out.println("2. Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de "
				+ "sus horas semanales trabajadas y de su salario por hora.");
		sc = new Scanner(System.in);
		System.out.print("Introduzca las horas trabajadas en esta semana: ");
		int horas = sc.nextInt();
		System.out.print("Inserte el salario por hora: ");
		float salario = sc.nextFloat();
		sc.nextLine();
		salario *= horas;
		System.out.printf("Su salario semanal es %.2f€.\n\n", salario);
	}
	
	private static void ejercicio03() {
		System.out.println("3. Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la "
				+ "mitad de lo que poseen Luis y Guillermo juntos. \nHacer un programa que calcule e imprima la cantidad "
				+ "de dinero que tienen entre los tres.");
		sc = new Scanner(System.in);
		float N, dLuis, dJuan, dTotal;
		System.out.print("Introduzca los dólares que tiene Guillermo: ");
		N = sc.nextFloat();
		sc.nextLine();
		dLuis = N/2;
		dJuan = (N+dLuis)/2;
		dTotal = N+dLuis+dJuan;
		System.out.printf("""
				Luis tiene %.2f$.
				Juan tiene %.2f$.
				Entre los tres tienen %.2f$.
				
				""", dLuis, dJuan, dTotal);
	}
	
	private static void ejercicio04() {
		System.out.println("4. Una compañía de venta de coches usados, paga a su personal de ventas un salario de $1000 mensuales, "
				+ "más una comisión de $150 por cada coche vendido, más el 5% del valor de la venta por coche. Cada mes el capturista "
				+ "de la empresa ingresa en el ordenador los datos pertinentes.\n"
				+ "Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.");
		sc = new Scanner(System.in);
		final int salario=1000;
		float valorC, sMes;
		System.out.print("Introduzca el número de coches vendidos: ");
		int nCoches = sc.nextInt();
		System.out.print("Introduzca el valor de venta: ");
		valorC = sc.nextFloat();
		sMes = salario+150*nCoches+valorC*nCoches*0.05f;
		System.out.printf("El salario del empleado es de %.2f$.\n\n", sMes);
	}
	
	private static void ejercicio05() {
		System.out.println("5. La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro "
				+ "aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final.\n"
				+ "Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%...\n"
				+ "Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.");
		sc = new Scanner(System.in);
		System.out.print("Introduzca la nota de participación: ");
		float participacion = sc.nextFloat();
		System.out.print("Introduzca la nota del primer parcial: ");
		float p1 = sc.nextFloat();
		System.out.print("Introduzca la nota del segundo parcial: ");
		float p2 = sc.nextFloat();
		System.out.print("Introduzca la nota del examen final: ");
		float examen = sc.nextFloat();
		sc.nextLine();
		float nota = participacion*0.1f+(p1+p2)*0.25f+examen*0.4f;
		System.out.printf("La calificación obtenida del estudiante es %.2f. Redondeo: %d\n\n", nota, Math.round(nota));
	}

	private static void ejercicio06() {
		System.out.println("6. Hacer un programa que calcule el cuadrado de una suma.");
		sc = new Scanner(System.in);
		System.out.print("Introduzca dos números: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.nextLine();
		double r1 = Math.pow(a+b,2);
		double r2 = Math.pow(a,2)+Math.pow(b,2)+2*a*b;
		System.out.printf("""
				El cuadrado de la suma de %f y %f es:
				· Método 1 [(a+b)^2]: %f
				· Método 1 [a^2+2ab+b^2]: %f
				
				""", a, b, r1, r2);
	}
	
	private static void ejercicio07() {
		System.out.println("7. Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes."
				+ "\nPor ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.");
		sc = new Scanner(System.in);
		System.out.print("Introduzca el número de horas: ");
		int horasTotales = sc.nextInt();
		sc.nextLine();
		int dias = horasTotales/24;
		System.out.printf("%d horas equivalen a %d semanas, %d días y %d horas.\n\n", horasTotales, dias/7, dias%7, horasTotales%24);
	}
	
	private static void ejercicio08() {
		System.out.println("8. Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo "
				+ "grado de coeficientes reales.");
		sc = new Scanner (System.in);
		double a, b, c, x1, x2;
		System.out.print("Introduzca el valor a: ");
		a = sc.nextDouble();
		System.out.print("Introduzca el valor b: ");
		b = sc.nextDouble();
		System.out.print("Introduzca el valor c: ");
		c = sc.nextDouble();
		sc.nextLine();
		x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.printf("""
				El resultado positivo es %f.
				El resultado negativo es %f.
				
				""", x1, x2);
	}
	
}
