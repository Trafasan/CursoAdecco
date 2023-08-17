package com.sandra.fundamentosJava.teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class Operadores {
	private static String opcion;
	private static Scanner sc;
	
	public static void temario() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado del tema 'Operadores': ", "TEORÍA DE OPERADORES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Operadores aritméticos", "Operadores de asignación", "Incremento y detrimento",
										"Clase Math"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Operadores aritméticos" -> operadoresAritmeticos();
			case "Operadores de asignación" -> operadoresDeAsignacion();
			case "Incremento y detrimento" -> incrementoDetrimento();
			case "Clase Math" -> claseMath();
			case "Volver atrás" -> MenuUtils.subMenu("Operadores");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void operadoresAritmeticos() {
		sc = new Scanner(System.in);		
		System.out.print("""
				Se pueden insertar los números de dos maneras:
				· Introduciendo los dos juntos separados por un espacio
				· Introduciendo uno presionando luego Enter, e insertar después el siguiente
				Introduzca dos números:\s""");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Las operaciones aritméticas en Java son las siguientes:");
		System.out.printf("· La suma se declara con el símbolo '+'. El resultado de '%f+%f' es '%f'\n", n1, n2, n1+n2);
		System.out.printf("· La resta se declara con el símbolo '-'. El resultado de '%f-%f' es '%f'\n", n1, n2, n1-n2);
		System.out.printf("· La multiplicación se declara con el símbolo '*'. El resultado de '%f*%f' es '%f'\n", n1, n2, n1*n2);
		System.out.print("· La división se declara con el símbolo '/'. Si se intenta dividir entre cero, salta un error.");
		if (n2 != 0) System.out.printf(" El resultado de '%f/%f' es '%f'\n", n1, n2, n1/n2);
		else System.out.println(" Como el segundo número es 0, no se realiza la división");
		System.out.print("· Se puede obtener el resto de las divisiones con el símbolo '%'. También salta error si la división es entre cero.");
		if (n2 != 0) System.out.printf(" El resto de la anterior división es '%f'\n", n1, n2, n1%n2);
		else System.out.println(" Como el segundo número es 0, no se puede obtener el resto\n");
	}
	
	private static void operadoresDeAsignacion() {
		int n1 = 10;
		n1 += 5;
		int suma = n1 + 5;
		System.out.printf("""
				Los operadores de asignación permiten realizar una operación y almacenar su resultado en la variable inicial.
				Puede ser una alternativa a la asignación de la operación a una nueva variable si no se quiere conservar la variable.
				Por ejemplo, se ha declarado una variable de tipo int cuyo valor es 10:
				· Para empezar, se ha utilizado el operador de asignación +=. La suma con el número 5 es %d
				· Si se intenta declarar una nueva variable con la suma de esa variable y 5, el resultado es %d
				
				""", n1, suma);
	}
	
	private static void incrementoDetrimento() {
		int a = 5, b = 5;
		a++;
		b--;
		System.out.printf("""
				Una manera más rápida de aumentar o disminuir un número en una unidad es utilizando los operadores '++' o '--', respectivamente.
				Si se declaran dos variables de tipo int con valor 5:
				· Usando el operador de incremento, el resultado es %d
				· Usando el operador de detrimento, el resultado es %d
				""", a, b);
		
		int x=5, y;
		y = ++x;
		System.out.printf("""
				El orden de estos operadores afecta a su comportamiento:
				· Si el operador se escribe antes que la variable, se produce la operación antes que la asignación.
				· Si el operador se escribe después que la variable, se produce la asignación antes que la operación.
				Si se declara una variable 'x' de tipo int con valor 5 y se declara otra con valor '++x':
				· El valor de la variable 'x' es %d
				· El valor de la variable 'y' es %d
				
				""", x, y);
	}
	
	private static void claseMath() {
		System.out.printf("""
				Con la clase Math se pueden realizar más operaciones. Algunas de ellas son las siguientes:
				· Raíz cuadrada [Math.sqrt(n)]: Por ejemplo, la raíz cuadrada de 9 es %f.
				· Elevar a un exponente [Math.pow(base, exp)]: Por ejemplo, 5 al cuadrado es %f.
				· Redondear [Math.round(n)]: Por ejemplo, 4.56 redondeado es %d.
				· Generar un número aleatorio [Math.random()]: El número aleatorio es %f.
				
				""", Math.sqrt(9), Math.pow(5, 2), Math.round(4.56), Math.random());
	}
	
}
