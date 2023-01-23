package Ej6corregido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		Complejos numero1, numero2, suma;
		double a, b, c, d;
		int opcion;

		do {
			System.out.println(".:Operaciones con números complejos:.");
			System.out.println("1. Sumar dos números complejos");
			System.out.println("2. Multiplicar dos números complejos");
			System.out.println("3. Comparar 2 números complejos");
			System.out.println("4. Multiplicar un número complejo por un entero");
			System.out.println("5. Salir");
			System.out.print("\nInserte la opción del menú: ");
			opcion = Entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\nInserte el primer número complejo:");
				System.out.print("Inserte la parte real: ");
				a = Entrada.nextDouble();
				System.out.print("Inserte la parte imaginaria: ");
				b = Entrada.nextDouble();
				System.out.println("\nInserte el segundo número complejo:");
				System.out.print("Inserte la parte real: ");
				c = Entrada.nextDouble();
				System.out.print("Inserte la parte imaginaria: ");
				d = Entrada.nextDouble();

				numero1 = new Complejos(a, b);
				numero2 = new Complejos(c, d);

				suma = numero1.sumar(numero2);
				System.out.println("La suma es: " + suma.getA() + " + " + suma.getB() + "i\n");
				break;
			case 2:
				System.out.println("Caso 2");
				break;
			case 3:
				System.out.println("Caso 3");
				break;
			case 4:
				System.out.println("Caso 4");
				break;
			default:
				System.out.println("ERROR\nNo se ha reconocido la opción elegida.");
			}
		} while (opcion != 5);
		Entrada.close();
	}

}
