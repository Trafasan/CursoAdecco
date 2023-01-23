package Ej2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String direccion;
		int x, y;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Inserte las coordenadas iniciales de x"));
		
		y = Integer.parseInt(JOptionPane.showInputDialog("Inserte las coordenadas iniciales de y"));
		
		Movimiento objeto = new Movimiento(x, y);
		
		System.out.println(objeto.mover());
		
		do {
			direccion = JOptionPane.showInputDialog("¿Hacia dónde se quiere mover?\n· Arriba\n· Abajo\n· Izquierda\n· Derecha\nEscriba Salir para terminar");
			if(direccion.equals("Arriba") || direccion.equals("Abajo") || direccion.equals("Izquierda") || direccion.equals("Derecha")) {
				System.out.println("Usted eligió "+direccion.toLowerCase()+".");
				switch(direccion) {
				case "Arriba":
					objeto.getArriba(); break;
				case "Abajo":
					objeto.getAbajo(); break;
				case "Izquierda":
					objeto.getIzquierda(); break;
				case "Derecha":
					objeto.getDerecha(); break;
				}
				System.out.println(objeto.mover());
			}
		} while (!direccion.equals("Salir"));
		
		
	}

}
