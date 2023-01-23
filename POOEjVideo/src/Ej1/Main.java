package Ej1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String cuadrilatero;
		Cuadrilátero forma;
		
		do {
			cuadrilatero = JOptionPane.showInputDialog("Inserte el tipo de cuadrilátero:\n· Cuadrado\n· Rectángulo").toLowerCase();
		} while (!cuadrilatero.equals("cuadrado") && !cuadrilatero.equals("rectángulo"));

		if (cuadrilatero.equals("cuadrado")) {
			forma = new Cuadrilátero();
			float lado = Float.parseFloat(JOptionPane.showInputDialog("Inserte la medida del lado"));
			forma.setBase(lado); forma.setAltura(lado);
		}
		else {
			forma = new Cuadrilátero();
			forma.setBase(Float.parseFloat(JOptionPane.showInputDialog("Inserte la medida de la altura")));
			forma.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Inserte la medida de la anchura")));
		}
		
		System.out.println("El área del "+cuadrilatero+" es "+forma.getArea()+".");
		System.out.println("El perímetro del "+cuadrilatero+" es "+forma.getPerimetro()+".");

	}

}
