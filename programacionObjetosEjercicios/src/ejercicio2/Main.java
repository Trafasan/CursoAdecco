package ejercicio2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Inserte las coordenadas iniciales de x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Inserte las coordenadas iniciales de y"));
		Movimiento objeto = new Movimiento(x, y);
		System.out.println(objeto.mover());
		int op;
		do {
			op = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "¿Hacia dónde se quiere mover?", 0, 3, null,
					new Object[] { "Arriba", "Abajo", "Izquierda", "Derecha", "Salir"}, null);
			String direccion = null;
			switch(op) {
				case 0 -> {
					direccion = "arriba";
					objeto.getArriba();
				}
				case 1 -> {
					direccion = "abajo";
					objeto.getAbajo();
				}
				case 2 -> {
					direccion = "izquierda";
					objeto.getIzquierda();
				}
				case 3 -> {
					direccion = "derecha";
					objeto.getDerecha();
				}
			}
			if (op == 4) break;
			System.out.println("Usted eligió "+direccion+".");
			System.out.println(objeto.mover());
		} while (op!=4);
		
		
	}

}
