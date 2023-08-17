package com.sandra.fundamentosJava.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Extras {
	private static String opcion;
	private static Scanner sc;
	
	public static void apartados() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado extra para consultarlo: ", "APARTADOS EXTRA", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Fechas en Java", "Determinar si un número es primo", "Suma de números anteriores",
										"Tablas de multiplicar", "Canción aleatoria", "Conexión SQL"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Fechas en Java" -> fechasJava();
			case "Determinar si un número es primo" -> isNumPrimo();
			case "Suma de números anteriores" -> sumaNumAnteriores();
			case "Tablas de multiplicar" -> tablasMultiplicar();
			case "Canción aleatoria" -> cancionAleatoria();
			case "Conexión SQL" -> conexionSQL();
			case "Volver atrás" -> MenuUtils.mainMenu();
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void fechasJava() {
		LocalDate actualLD = LocalDate.of(2022, Month.JANUARY, 7);
		LocalDateTime actualLDT = LocalDateTime.now();
		LocalTime actualLT = LocalTime.of(18, 45, 10);
		ZonedDateTime actualZDT = ZonedDateTime.now();
		System.out.printf("""
				Existen diferentes tipos de datos para declarar una fecha en Java:
				· LocalDate: Contiene la fecha en formato yyyy/MM/dd. Ejemplo: %s
				· LocalDateTime: Contiene la misma información que un LocalDate junto con la hora. Ejemplo: %s
				  También se puede guardar la hora aparte con LocalTime. Ejemplo: %s
				· ZonedDateTime: Contiene la misma información que un LocalDateTime junto con la zona horaria. Ejemplo: %s
				Se puede utilizar el método of() para declarar la fecha (u hora) indicando cada una de las partes o
				el método now() para obtener la fecha actual\n
				""", actualLD, actualLDT, actualLT, actualZDT);
		actualLDT = actualLDT.withNano(0);
		actualZDT = actualZDT.withNano(0);
		System.out.printf("""
				Para los datos que guardan la hora, la hora aparece con nanosegundos (si se ha especificado o se obtuvo la hora actual).
				Para que no aparezcan, se pueden resetear con el método withNano(0).
				· LocalDateTime sin nanosegundos: %s
				· ZonedDateTime sin nanosegundos: %s\n
				""", actualLDT, actualZDT);
		System.out.printf("""
				Para darle formato a las fechas se utiliza el método format(). El parámetro de este método es un dato
				de tipo DateTimeFormatter. Este dato puede ser preestablecido (como ISO_LOCAL_DATE) o se le puede indicar
				con el método ofPattern(). Los patrones se pueden encontrar en la siguiente web:
				"https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html"
				Además, se puede especificar la región geográfica de la fecha para adaptarla a ese formato.
				· LocalDate: %s
				· LocalDateTime: %s %s
				· ZonedDateTime: %s\n
				""", actualLD.format(DateTimeFormatter.ofPattern("eee dd MMMM yyyy", Locale.UK)),
				actualLDT.format(DateTimeFormatter.ISO_LOCAL_DATE), actualLDT.format(DateTimeFormatter.ISO_LOCAL_TIME),
				actualZDT.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z")));
		String fechaS1 = "2021-10-30", fechaS2 = "10/12/2021";
		LocalDate fecha1 = LocalDate.parse(fechaS1), fecha2 = LocalDate.parse(fechaS2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.printf("""
				Por último se puede declarar una fecha a partir de una cadena con el método parse(). Por ejemplo, para declarar un LocalDate:
				· Si el formato del String es yyyy-MM-dd, se puede utilizar el método con un solo parámetro. Ejemplo: %s -> %s
				· En caso contrario, se debe declarar un DateTimeFormatter indicando el patrón del String. Ejemplo: %s -> %s\n
				""", fechaS1, fecha1, fechaS2, fecha2);
	}
	
	private static void isNumPrimo() {
		System.out.println("Ejercicio para determinar si un número es primo o no.");
		sc = new Scanner (System.in);
		boolean esPrimo = true;
		System.out.print("Introduzca un número: ");
		int N = sc.nextInt();
		sc.nextLine();
		for (int i=2; i<N/2 && esPrimo; i++) esPrimo = N%i != 0;
		System.out.printf("El número %d %ses un número primo.\n\n", N, !esPrimo ? "no " : "");
	}
	
	private static void sumaNumAnteriores() {
		System.out.println("Ejercicio que calcula la suma de los números entre 0 y un número entero dado (este número incluido).");
		sc = new Scanner (System.in);
		System.out.print("Introduzca un número: ");
		int N = sc.nextInt();
		sc.nextLine();
		if (N>1) {
			List<Integer> numeros = new ArrayList<Integer>();
			for (int i=N; i>0; i--) numeros.add(i);
			String numeros_string = numeros.stream().map(n -> n.toString()).collect(Collectors.joining(" + "));
			System.out.printf("%s = %d\n\n", numeros_string, numeros.stream().mapToInt(n -> n).sum());
		}
		else System.err.println("El número debe ser mayor que 1.\n");
	}
	
	private static void tablasMultiplicar() {
		System.out.println("Tablas de multiplicar del 1 al 10");
		for (int i=1; i<=10; i++) {
			System.out.printf("Tabla de multiplicar del %d\n", i);
			for (int j=1; j<=10; j++) System.out.printf("· %d x %d = %d\n", i, j, i*j);
			System.out.println();
		}
	}
	
	private static void cancionAleatoria() {
		List<String> notas = new ArrayList<String>(Arrays.asList("Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do'"));
		int opcion;
		do {
			opcion = JOptionPane.showConfirmDialog(null, "Pulsa Aceptar para generar una nota", "CREA TU PROPIA CANCIÓN", 2, 1, null);
			if (opcion == 0) System.out.printf("%s ", notas.get(new Random().nextInt(notas.size())));
		} while (opcion == 0);
		System.out.println("\n");
	}
	
	private static void conexionSQL() {
		System.out.print("""
				Resumen para conectarse correctamente a una base de datos
				1. Se crea la conexión
				2. Se crea el objeto Statement
				3. Se ejecuta la intrucción y se recorre el ResultSet para comprobar que se ha conectado correctamente
				Se debe añadir la dependencia de Maven "MySQL Connector Java" para que la conexión funcione
				(en el caso de conectar con una base de datos MySQL)
				""");
		final String puerto = "3306", ddbb = "banco", usuario = "root", password = "";
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:"+puerto+"/"+ddbb, usuario, password);
			Statement statement = connection.createStatement();
			ResultSet resultado = statement.executeQuery("SELECT * FROM gestor");
			while (resultado.next()) System.out.printf("Gestor nº%d: %s %s.\n", resultado.getInt("id"), resultado.getString("nombre"),
					resultado.getString("apellido"));
			System.out.println();
		} catch (Exception e) {
			System.err.printf("No se pudo conectar con la base de datos. %s: %s.\n\n", e.getClass().getSimpleName(), e.getMessage());
		}
	}
	
}
