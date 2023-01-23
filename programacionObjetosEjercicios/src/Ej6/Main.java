package Ej6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int menu, n1r, n1i, n2r, n2i, nEntero;
		Complejos operacion;
		
		menu = Integer.parseInt(JOptionPane.showInputDialog("Elija la opción que desee realizar:"
				+ "\n1. Sumar dos números complejos" + "\n2. Multiplicar dos números complejos"
				+ "\n3. Comparar 2 números complejos" + "\n4. Multiplicar un número complejo por un entero"));

		switch (menu) {
		case 1, 2, 3:
			System.out.print("Inserte el primer número complejo (parte real): ");
			n1r = Entrada.nextInt();
			System.out.print("Inserte el primer número complejo (parte imaginaria sin la i): ");
			n1i = Entrada.nextInt();
			System.out.print("\nInserte el segundo número complejo (parte real): ");
			n2r = Entrada.nextInt();
			System.out.print("Inserte el segundo número complejo (parte imaginaria sin la i): ");
			n2i = Entrada.nextInt();
			operacion = new Complejos(n1r, n1i, n2r, n2i);
			if (menu == 1) {System.out.println(operacion.sumar());}
			if (menu == 2) {System.out.println(operacion.multComplejos());}
			if (menu == 3) {System.out.println(operacion.comparar());}
		case 4:
			System.out.print("Inserte el primer número complejo (parte real): ");
			n1r = Entrada.nextInt();
			System.out.print("Inserte el primer número complejo (parte imaginaria sin la i): ");
			n1i = Entrada.nextInt();
			System.out.print("\nInserte un número entero: ");
			nEntero = Entrada.nextInt();
			operacion = new Complejos(n1r, n1i, nEntero);
			System.out.println(operacion.multEntero());
			break;
		default:
			System.out.println("ERROR\nNo se ha reconocido la opción elegida.");
		}
		Entrada.close();
	}
}