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
		/*
		 * Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
		 * El usuario debe especificar la operación con el primer caracter del primer parámentro de la línea de comandos:
		 * S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
		 */
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número: "));
		char op = JOptionPane.showInputDialog("Inserte la operación que desea realizar:").charAt(0);
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número: "));
		int resultado,resto;
		if (op=='S'||op=='s') {
			resultado=n1+n2;
			JOptionPane.showMessageDialog(null, n1+" + "+n2+" = "+resultado);
		}
		else if (op=='R'||op=='r') {
			resultado=n1-n2;
			JOptionPane.showMessageDialog(null, n1+" - "+n2+" = "+resultado);
		}
		else if (op=='P'||op=='p'||op=='M'||op=='m') {
			resultado=n1*n2;
			JOptionPane.showMessageDialog(null, n1+" · "+n2+" = "+resultado);
		}
		else if (op=='D'||op=='d') {
			resultado=n1/n2;
			resto=n1%n2;
			JOptionPane.showMessageDialog(null, n1+" / "+n2+" = "+resultado+"\nResto: "+resto);
		}
		else JOptionPane.showMessageDialog(null, "ERROR\nNo se reconoce la operación insertada");
	}
	
	public static void ejercicio12() {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Inserte su nota:"));
		if (nota>=0 && nota<5) JOptionPane.showMessageDialog(null, nota+": Insuficiente");
		else if (nota>=5 && nota<6) JOptionPane.showMessageDialog(null, nota+": Suficiente");
		else if (nota>=6 && nota<7) JOptionPane.showMessageDialog(null, nota+": Bien");
		else if (nota>=7 && nota<9) JOptionPane.showMessageDialog(null, nota+": Notable");
		else if (nota>=9 && nota<=10) JOptionPane.showMessageDialog(null, nota+": Sobresaliente");
		else JOptionPane.showMessageDialog(null, "ERROR\nLa nota insertada no es válida.");
	}
	
	public static void ejercicio13() {
		/*
		 * Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
		 * 1. Ingresar dinero a la cuenta
		 * 2. Retirar dinero de la cuenta
		 * 3. Salir
		 */
		int dinero, saldoF;
		final int saldoI=1000; 
		int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido :)\nSu saldo actual es de "+saldoI+" $.\n"
				+ "Inserte la operación deseada:\n1. Ingresar dinero a la cuenta\n2. Sacar dinero de la cuenta\n3. Salir"));
		switch (op) {
		case 1 -> {
			dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el dinero que desea ingresar: "));
			if (dinero>0) {
				saldoF=saldoI+dinero;
				JOptionPane.showMessageDialog(null, "Su saldo actual es de "+saldoF+" $.");
			}
			else JOptionPane.showMessageDialog(null, "ERROR\nNo se pudo completar la operación");
		}
		case 2 -> {
			dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el dinero que desea sacar: "));
			if (dinero>0 && dinero<=saldoI) {
			saldoF=saldoI-dinero;
			JOptionPane.showMessageDialog(null, "Su saldo actual es de "+saldoF+" $.");
			}
			else JOptionPane.showMessageDialog(null, "ERROR\nNo se pudo completar la operación");
		}
		case 3 -> JOptionPane.showMessageDialog(null, "Hasta pronto :)");
		default -> JOptionPane.showMessageDialog(null, "ERROR\nNo se reconoció la operación");
		}
	}
	
	public static void ejercicio13Desplegable() {
		int dinero, saldoF;
		final int saldoI=1000; 
		// Menú desplegable con JOptionPane
		String opcion = JOptionPane.showInputDialog(null, "Su saldo actual es de "+saldoI+" $.\nSeleccione una opción: ", "OPERACIONES DE BANCO",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Ingresar dinero", "Sacar dinero", "Salir"}, null).toString();
		switch (opcion) {
		case "Ingresar dinero" -> {
			dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el dinero que desea ingresar: "));
			if (dinero>0) {
				saldoF=saldoI+dinero;
				JOptionPane.showMessageDialog(null, "Su saldo actual es de "+saldoF+" $.");
			}
			else JOptionPane.showMessageDialog(null, "ERROR\nNo se pudo completar la operación");
		}
		case "Sacar dinero" -> {
			dinero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el dinero que desea sacar: "));
			if (dinero>0 && dinero<=saldoI) {
				saldoF=saldoI-dinero;
				JOptionPane.showMessageDialog(null, "Su saldo actual es de "+saldoF+" $.");
			}
			else JOptionPane.showMessageDialog(null, "ERROR\nNo se pudo completar la operación");
		}
		case "Salir" -> JOptionPane.showMessageDialog(null, "Hasta pronto :)");
		default -> JOptionPane.showMessageDialog(null, "ERROR\nNo se reconoció la operación");
		}
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
		// ejercicio13Desplegable();
		// ejercicio14Desplegable();
		// ejercicio14Botones();

	}

}
