package Teoría;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class EntradaSalidaDatosJOptionPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String Cadena;
	int Entero;
	char Letra;
	double Decimal;
	
	Cadena=JOptionPane.showInputDialog("Inserte una cadena: ");
	Entero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número entero: "));
	Letra=JOptionPane.showInputDialog("Inserte una letra: ").charAt(0);
	Decimal=Double.parseDouble(JOptionPane.showInputDialog("Inserte un número decimal: "));
	//Al meter el número decimal en JOptionPane, hay que ponerlo con un punto.
	
	JOptionPane.showMessageDialog(null,"La cadena es: "+Cadena);
	JOptionPane.showMessageDialog(null,"El número decimal es: "+Entero);
	JOptionPane.showMessageDialog(null, "La letra es: "+Letra);
	JOptionPane.showMessageDialog(null, "El número decimal es: "+Decimal);
	}

}
