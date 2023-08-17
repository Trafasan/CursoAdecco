package com.sandra.poo.ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.poo.ejercicios.clases.Atleta;
import com.sandra.poo.ejercicios.clases.Cliente;
import com.sandra.poo.ejercicios.clases.NumComplejo;
import com.sandra.poo.ejercicios.clases.Coordenada;
import com.sandra.poo.ejercicios.clases.Cuadrilatero;
import com.sandra.poo.ejercicios.clases.Cuenta;
import com.sandra.poo.ejercicios.clases.Triangulo;
import com.sandra.poo.utilidades.MenuUtils;

public class Ejercicios {
	private static String opcion;
	private static Scanner sc;
	
	public static void ejercicios() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un ejercicio del tema 'POO': ", "EJERCICIOS DE POO", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Ejercicio 1" -> ejercicio01();
			case "Ejercicio 2" -> ejercicio02();
			case "Ejercicio 3" -> ejercicio03();
			case "Ejercicio 4" -> ejercicio04();
			case "Ejercicio 5" -> ejercicio05();
			case "Ejercicio 6" -> ejercicio06();
			case "Volver atrás" -> MenuUtils.mainMenu();
			}
		} while(!opcion.equals("Volver atrás"));
	}

	private static void ejercicio01() {
		sc = new Scanner(System.in);
		float base, altura = 0;
		int tipo_figura = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "TIPO DE FIGURA", 0, 3, null,
				new Object[] {"Rectángulo", "Cuadrado"}, null);
		System.out.printf("Introduzca %s: ", tipo_figura == 0 ? "la base" : "el lado");
		base = sc.nextFloat();
		sc.nextLine();
		if (tipo_figura == 0) {
			System.out.print("Introduzca la altura: ");
			altura = sc.nextFloat();
			sc.nextLine();
		}
		Cuadrilatero figura = (tipo_figura == 0) ? new Cuadrilatero(base, altura) : new Cuadrilatero(base);
		System.out.printf("""
				Datos de la figura
				Perímetro: %.2f
				Área: %.2f\n
				""", figura.getPerimetro(), figura.getArea());
	}

	private static void ejercicio02() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las coordenadas iniciales de x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las coordenadas iniciales de y"));
		Coordenada coordenada = new Coordenada(x, y);
		System.out.println("Coordenadas: "+coordenada);
		int op;
		String[] opciones = {"Arriba", "Abajo", "Izquierda", "Derecha"};
		do {
			op = JOptionPane.showOptionDialog(null, "Seleccione una opción: ", "¿Hacia dónde se quiere mover?", 0, 3, null, opciones, null);
			String direccion = opciones[0].toLowerCase();
			switch(op) {
				case 0 -> coordenada.moverArriba();
				case 1 -> coordenada.moverAbajo();
				case 2 -> coordenada.moverIzquierda();
				case 3 -> coordenada.moverDerecha();
				default -> System.out.printf("Coordenadas finales: %s.\n\n", coordenada);
			}
			if (op != -1) System.out.printf("Moviendo hacia %s%s. Nuevas coordenadas: %s.\n", direccion, op==2 || op==3 ? "la " : "",
					coordenada);
		} while (op!=-1);
	}
	
	private static void ejercicio03() {
		sc = new Scanner(System.in);
		int numAtletas, numero;
		String dorsal;
		float tiempo;
		System.out.print("Introduzca la cantidad de participantes: ");
		numAtletas = sc.nextInt();
		sc.nextLine();
		List<Atleta> participantes = new ArrayList<Atleta>();
		for(int i=0; i<numAtletas; i++) {
			System.out.println("Datos del atleta "+(i+1));
			System.out.print("Introduzca el dorsal: ");
			numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Introduzca el nombre: ");
			dorsal = sc.nextLine();
			System.out.print("Introduzca el tiempo de carrera: ");
			tiempo = sc.nextFloat();
			sc.nextLine();
			participantes.add(new Atleta(numero, dorsal, tiempo));
		}
		participantes.sort(Comparator.comparing(Atleta::getTiempo));
		System.out.printf("Atleta más rápido: %s.\n\n", participantes.get(0));
	}
	
	private static void ejercicio04() {
		sc = new Scanner(System.in);
		double base, lado;
		int nTriangulos;
		System.out.print("Inserte la cantidad de triángulos: ");
		nTriangulos = sc.nextInt();
		sc.nextLine();
		List<Triangulo> triangulos = new ArrayList<Triangulo>();
		for(int i=0; i<nTriangulos; i++) {
			System.out.println("Datos del triángulo "+(i+1));
			System.out.print("Introduzca la medida de la base: ");
			base = sc.nextDouble();
			sc.nextLine();
			System.out.print("Introduzca la medida del lado: ");
			lado = sc.nextDouble();
			sc.nextLine();
			triangulos.add(new Triangulo(base, lado));
			System.out.printf("""
					Perímetro del triángulo: %.3f
					Área del triángulo: %.3f
					""", triangulos.get(i).getPerimetro(), triangulos.get(i).getArea());
		}
		triangulos.sort(Comparator.comparing(Triangulo::getArea).reversed());
		System.out.printf("Área del triángulo de mayor superficie: %.3f.\n\n", triangulos.get(0).getArea());
	}

	private static void ejercicio05() {
		sc = new Scanner(System.in);
		String menu = "";
		int n1r, n1i, n2r, n2i;
		NumComplejo n1, n2 = new NumComplejo();
		try {
			menu = JOptionPane
					.showInputDialog(null, "Seleccione un ejercicio del tema 'POO': ", "EJERCICIOS DE POO", JOptionPane.PLAIN_MESSAGE, null,
							new Object[] {"Sumar dos números complejos", "Multiplicar dos números complejos", "Comparar dos números complejos",
									"Multiplicar un número complejo por un entero"}, null).toString();
		} catch (NullPointerException e) {
			System.out.println("Hasta pronto :)");
		}
		System.out.print("Introduzca la parte real del primer número complejo: ");
		n1r = sc.nextInt();
		sc.nextLine();
		System.out.print("Introduzca la parte imaginaria sin la i del primer número complejo: ");
		n1i = sc.nextInt();
		sc.nextLine();
		n1 = new NumComplejo(n1r, n1i);
		if (!menu.equals("Multiplicar un número complejo por un entero")) {
			System.out.print("Introduzca la parte real del segundo número complejo: ");
			n2r = sc.nextInt();
			sc.nextLine();
			System.out.print("Introduzca la parte imaginaria sin la i del segundo número complejo: ");
			n2i = sc.nextInt();
			sc.nextLine();
			n2 = new NumComplejo(n2r, n2i);
		}
		switch (menu) {
			case "Sumar dos números complejos" -> System.out.println("Resultado de la suma: "+NumComplejo.sumar(n1, n2));
			case "Multiplicar dos números complejos" -> System.out.println("Resultado de la multiplicación: "+NumComplejo.multiplicar(n1, n2));
			case "Comparar dos números complejos" -> System.out.println(NumComplejo.comparar(n1, n2));
			case "Multiplicar un número complejo por un entero" -> {
				System.out.print("Introduzca un número entero: ");
				System.out.println("Resultado de la multiplicación: "+NumComplejo.multEntero(n1, sc.nextInt()));
				sc.nextLine();
			}
		}
		System.out.println();
	}	

	private static void ejercicio06() {
		sc = new Scanner (System.in);
		String nombre, apellido, dni, menu;
		int numCuentas, numero, numeroCuenta = 0;
		double saldo;
		System.out.println("Registro de un nuevo cliente");
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.print("Introduzca su apellido: ");
		apellido = sc.nextLine();
		Cliente cliente = new Cliente(nombre, apellido);
		do {
			System.out.print("Introduzca su DNI del cliente: ");
			dni = sc.nextLine();
			cliente.setDni(dni);
		} while(cliente.getDni() == null);
		System.out.print("Introduzca el número de cuentas que posee: ");
		numCuentas = sc.nextInt();
		sc.nextLine();		
		for(int i=0; i<numCuentas; i++) {
			System.out.printf("Datos de la cuenta nº%d\n", i+1);
			System.out.print("Introduzca el número de cuenta: ");
			numero = sc.nextInt();
			sc.nextLine();
			if (!cliente.addCuenta(new Cuenta(numero))) System.err.println("Ya existe una cuenta con ese número.");
			else {
				System.out.print("Introduzca el saldo de la cuenta: ");
				saldo = sc.nextDouble();
				sc.nextLine();
				cliente.getCuentas().get(i).setSaldo(saldo);
			}
		}
		do {
			try {
				menu = JOptionPane
						.showInputDialog(null, "Seleccione una opción del menú: ", "MENÚ CLIENTE", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Ingresar dinero en una cuenta", "Retirar dinero de una cuenta", "Consultar saldo de una cuenta"},
								null).toString();
			} catch (Exception e) {
				menu = "Volver atrás";
			}
			if (!menu.equals("Volver atrás")) {
				System.out.print("\nIntroduzca el número de cuenta: ");
				numeroCuenta = sc.nextInt();
				sc.nextLine();
			}
			switch(menu) {
			case "Ingresar dinero en una cuenta" -> cliente.ingresarDinero(numeroCuenta);
			case "Retirar dinero de una cuenta" -> cliente.retirarDinero(numeroCuenta);
			case "Consultar saldo de una cuenta" -> cliente.consultarSaldo(numeroCuenta);
			case "Volver atrás" -> System.out.println("Hasta pronto :)");
			}
		} while(!menu.equals("Volver atrás"));
	}
	
}
