package Ejercicios;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio04C {
/*
 * En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
 * ¿Cuál será la cantidad que pagará una persona por su compra?
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float PagoT,PagoD;
		
		PagoT=Float.parseFloat(JOptionPane.showInputDialog("Valor de su compra:"));
		PagoD=PagoT*0.8f;
		
		if(PagoT<=300) {
			JOptionPane.showMessageDialog(null, "No se le puede aplicar ningún descuento.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Se le aplica un descuento del 20%.\nEl valor de su compra pasa a ser de "+PagoD+" $");
		}

	}

}
