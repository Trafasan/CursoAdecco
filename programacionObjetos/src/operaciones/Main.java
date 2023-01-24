
package operaciones;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int n1 =Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número"));
		int n2 =Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número"));
		Operación op = new Operación();
		
		int suma = op.sumar(n1, n2);
		int resta = op.restar(n1, n2);
		int mult = op.multiplicar(n1, n2);
		float div = op.dividir(n1, n2);

		op.mostrarResultados(suma, resta, mult, div);
	}

}
