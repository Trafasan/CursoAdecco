package com.sandra.fundamentosJava.teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class Variables {
	private static String opcion;
	private static Scanner sc;
	
	public static void temario() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado del tema 'Variables': ", "TEORÍA DE VARIABLES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Datos primitivos", "Datos no primitivos y cadenas", "Constantes",
										"Entrada de datos por consola", "Entrada de datos por JOptionPane"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Datos primitivos" -> datosPrimitivos();
			case "Datos no primitivos y cadenas" -> datosNoPrimitivos();
			case "Constantes" -> constantes();
			case "Entrada de datos por consola" -> entradaDatosConsola();
			case "Entrada de datos por JOptionPane" -> entradaDatosJOptionPane();
			case "Volver atrás" -> MenuUtils.subMenu("Variables");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void datosPrimitivos() {
		System.out.println("Los tipos de datos primitivos se caracterizan por poder almacenar un único valor."
				+ " Estos son los diferentes tipos de datos primitivos que hay:");
		
		byte n1 = 13;
		System.out.printf("""
				· La variable byte tiene como rango (-128, 127).
				  El espacio en memoria de byte es de 8 bits.
				  Ejemplo: %d
				
				""", n1);
		
		short n2 = -20913;
		System.out.printf("""
				· La variable short tiene como rango (-32.768, 32.767).
				  El espacio en memoria de short es de 16 bits.
				  Ejemplo: %d
				
				""", n2);
		
		int n3 = 1679420913;
		System.out.printf("""
				· La variable int tiene como rango (-2.147.483.648, 2.147.483.647).
				  El espacio en memoria de int es de 32 bits.
				  Ejemplo: %d
				
				""", n3);
		
		long n4 = -2079420913;
		System.out.printf("""
				· La variable long tiene como rango (-9.223.372.036.854.775.808, 9.223.372.854.775.807).
				  El espacio en memoria de long es de 64 bits.
				  Ejemplo: %d
				
				""", n4);
		
		float d1 = 3.14f;
		System.out.printf("""
				· La variable long tiene como rango (-9.223.372.036.854.775.808, 9.223.372.854.775.807).
				  El espacio en memoria de long es de 64 bits.
				  Para declarar este tipo de variables, es importante poner la f al final del número ya que daría error si faltase.
				  Ejemplo: %f
				
				""", d1);
		
		double d2 = 3.14159265;
		System.out.printf("""
				· La variable double tiene como rango (4,9e-324, 1,8e308).
				  El espacio en memoria de float es de 64 bits.
				  Ejemplo: %f
				
				""", d2);
		
		char letra = 'J', nChar = '2', simbolo = '$';
		System.out.printf("""
				· La variable char guarda solo un caracter.
				  Se pueden utilizar comillas en vez de dobles comillas para guardar este tipo de variables.
				  Ejemplos: %c, %c, %c
				
				""", letra, nChar, simbolo);
		
		boolean verdad = true, mentira = false;
		System.out.printf("""
				· La variable boolean guarda solo 'true' o 'false'.
				  Ejemplos: %b, %b
				
				""", verdad, mentira);
	}
	
	private static void datosNoPrimitivos() {
		System.out.println("Los datos no primitivos contienen múltiples valores de tipos primitivos. Algunos ejemplos son los siguientes: ");
		Integer n = null;
		System.out.printf("""
				La clase Integer tiene un único campo de tipo int. Por esta razón, su valor puede ser nulo.
				Además, tiene diversos métodos a los que se pueden acceder.
				Existen clases para el resto de datos primitivos, las cuales tienen el mismo nombre pero con la primera letra en mayúscula.
				Ejemplo: %d
				
				""", n);
		
		System.out.println("""
				La clase String es una cadena de caracteres.
				Esta se declara con dobles comillas habitualmente, pero se puede declarar usando tres dobles comillas, generándose así una string multilínea.
				Esta cadena es un ejemplo de string.
				""");
	}
	
	private static void constantes() {
		int n_var = 10;
		final int n_const = 13;
		System.out.printf("""
				Los datos se pueden declarar como constantes si se escribe 'final' antes del tipo de dato.
				Datos de tipo int declarados: %d (variable), %d (constante)
				""", n_var, n_const);
		n_var = 15;
		System.out.print("""
				Si se intenta cambiar el valor de la constante, salta el siguiente error:
				'The final local variable n_const cannot be assigned. It must be blank and not using a compound assignment'
				""");
		// n_const = 13;
		System.out.printf("Datos de tipo int cambiados: %d (variable), %d (constante)", n_var, n_const);
	}
	
	private static void entradaDatosConsola() {
		System.out.println("Para poder introducir datos por consola, se debe declarar un objeto Scanner, que en este caso se llamará sc.");
		sc = new Scanner(System.in);
		
		System.out.print("""
				Con sc.nextLine() se guarda la cadena entera y limpia el Scanner.
				Introduce una cadena para probarlo:\s""");
		String cadena = sc.nextLine();
		System.out.printf("La cadena es '%s'\n", cadena);
		
		System.out.print("""
				Con sc.next() se guarda la cadena hasta el primer espacio que encuentre.
				Introduce una palabra o una cadena para probarlo:\s""");
		String palabra = sc.next();
		System.out.printf("La palabra es '%s'\n", palabra);
		sc.nextLine();
		
		System.out.print("""
				Con sc.next().charAt(0) se guarda solo el primer caracter.
				Introduce una letra o una cadena para probarlo:\s""");
		char caracter = sc.nextLine().charAt(0);
		System.out.printf("El caracter es '%c'\n", caracter);
		
		System.out.print("""
				Con sc.nextInt() se guarda la cadena y la convierte a tipo int. Es una alternativa a Integer.parseInt(sc.next())
				Por tanto, si se introduce un caracter que no sea un número, daría error.
				Introduce un número u otro tipo para probarlo:\s""");
		int entero = sc.nextInt();
		System.out.printf("El número entero es '%d'\n", entero);
		
		System.out.print("""
				También existen métodos similares para los diferentes tipos de datos primitivos.
				Si se quiere introducir un número decimal, se debe poner con una coma porque, si se pone con un punto, salta un error.
				Introduce un número decimal para probarlo:\s""");
		float decimal = sc.nextFloat();
		System.out.printf("El número decimal es '%f'\n", decimal);
		System.out.println("""
				Al terminar con la entrada de datos por consola se debe cerrar el Scanner con sc.close().
				Sin embargo, si se utilizan métodos con Scanner y en uno de ellos se cierra, dejará de funcionar aunque luego se abra
				""");
		// sc.close();
	}
	
	private static void entradaDatosJOptionPane() {
		String cadena = JOptionPane.showInputDialog("""
				Para poder introducir datos por JOptionPane, se utiliza el método JOptionPane.showInputDialog()
				Introduzca una cadena: 
				""");
		
		char letra = JOptionPane.showInputDialog("""
				Concatenando al método anterior el método .charAt(0) se puede guardar una variable tipo char.
				Introduzca una letra o una cadena para probarlo: 
				""").charAt(0);
		
		System.out.print("""
				Con sc.nextInt() se guarda la cadena y la convierte a tipo int. Es una alternativa a Integer.parseInt(sc.next())
				Por tanto, si se introduce un caracter que no sea un número, daría error.
				Introduce un número u otro tipo para probarlo: 
				""");
		
		int entero = Integer.parseInt(JOptionPane.showInputDialog("""
				Para introducir una variable de tipo int, se debe convertir la cadena introducida con Integer.parseInt().
				Por tanto, si se introduce un caracter que no sea un número, la conversión daría error.
				Introduce un número u otro tipo para probarlo: 
				"""));
		
		System.out.print("""
				También existen métodos similares para los diferentes tipos de datos primitivos.
				Si se quiere introducir un número decimal, se debe poner con una coma porque, si se pone con un punto, salta un error.
				Introduce un número decimal para probarlo: 
				""");
		
		double decimal = Double.parseDouble(JOptionPane.showInputDialog("""
				Si se quiere introducir un número decimal, se debe poner con un punto porque, si se pone con una coma, salta un error.
				Introduce un número decimal para probarlo: 
				"""));
		
		JOptionPane.showMessageDialog(null,String.format("""
				Para la salida de datos por JOptionPane, se utiliza el método JOptionPane.showMessageDialog().
				La cadena es '%s'.
				La letra es '%c'.
				El número entero es '%d'.
				El número decimal es '%f'.""", cadena, letra, entero, decimal));
	}

}
