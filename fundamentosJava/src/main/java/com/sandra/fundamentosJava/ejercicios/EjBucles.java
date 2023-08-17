package com.sandra.fundamentosJava.ejercicios;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class EjBucles {
	private static String opcion;
	private static Scanner sc;
	
	public static void ejercicios() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un ejercicio del tema 'Bucles': ", "EJERCICIOS DE BUCLES", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7",
										"Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Ejercicio 11", "Ejercicio 12", "Ejercicio 13", "Ejercicio 14",
										"Ejercicio 15", "Ejercicio 16", "Ejercicio 17", "Ejercicio 18", "Ejercicio 19", "Ejercicio 20", "Ejercicio 21",
										"Ejercicio 22"}, null).toString();
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
			case "Ejercicio 7" -> ejercicio07();
			case "Ejercicio 8" -> ejercicio08();
			case "Ejercicio 9" -> ejercicio09();
			case "Ejercicio 10" -> ejercicio10();
			case "Ejercicio 11" -> ejercicio11();
			case "Ejercicio 12" -> ejercicio12();
			case "Ejercicio 13" -> ejercicio13();
			case "Ejercicio 14" -> ejercicio14();
			case "Ejercicio 15" -> ejercicio15();
			case "Ejercicio 16" -> ejercicio16();
			case "Ejercicio 17" -> ejercicio17();
			case "Ejercicio 18" -> ejercicio18();
			case "Ejercicio 19" -> ejercicio19();
			case "Ejercicio 20" -> ejercicio20();
			case "Ejercicio 21" -> ejercicio21();
			case "Ejercicio 22" -> ejercicio22();
			case "Volver atrás" -> MenuUtils.subMenu("Bucles");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void ejercicio01() {
		System.out.println("1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.");
		sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Introduzca un número: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n>=0) System.out.printf("El cuadrado de %d es %d\n", n, (int)Math.pow(n, 2));
		} while (n>=0);
		System.out.println("Hasta pronto :)\n");
	}
	
	private static void ejercicio02() {
		System.out.println("2. Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.");
		sc = new Scanner (System.in);
		int n;
		do {
			System.out.print("Introduzca un número: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n!=0) System.out.printf("El número %d es %s.\n", n, n>0 ? "positivo" : "negativo");
		} while (n!=0);
		System.out.println("Hasta pronto :)\n");
	}
	
	private static void ejercicio03() {
		System.out.println("3. Leer números hasta que se introduzca un O. Para cada uno indicar si es par o impar.");
		sc = new Scanner (System.in);
		int n;
		do {
			System.out.print("Introduzca un número: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n!=0) System.out.printf("El número %d es %s.\n", n, n%2==0 ? "par" : "impar");
		} while (n!=0);
		System.out.println("Hasta pronto :)\n");
	}
	
	private static void ejercicio04() {
		System.out.println("4. Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.");
		sc = new Scanner (System.in);
		int n;
		int contador = 0;
		do {
			System.out.print("Introduzca un número: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n>=0) contador++;
		} while (n>=0);
		System.out.println("Se han introducido "+contador+" número(s) no negativos.\n");
	}
	
	private static void ejercicio05() {
		System.out.println("""
				5. Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego
				ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N.
				El proceso termina cuando el usuario acierta ya mostrar el número de intentos.
				""");
		sc = new Scanner (System.in);
		int nRandom = new Random().nextInt(101); // Esto genera un número aleatorio entre 0 y 100
		int n;
		int contador = 0;
		do {
			System.out.print("Introduzca un número: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n!=nRandom) {
				contador++;
				System.out.printf("El número es %s que %d. ", nRandom>n ? "mayor" : "menor", n);
			}
		} while (n!=nRandom);
		System.out.println("Enhorabuena, has acertado\nNúmero de intentos: "+contador+"\n");
	}
	
	private static void ejercicio06() {
		System.out.println("6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.");
		sc = new Scanner (System.in);
		int n;
		int suma = 0;
		do {
			System.out.print("Introduzca un número :");
			n = sc.nextInt();
			sc.nextLine();
			if (n!=0) suma+=n;
		} while (n!=0);
		System.out.println("La suma de todos los datos introducidos es "+suma+"\n");
	}
	
	private static void ejercicio07() {
		System.out.println("7. Pedir números hasta que se introduzca uno negativo, y calcular la media.");
		sc = new Scanner (System.in);
		int n, contador=0, suma=0;
		do {
			System.out.print("Introduzca un número: ");
			n = sc.nextInt();
			sc.nextLine();
			if (n>=0) {
				contador++;
				suma+=n;
			}
		} while (n>=0);
		System.out.println((contador!=0 ? "La media de todos los números insertados es "+suma/contador:"ERROR\nNo se puede dividir entre 0")+"\n");
	}
	
	private static void ejercicio08() {
		System.out.println("8. Pedir un número N, y mostrar todos los números del 1 al N.");
		sc = new Scanner (System.in);
		System.out.print("Introduzca un número: ");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i=1; i<=num; i++) System.out.print(i+" ");
		System.out.println();
	}
	
	private static void ejercicio09() {
		System.out.println("9. Escribir todos los números del 100 al 0 de 7 en 7.");
		for (int i=100; i>=0; i-=7) System.out.print(i+" ");
		System.out.println();
	}
	
	private static void ejercicio10() {
		System.out.println("10. Pedir 10 números y escribir la suma total.");
		sc = new Scanner (System.in);
		int suma = 0;
		for (int i=0; i<10; i++) {
			System.out.print("Introduzca un número ("+(i+1)+"/10): ");
			int n = sc.nextInt();
			sc.nextLine();
			suma+=n;
		}
		System.out.println("La suma de los 10 números es "+suma+".\n");
	}

	private static void ejercicio11() {
		System.out.println("11. Diseñar un programa que muestre el producto de los 10 primeros números impares.");
		long mult = 1;
		for (int i=1; i<=20; i+=2) mult*=i;
		System.out.println("El producto de los primeros 10 números impares es "+mult+".\n");
	}
	
	private static void ejercicio12() {
		System.out.println("12. Pedir un número y calcular su factorial.");
		sc = new Scanner (System.in);
		System.out.print("Inroduzca un número: ");
		int n = sc.nextInt();
		sc.nextLine();
		long factorial = 1;
		for (int i=n; i>0; i--) factorial*=i;
		System.out.println("El factorial de "+n+" es "+factorial+".\n");
	}
	
	private static void ejercicio13() {
		System.out.println("13. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.");
		sc = new Scanner (System.in);
		int sumaP = 0, sumaN = 0, cantP = 0, cantN = 0, ceros = 0;
		for (int i=0; i<10; i++) {
			System.out.print("Introduzca un número ("+(i+1)+"/10): ");
			int n = sc.nextInt();
			sc.nextLine();
			if (n>0) {
				sumaP+=n;
				cantP++;
			}
			else if (n<0) {
				sumaN+=n;
				cantN++;
			}
			else ceros++;
		}
		System.out.println(cantP == 0 ? "No se insertaron números positivos.":"La media de los números positivos es: "+ (float)sumaP/cantP);
		System.out.println(cantN == 0 ? "No se insertaron números negativos.":"La media de los números negativos es: "+ (float)sumaN/cantN);
		System.out.println((ceros == 0 ? "No se insertaron ceros" : "La cantidad de ceros es: "+ceros)+"\n");
	}
	
	private static void ejercicio14() {
		System.out.println("14. Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de 1000€.");
		sc = new Scanner (System.in);
		int mil = 0;
		float sueldo, suma = 0;
		for (int i=0; i<10; i++) {
			System.out.print("Introduzca un sueldo ("+(i+1)+"/10): ");
			sueldo = sc.nextInt();
			sc.nextLine();
			suma+=sueldo;
			if (sueldo>1000) mil++;
		}
		System.out.printf("La suma de los 10 sueldos es: %.2f\nHay %d sueldos mayores de 1000€.\n\n", suma, mil);
	}
	
	private static void ejercicio15() {
		System.out.println("""
				15. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
				la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.""");
		sc = new Scanner (System.in);
		int sumaEd = 0, mayores = 0, altos = 0, edad;
		float sumaEs = 0, estatura;
		for (int i=0; i<5; i++) {
			System.out.print("Introduzca su edad ("+(i+1)+"/5): ");
			edad = sc.nextInt();
			sc.nextLine();
			sumaEd+=edad;
			if (edad>18) mayores++;
			System.out.print("Introduzca su estatura ("+(i+1)+"/5): ");
			estatura = sc.nextFloat();
			sc.nextLine();
			sumaEs+=estatura;
			if (estatura>1.75f) altos++;
		}
		System.out.printf("La media de edad es: %.2f\nHay %d alumno(s) mayor(es) de edad.", (float) sumaEd/5, mayores);
		System.out.printf("La media de estatura es: $.2f\nHay %d alumno(s) que mide(n) más de 1.75.\n\n", (float) sumaEs/5, altos);
	}
	
	private static void ejercicio16() {
		System.out.println("16. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.");
		sc = new Scanner (System.in);
		System.out.print("Introduzca un número entre 0 y 10: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<=10 && (n>=0 && n<=10); i++) System.out.printf("%d x %d = %d\n", n, i, n*i);
		System.out.println();
	}
	
	private static void ejercicio17() {
		System.out.println("""
				17. Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
				En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.
				Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas
				facturas se emitieron de más de 600€.""");
		sc = new Scanner (System.in);
		int code, Lvendidos, mayor_600=0, litros1=0;
		float precio, facturacion, total=0;
		for (int i=1; i<=5; i++) {
			System.out.print("Inserte el código del artículo ("+i+"/5): ");
			code = sc.nextInt();
			sc.nextLine();
			System.out.print("Inserte los litros vendidos ("+i+"/5): ");
			Lvendidos=sc.nextInt();
			sc.nextLine();
			System.out.print("Inserte el precio por litro ("+i+"/5): ");
			precio=sc.nextInt();
			sc.nextLine();
			facturacion=Lvendidos*precio;
			total+=facturacion;
			if (facturacion>600) mayor_600++;
			if (code==1) litros1+=Lvendidos;
		}
		System.out.printf("""
				\nFacturación total: %.2f€
				Cantidad vendida del artículo 1: %dL
				Hay %d factura(s) de más de 600€.\n
				""", total, litros1, mayor_600);
	}
	
	private static void ejercicio18() {
		System.out.println("""
				18. Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.
				Solo existen tres productos con precios:
				1. 0,6 €/litro
				2. 3 €/litro
				3: 1,25 €/litro""");
		sc = new Scanner (System.in);
		int code, Lvendidos, mayor_600 = 0, litros1 = 0;
		float precio = 0, facturacion, total = 0;
		for (int i=1; i<=5; i++) {
			do {
				System.out.print("Introduzca el código del artículo ("+i+"/5): ");
				code = sc.nextInt();
				sc.nextLine();
				if (code<1 || code>3) System.out.println("No existe un producto con ese código");
			} while (code<1 || code>3);
			switch(code) {
				case 1 -> precio = 0.6f;
				case 2 -> precio = 3;
				case 3 -> precio = 1.25f;
			}
			System.out.print("Introduzca los litros vendidos ("+i+"/5): ");
			Lvendidos = sc.nextInt();
			sc.nextLine();
			facturacion=Lvendidos*precio;
			total+=facturacion; 
			if (code==1) litros1+=Lvendidos;
			if (facturacion>600) mayor_600++;
		}
		System.out.printf("""
				\nFacturación total: %.2f€
				Cantidad vendida del artículo 1: %dL
				Hay %d factura(s) de más de 600€.\n
				""", total, litros1, mayor_600);
	}
	
	private static void ejercicio19() {
		System.out.println("19. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.");
		sc = new Scanner (System.in);
		int aprobados = 0, condicionados = 0, suspendidos = 0;
		float nota;
		for (int i=1; i<=6; i++) {
			do {
				System.out.print("Introduzca su nota ("+i+"/6) : ");
				nota = sc.nextFloat();
				sc.nextLine();
			} while (nota<0 || nota>10);
			if (nota<4) suspendidos++;
			else if (nota>=5) aprobados++;
			else condicionados++;
		}
		System.out.printf("""
				\nNúmero de alumnos suspendidos: %d
				Número de alumnos condicionados: %d
				Número de alumnos aprobados: %d\n
				""", suspendidos, condicionados, aprobados);
	}
	
	private static void ejercicio20() {
		System.out.println("20. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.");
		sc = new Scanner (System.in);
		int max = 0, sueldo;
		System.out.print("Introduzca la cantidad de sueldos a introducir: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=1; i<=n; i++) {
			System.out.print("Introduzca un sueldo ("+i+"/"+n+"): ");
			sueldo = sc.nextInt();			
			max = Math.max(sueldo, max);
		}
		System.out.println("El sueldo máximo es de "+max+"€.\n");
	}
	
	private static void ejercicio21() {
		System.out.println("21. Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.");
		sc = new Scanner (System.in);
		boolean negativo = false;
		int n;
		for (int i=1; i<=10; i++) {
			System.out.print("Introduzca un número ("+i+"/10): ");
			n = sc.nextInt();
			sc.nextLine();
			if (n<0) negativo = true;
		}
		System.out.println("\n"+(negativo ? "Se ha introducido al menos un número negativo" : "No se han introducido números negativos")+".\n");
	}
	
	private static void ejercicio22() {
		System.out.println("22. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.");
		sc = new Scanner (System.in);
		float nota;
		boolean suspensos = false;
		for (int i=1; i<=5; i++) {
			do {
				System.out.print("Introduzca una calificación ("+i+"/5): ");
				nota = sc.nextFloat();
				sc.nextLine();
			} while (nota<0 || nota>10);
			if (nota<5) suspensos = true;
		}
		System.out.println("\n"+(suspensos ? "Hay uno o más suspendidos" : "No hay ningún suspendido")+".\n");
	}
}
