package Ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio01C {
//Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int número;
		número=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número:"));
		
		if (número%10==0) {
			JOptionPane.showMessageDialog(null, "El número es múltiplo de 10");
		}
		else {
			JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10");
		}

	}

}
