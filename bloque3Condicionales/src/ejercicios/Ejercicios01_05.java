/**
 * 
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Ejercicios01_05 {
	public static void ejercicio01() {
		// Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
		int n = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));
		if (n%10==0) JOptionPane.showMessageDialog(null, "El número es múltiplo de 10.");
		else JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10.");
	}
	
	public static void ejercicio01Ternario() {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));
		JOptionPane.showMessageDialog(null, (n%10==0) ? "El número es múltiplo de 10." : "El número no es múltiplo de 10.");
	}
	
	public static void ejercicio02() {
		// Pedir dos números y decir cuál es el mayor o si son iguales.
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número: "));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número: "));
		if (n1>n2) JOptionPane.showMessageDialog(null, n1+" es mayor que "+n2);
		else if (n1<n2) JOptionPane.showMessageDialog(null, n2+" es mayor que "+n1);
		else JOptionPane.showMessageDialog(null, n1+" es igual a "+n2);
	}
	
	public static void ejercicio03() {
		// Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
		char caracter=JOptionPane.showInputDialog("Inserte un caracter: ").charAt(0);
		if(Character.isUpperCase(caracter)) JOptionPane.showMessageDialog(null, caracter+" es una letra mayúscula.");
		else JOptionPane.showMessageDialog(null, caracter+" no es una letra mayúscula.");
	}
	
	public static void ejercicio03Ternario() {
		char caracter=JOptionPane.showInputDialog("Inserte un caracter: ").charAt(0);
		JOptionPane.showMessageDialog(null, (Character.isUpperCase(caracter)) ? caracter+" es una letra mayúscula." : caracter+" no es una letra mayúscula.");
	}
	
	public static void ejercicio04() {
		/*
		 * En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
		 * ¿Cuál será la cantidad que pagará una persona por su compra?
		 */
		float pagoT=Float.parseFloat(JOptionPane.showInputDialog("Valor de su compra: "));
		float pagoD=pagoT*0.8f;
		if(pagoT<=300) JOptionPane.showMessageDialog(null, "No se le puede aplicar ningún descuento.");
		else JOptionPane.showMessageDialog(null, "Se le aplica un descuento del 20%.\nEl valor de su compra pasa a ser de "+pagoD+" $.");
	}
	
	public static void ejercicio04Ternario() {
		float pagoT=Float.parseFloat(JOptionPane.showInputDialog("Valor de su compra: "));
		float pagoD=pagoT*0.8f;
		JOptionPane.showMessageDialog(null, (pagoT<=300) ? "No se le puede aplicar ningún descuento." : "Se le aplica un descuento del 20%."
				+ "\nEl valor de su compra pasa a ser de "+pagoD+" $.");
	}
	
	public static void ejercicio05() {
		/*
		 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		 * Si trabaja 40 o menos se le paga $16 por hora.
		 * Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		 */
		int HH=Integer.parseInt(JOptionPane.showInputDialog("Inserte las horas trabajadas: "));
		if (HH<=40) {
			HH*=16;
			JOptionPane.showMessageDialog(null, "Su salario es de "+HH+" $.");
		}
		else {
			HH=40*16+(HH-40)*20;
			JOptionPane.showMessageDialog(null, "Su salario es de "+HH+" $.");
		}
	}
	
	public static void main(String[] args) {
		// ejercicio01();
		// ejercicio01Ternario();
		// ejercicio02();
		// ejercicio03();
		// ejercicio03Ternario();
		// ejercicio04();
		// ejercicio04Ternario();
		// ejercicio05();

	}

}
