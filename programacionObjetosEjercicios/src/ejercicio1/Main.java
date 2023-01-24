package ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cuadrilatero c1;
		float lado1, lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el primer lado"));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el segundo lado"));
		
		if(lado1 == lado2) {
			c1 = new Cuadrilatero(lado1);
		}
		else {
			c1=new Cuadrilatero(lado1, lado2);
		}
		
		System.out.println("El perímetro es"+c1.getPerimetro());
		System.out.println("El área es"+c1.getArea());
	}

}
