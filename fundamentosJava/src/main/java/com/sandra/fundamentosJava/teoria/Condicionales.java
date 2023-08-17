package com.sandra.fundamentosJava.teoria;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class Condicionales {
	private static String opcion;
	
	public static void temario() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado del tema 'Condicionales': ", "TEORÍA DE CONDICIONALES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"If-else", "Operador ternario", "Condicional switch"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "If-else" -> ifElse();
			case "Operador ternario" -> operadorTernario();
			case "Condicional switch" -> condicionalSwitch();
			case "Volver atrás" -> MenuUtils.subMenu("Condicionales");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void ifElse() {
		System.out.println("""
				Los condicionales son una estructura de control que permite determinar qué acciones llevar a cabo según ciertas condiciones.
				Estas condiciones pueden ser variables booleanas, funciones que generen un boolean o comparaciones con los siguientes operadores:
				· = es el operador de asignación, mientras que == es el operador de igualdad
				· != es el operador de desigualdad
				· > es el operador de mayor que, mientras que < es el operador de menor que
				· >= es el operador de mayor o igual a, mientras que <= es el operador de menor o igual a
				El condicional más simple es el if-else. Si la condición del if se cumple, se ejecuta el código dentro del condicional.
				Si no se cumple, se ejecuta el cógido dentro del else. No es obligatorio añadir esta parte.
				Además, se pueden concatear diferentes condiciones usando else if, y se comprobarán en orden cada condición hasta llegar al else.
				""");
		int n, dato = 5;
		n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
		if (n < dato) JOptionPane.showMessageDialog(null, "El número es menor a 5");
		else if (n > dato) JOptionPane.showMessageDialog(null, "El número es mayor que 5");
		else JOptionPane.showMessageDialog(null, "El número es igual a 5");
	}
	
	private static void operadorTernario() {
		System.out.println("""
				El operador ternario simplifica el condicional if-else, pero no lo puede sustituir ya que este condicional
				solo se puede utilizar para cambiar el valor de una variable o parámetro dependiendo de la condición.
				""");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
		JOptionPane.showMessageDialog(null, "El número "+n+" es "+(n%2 == 0 ? "par" : "impar"));
	}
	
	private static void condicionalSwitch() {
		System.out.println("""
				En el condicional switch, se evalúa una variable y, dependiendo de su valor, se realizarán diferentes acciones.
				Cuando el valor coincide con un case, se ejecuta el código de ese case y de los siguientes
				Para evitar este comportamento, se debe poner un break al final del código del case. No hace falta especificarlo en todos los casos.
				Se puede especificar la cláusula default que se ejecutará cuando el valor de la variable no coincida con los casos designados.
				Por último, se pueden declarar estas cláusulas de dos maneras:
				· Usando los dos puntos (case 'valor': ...).
				· Usando la flecha (case 'valor'-> ...). En este caso queda implícito el break.
				Se deben declarar todas las cláusulas de la misma manera.
				""");
		int dato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 1 y 5: "));
		switch(dato) {
		case 1: JOptionPane.showMessageDialog(null, "El número introducido es 1");
		break;
		case 2: JOptionPane.showMessageDialog(null, "El número introducido es 2");
		break;
		case 3: JOptionPane.showMessageDialog(null, "El número introducido es 3");
		break;
		case 4: JOptionPane.showMessageDialog(null, "El número introducido es 4");
		break;
		case 5: JOptionPane.showMessageDialog(null, "El número introducido es 5");
		break;
		default: JOptionPane.showMessageDialog(null, "El número no está en el rango indicado");
		}
		
		switch(dato) {
		case 1, 3, 5 -> JOptionPane.showMessageDialog(null, "El número introducido es impar");
		case 2, 4 -> JOptionPane.showMessageDialog(null, "El número introducido es par");
		default -> JOptionPane.showMessageDialog(null, "El número no está en el rango indicado");
		}
	}
	

}
