/**
 * 
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Ejercicios11_14 {
	public static void ejercicio11() {
		
	}
	
	public static void ejercicio12() {
		
	}
	
	public static void ejercicio13() {
		/*
		 * Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
		 * 1. Ingresar dinero a la cuenta
		 * 2. Retirar dinero de la cuenta
		 * 3. Salir
		 */
	}
	
	public static void ejercicio14Desplegable() {
		// Hacer un programa que pase de kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
		final double cHg=10, cDag=100, cg=1000, cDg=10000, cCg=100000, cMg=1000000;
		double resultado;
		double kg = Double.parseDouble(JOptionPane.showInputDialog("Inserte la masa en kilogramos: "));
		// Menú desplegable con JOptionPane
		String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción: ", "CONVERSIÓN DE UNIDADES", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Hectogramo", "Decagramo", "Gramo", "Decigramo", "Centigramo", "Miligramo"}, null).toString();		
		switch(opcion) {
		case "Hectogramo" -> {
			resultado=kg*cHg; // op = 0
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" hg");
		}
		case "Decagramo" -> {
			resultado=kg*cDag;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" dag");
		}
		case "Gramo" -> {
			resultado=kg*cg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" g");
		}
		case "Decigramo" -> {
			resultado=kg*cDg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" dg");
		}
		case "Centigramo" -> {
			resultado=kg*cCg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" cg");
		}
		case "Miligramo" -> {
			resultado=kg*cMg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" mg");
		}
		default -> JOptionPane.showMessageDialog(null, "ERROR\nComando no reconocido");
		}
	}
	
	public static void ejercicio14Botones() {
		// Hacer un programa que pase de kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
		final double cHg=10, cDag=100, cg=1000, cDg=10000, cCg=100000, cMg=1000000;
		double resultado;
		double kg = Double.parseDouble(JOptionPane.showInputDialog("Inserte la masa en kilogramos: "));
		// Menú de botones con JOptionPane
		int op = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "CONVERSIÓN DE UNIDADES", 0, 3, null,
				new Object[] { "Hectogramo", "Decagramo", "Gramo", "Decigramo", "Centigramo", "Miligramo"}, null);
		switch(op) {
		case 0 -> {
			resultado=kg*cHg; // op = 0
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" hg");
		}
		case 1 -> {
			resultado=kg*cDag;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" dag");
		}
		case 2 -> {
			resultado=kg*cg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" g");
		}
		case 3 -> {
			resultado=kg*cDg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" dg");
		}
		case 4 -> {
			resultado=kg*cCg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" cg");
		}
		case 5 -> {
			resultado=kg*cMg;
			JOptionPane.showMessageDialog(null, kg+" kg son "+resultado+" mg");
		}
		default -> JOptionPane.showMessageDialog(null, "ERROR\nComando no reconocido");
		}
	}
	
	public static void main(String[] args) {
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
		// ejercicio14Desplegable();
		// ejercicio14Botones();

	}

}
