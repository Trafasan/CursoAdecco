package Ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio02C {
//Pedir dos números y decir cuál es el mayor o si son iguales.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int númeroA,númeroB;
		
		númeroA=Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número:"));
		númeroB=Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número:"));
		
		if (númeroA>númeroB) {
			JOptionPane.showMessageDialog(null, númeroA+" es mayor que "+númeroB);
		}
		else if (númeroA<númeroB) {
			JOptionPane.showMessageDialog(null, númeroB+" es mayor que "+númeroA);
		}
		else {
			JOptionPane.showMessageDialog(null, númeroA+" es igual a "+númeroB);
		}

	}

}
