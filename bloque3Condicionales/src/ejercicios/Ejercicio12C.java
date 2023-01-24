package ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio12C {
//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float nota;
		
		nota=Float.parseFloat(JOptionPane.showInputDialog("Inserte su nota:"));
		
		if (nota>=0 && nota<5) {
			JOptionPane.showMessageDialog(null, nota+": Insuficiente");
		}
		else if (nota>=5 && nota<6) {
			JOptionPane.showMessageDialog(null, nota+": Suficiente");
		}
		else if (nota>=6 && nota<7) {
			JOptionPane.showMessageDialog(null, nota+": Bien");
		}
		else if (nota>=7 && nota<9) {
			JOptionPane.showMessageDialog(null, nota+": Notable");
		}
		else if (nota>=9 && nota<=10) {
			JOptionPane.showMessageDialog(null, nota+": Sobresaliente");
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR\nLa nota insertada no es válida.");
		}

	}

}
