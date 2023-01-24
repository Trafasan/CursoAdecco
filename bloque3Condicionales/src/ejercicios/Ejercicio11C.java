package ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio11C {
/*
 * Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
 * El usuario debe especificar la operación con el primer caracter del primer parámentro de la línea de comandos:
 * S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int númeroA,númeroB,resultado,resto;
		char operación;
		
		númeroA=Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número:"));
		operación=JOptionPane.showInputDialog("Inserte la operación que desea realizar:").charAt(0);
		númeroB=Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número:"));
		
		if (operación=='S'||operación=='s') {
			resultado=númeroA+númeroB;
			JOptionPane.showMessageDialog(null, númeroA+" + "+númeroB+" = "+resultado);
		}
		else if (operación=='R'||operación=='r') {
			resultado=númeroA-númeroB;
			JOptionPane.showMessageDialog(null, númeroA+" - "+númeroB+" = "+resultado);
		}
		else if (operación=='P'||operación=='p'||operación=='M'||operación=='m') {
			resultado=númeroA*númeroB;
			JOptionPane.showMessageDialog(null, númeroA+" · "+númeroB+" = "+resultado);
		}
		else if (operación=='D'||operación=='d') {
			resultado=númeroA/númeroB;
			resto=númeroA%númeroB;
			JOptionPane.showMessageDialog(null, númeroA+" / "+númeroB+" = "+resultado+"\nResto: "+resto);
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR\nNo se reconoce la operación insertada");
		}
		

	}

}
