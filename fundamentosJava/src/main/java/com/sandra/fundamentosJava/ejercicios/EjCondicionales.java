package com.sandra.fundamentosJava.ejercicios;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class EjCondicionales {
	private static String opcion;
	
	public static void ejercicios() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un ejercicio del tema 'Condicionales': ", "EJERCICIOS DE CONDICIONALES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6",
										"Ejercicio 7", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Ejercicio 11", "Ejercicio 12",
										"Ejercicio 13", "Ejercicio 14"}, null).toString();
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
			case "Ejercicio 9" -> ejercicio09();
			case "Ejercicio 10" -> ejercicio10();
			case "Ejercicio 11" -> ejercicio11();
			case "Ejercicio 12" -> ejercicio12();
			case "Ejercicio 13" -> ejercicio13();
			case "Ejercicio 14" -> ejercicio14();
			case "Volver atrás" -> MenuUtils.subMenu("Condicionales");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void ejercicio01() {
		JOptionPane.showMessageDialog(null, "Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.",
				"Ejercicio nº1", 3);
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
		if (n%10 == 0) JOptionPane.showMessageDialog(null, "El número es múltiplo de 10.", "Utilizando el condicional if-else...", 1);
		else JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10.", "Utilizando el condicional if-else...", 1);
		JOptionPane.showMessageDialog(null, "El número "+(n%10 != 0 ? "no " : "")+"es múltiplo de 10.", "Utilizando el operador ternario...", 1);
	}
		
	private static void ejercicio02() {
		JOptionPane.showMessageDialog(null, "Pedir dos números y decir cuál es el mayor o si son iguales.", "Ejercicio nº2", 3);
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número: "));
		if (n1>n2) JOptionPane.showMessageDialog(null, n1+" es mayor que "+n2);
		else if (n1<n2) JOptionPane.showMessageDialog(null, n2+" es mayor que "+n1);
		else JOptionPane.showMessageDialog(null, n1+" es igual a "+n2);
	}
		
	private static void ejercicio03() {
		JOptionPane.showMessageDialog(null, "Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.",
				"Ejercicio nº3", 3);
		char caracter = JOptionPane.showInputDialog("Introduzca un caracter: ").charAt(0);
		if (Character.isUpperCase(caracter)) JOptionPane.showMessageDialog(null, caracter+" es una letra mayúscula.",
				"Utilizando el condicional if-else...", 1);
		else JOptionPane.showMessageDialog(null, caracter+" no es una letra mayúscula.",
				"Utilizando el condicional if-else...", 1);
		JOptionPane.showMessageDialog(null, caracter+(Character.isLowerCase(caracter) ? " no" : "")+" es una letra mayúscula.",
				"Utilizando el operador ternario...", 1);
	}
		
	private static void ejercicio04() {
		JOptionPane.showMessageDialog(null, """
				En una tienda se hace un 20% de descuento a los clientes cuya compra supere los 300€.
				¿Cuál será la cantidad que pagará una persona por su compra?""", "Ejercicio nº4", 3);
		float pago = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el valor de su compra: "));
		if(pago<=300) JOptionPane.showMessageDialog(null, "No se le puede aplicar ningún descuento.");
		else {
			JOptionPane.showMessageDialog(null, "Se le va a aplicar el descuento del 20%.");
			pago *= 0.8f;
		}
		JOptionPane.showMessageDialog(null, String.format("Su compra cuesta %.2f€.", pago));
	}
		
	private static void ejercicio05() {
		JOptionPane.showMessageDialog(null, """
				Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
				· Si trabaja 40 o menos se le paga 16€ por hora.
				· Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y $20 por cada hora extra.""", "Ejercicio nº5", 3);
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las horas trabajadas: "));
		horas = (horas<=40) ? horas*16 : 40*16+(horas-40)*20;
		JOptionPane.showMessageDialog(null, String.format("Su salario es de %d€.", horas));
	}
	
	private static void ejercicio06() {
		JOptionPane.showMessageDialog(null, "Hacer un programa que pida dos números y diga si ambos son pares o impares.", "Ejercicio nº6", 3);
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número: "));
		if (n1%2 == 0 && n2%2 == 0) JOptionPane.showMessageDialog(null, "Ambos números son pares");
		else if (n1%2 != 0 && n2%2 != 0) JOptionPane.showMessageDialog(null, "Ambos números son impares");
		else JOptionPane.showMessageDialog(null, "Un número es par y el otro es impar");
	}
	
	private static void ejercicio07() {
		JOptionPane.showMessageDialog(null, "Pedir tres números y mostrarlos ordenados de mayor a menor.", "Ejercicio nº7", 3);
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercer número: "));
		if (n1>n2 && n1>n3) JOptionPane.showMessageDialog(null, String.format("La serie ordenada es %d>%d>%d", n1, n2>n3?n2:n3, n2>n3?n3:n2));
		else if (n2>n1 && n2>n3) JOptionPane.showMessageDialog(null, String.format("La serie ordenada es %d>%d>%d", n2, n1>n3?n1:n3, n1>n3?n3:n1));
		else if (n3>n2 && n3<n1) JOptionPane.showMessageDialog(null, String.format("La serie ordenada es %d>%d>%d", n3, n1>n2?n1:n2, n1>n2?n2:n1));
		else JOptionPane.showMessageDialog(null, "ERROR \nHay dos números o más iguales");
	}
	
	private static void ejercicio08() {
		JOptionPane.showMessageDialog(null, "Pedir un número entre 0 y 99999 y decir cuántas cifras tiene.", "Ejercicio nº8", 3);
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 0 y 99999: "));
		JOptionPane.showMessageDialog(null,  (n>=0 && n<=99999) ? String.format("Número de cifras en %d: %d", n, n.toString().length()) :
			String.format("El número %d no está en el rango establecido.", n));
	}
	
	private static void ejercicio09() {
		JOptionPane.showMessageDialog(null, "Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. "
				+ "Suponiendo que todos los meses son de 30 días.", "Ejercicio nº9", 3);
		int dd = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día: "));
		int mm = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes: "));
		int yyyy = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año: "));
		if (dd < 1 || dd > 30) JOptionPane.showMessageDialog(null, "El día no es válido.", "ERROR", 0);
		else if (mm < 1 || mm > 12) JOptionPane.showMessageDialog(null, "El mes no es válido.", "ERROR", 0);
		else if (yyyy < 1) JOptionPane.showMessageDialog(null, "El año no es válido.", "ERROR", 0);
		else JOptionPane.showMessageDialog(null, String.format("La fecha es %d/%D/%d", dd, mm, yyyy), "Fecha correcta", 1);
	}
	
	private static void ejercicio10() {
		JOptionPane.showMessageDialog(null, "Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. "
				+ "Con meses de 28, 30 y 31 días. Sin años bisiestos.", "Ejercicio nº10", 3);
		int dd = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el día: "));
		int mm = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes: "));
		int yyyy = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año: "));
		if ((dd <= 0 || dd > 31) && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12))
			JOptionPane.showMessageDialog(null, "El día no es válido.", "ERROR", 0);
		else if ((dd <= 0 || dd > 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11))
			JOptionPane.showMessageDialog(null, "El día no es válido.", "ERROR", 0);
		else if ((dd <= 0 || dd > 28) && mm == 2) JOptionPane.showMessageDialog(null, "El día no es válido.", "ERROR", 0);
		else if (mm < 1 || mm > 12) JOptionPane.showMessageDialog(null, "El mes no es válido.", "ERROR", 0);
		else if (yyyy < 1) JOptionPane.showMessageDialog(null, "El año no es válido.", "ERROR", 0);
		else JOptionPane.showMessageDialog(null, String.format("La fecha es %d/%d/%d", dd, mm, yyyy), "Fecha correcta", 1);
	}
	
	private static void ejercicio11() {
		JOptionPane.showMessageDialog(null, """
				Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro
				operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
				El usuario debe especificar la operación con el primer caracter del primer parámentro de la línea de comandos:
				· S o s para la suma
				· R o r para la resta
				· P, p, M o m para el producto
				· D o d para la división""", "Ejercicio nº11", 3);
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número: "));
		char op = JOptionPane.showInputDialog(null, """
				· S o s para la suma
				· R o r para la resta
				· P, p, M o m para el producto
				· D o d para la división
				Introduzca la operación que desea realizar:""", "OPERACIONES", 3).charAt(0);
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número: "));
		switch (op) {
		case 'S', 's' -> JOptionPane.showMessageDialog(null, String.format("%d + %d = %d", n1, n2, n1+n2));
		case 'R', 'r' -> JOptionPane.showMessageDialog(null, String.format("%d - %d = %d", n1, n2, n1-n2));
		case 'P', 'p', 'M', 'm' -> JOptionPane.showMessageDialog(null, String.format("%d · %d = %d", n1, n2, n1*n2));
		case 'D', 'd' -> JOptionPane.showMessageDialog(null, (n2 == 0) ? "No se puede dividir entre cero" :
			String.format("%d / %d = %f\nResto = %d", n1, n2, n1/n2, n1%n2));
		default -> JOptionPane.showMessageDialog(null, "No se reconoce la operación insertada", "ERROR", 0);
		}
	}
	
	private static void ejercicio12() {
		JOptionPane.showMessageDialog(null, "Pedir una nota de 0 a 10 y mostrarla de la forma: "
				+ "Insuficiente, Suficiente, Bien, Notable y Sobresaliente.", "Ejercicio nº12", 3);
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzca su nota:"));
		if (nota>=0 && nota<5) JOptionPane.showMessageDialog(null, String.format("%.2f: Insuficiente", nota));
		else if (nota>=5 && nota<6) JOptionPane.showMessageDialog(null, String.format("%.2f: Suficiente", nota));
		else if (nota>=6 && nota<7) JOptionPane.showMessageDialog(null, String.format("%.2f: Bien", nota));
		else if (nota>=7 && nota<9) JOptionPane.showMessageDialog(null, String.format("%.2f: Notable", nota));
		else if (nota>=9 && nota<=10) JOptionPane.showMessageDialog(null, String.format("%.2f: Sobresaliente", nota));
		else JOptionPane.showMessageDialog(null, "La nota insertada no es válida.", "ERROR", 0);
	}
	
	private static void ejercicio13() {
		JOptionPane.showMessageDialog(null, """
				Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
				1. Ingresar dinero a la cuenta
				2. Retirar dinero de la cuenta
				3. Salir""", "Ejercicio nº13", 3);
		int dinero;
		float saldo = 1000;
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, String.format("""
				Su saldo actual es de %.2f€.
				Introduzca la operación deseada:
				1. Ingresar dinero a la cuenta
				2. Sacar dinero de la cuenta
				3. Salir"
				""", saldo), "Bienvenido :)", 1));
		switch (op) {
		case 1 -> {
			dinero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dinero que desea ingresar: "));
			if (dinero>0) JOptionPane.showMessageDialog(null, String.format("Su saldo actual es de %.2f€.", saldo+=dinero));
			else JOptionPane.showMessageDialog(null, "No se pudo completar la operación", "ERROR", 0);
		}
		case 2 -> {
			dinero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dinero que desea sacar: "));
			if (dinero>0 && dinero<=saldo) JOptionPane.showMessageDialog(null, String.format("Su saldo actual es de %.2f€.", saldo-=dinero));
			else JOptionPane.showMessageDialog(null, "No se pudo completar la operación", "ERROR", 0);
		}
		case 3 -> JOptionPane.showMessageDialog(null, "Hasta pronto :)");
		default -> JOptionPane.showMessageDialog(null, "No se reconoció la operación", "ERROR", 0);
		}
	}
	
	private static void ejercicio14() {
		JOptionPane.showMessageDialog(null, "Hacer un programa que pase de kg a otra unidad de medida de masa, "
				+ "mostrar en pantalla un menú con las opciones posibles.", "Ejercicio nº14", 3);
		double kg = Double.parseDouble(JOptionPane.showInputDialog("Inserte la masa en kilogramos: "));
		int op = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "CONVERSIÓN DE UNIDADES", 0, 3, null,
				new Object[] {"Hectogramo", "Decagramo", "Gramo", "Decigramo", "Centigramo", "Miligramo"}, null);
		switch(op) {
		case 0 -> JOptionPane.showMessageDialog(null, String.format("%f kg son %f hg", kg, kg*10));
		case 1 -> JOptionPane.showMessageDialog(null, String.format("%f kg son %f dag", kg, kg*100));
		case 2 -> JOptionPane.showMessageDialog(null, String.format("%f kg son %f g", kg, kg*1000));
		case 3 -> JOptionPane.showMessageDialog(null, String.format("%f kg son %f dg", kg, kg*10000));
		case 4 -> JOptionPane.showMessageDialog(null, String.format("%f kg son %f cg", kg, kg*100000));
		case 5 -> JOptionPane.showMessageDialog(null, String.format("%f kg son %f mg", kg, kg*1000000));
		default -> JOptionPane.showMessageDialog(null, "Comando no reconocido", "ERROR", 0);
		}
	}

}
