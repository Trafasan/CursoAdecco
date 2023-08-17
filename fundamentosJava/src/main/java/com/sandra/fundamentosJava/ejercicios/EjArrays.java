package com.sandra.fundamentosJava.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class EjArrays {
	private static String opcion;
	private static Scanner sc;
	
	public static void ejercicios() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un ejercicio del tema 'Arrays': ", "EJERCICIOS DE ARRAYS", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6",
										"Ejercicio 7", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Ejercicio 11", "Ejercicio 12", "Ejercicio 13",
										"Ejercicio 14", "Ejercicio 15"}, null).toString();
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
			case "Volver atrás" -> MenuUtils.subMenu("Arrays");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void ejercicio01() {
		System.out.println("1. Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.");
		sc = new Scanner (System.in);
		float[] numeros = new float[5];
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i]=sc.nextFloat();
			sc.nextLine();
		}
		System.out.print("Los números son:");
		for (float n:numeros) System.out.print(" "+n);
		System.out.println("\n");		
	}
	
	private static void ejercicio02() {
		System.out.println("2. Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido.");
		sc = new Scanner (System.in);
		float[] numeros = new float[5];
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i]=sc.nextFloat();
			sc.nextLine();
		}
		System.out.print("Los números son:");
		for (int i=numeros.length-1; i>=0; i--) System.out.println(" "+numeros[i]);
		System.out.println("\n");
	}
	
	private static void ejercicio03() {
		System.out.println("""
				3. Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar
				la media de los números positivos, la media de los negativos y contar el número de ceros.""");
		sc = new Scanner (System.in);
		int nPos = 0, nNeg = 0, nCero = 0;
		float sPos = 0, sNeg = 0;
		float[] numeros = new float [5];
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i]=sc.nextFloat();
			sc.nextLine();
			if (numeros[i]>0) {
				sPos+=numeros[i];
				nPos++;
			}
			else if (numeros[i]<0) {
				sNeg+=numeros[i];
				nNeg++;
			}
			else nCero++;
		}
		System.out.println(nPos==0 ? "No se introdujeron números positivos." : "La media de los números positivos es: "+sPos/nPos);
		System.out.println(nNeg==0 ? "No se introdujeron números negativos." : "La media de los números negativos es: "+sNeg/nNeg);
		System.out.println((nCero==0 ? "No se introdujeron ceros." : "La cantidad de ceros introducidos es: "+nCero)+"\n");
	}
	
	private static void ejercicio04() {
		System.out.println("""
				4. Leer 10 números enteros, guardarlos en un arreglo.
				Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.""");
		sc = new Scanner (System.in);
		int[] numeros = new int [10];
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i]=sc.nextInt();
			sc.nextLine();
		}
		System.out.print("La serie de números es:");
		for (int i=0; i<numeros.length/2; i++) System.out.print(" "+numeros[i]+" "+numeros[numeros.length-1-i]);
		System.out.println("\n");
	}
	
	private static void ejercicio05() {
		System.out.println("""
				5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma:
				el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.""");
		sc = new Scanner (System.in);
		int[] num1 = new int [10], num2 = new int [10], tabla = new int [20];
		System.out.println("Números de la serie A");
		for (int i=0; i<num1.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, num1.length);
			num1[i]=sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Números de la serie B");
		for (int i=0; i<num2.length; i++) {
			System.out.printf("Introduzca un número (%d/$%d): ", i+1, num2.length);
			num2[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0, j=0; i<tabla.length/2; i++, j+=2) {
			tabla[j] = num1[i];
			tabla[j+1]=num2[i];
		}
		System.out.print("Números ordenados:");
		for (int n:tabla) System.out.print(" "+n);
		System.out.println("\n");
	}
	
	private static void ejercicio06() {
		System.out.println("""
				6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma:
				 de la tabla A, 3 de la B, otros 3 de A, otros 3 de B, etc.""");
		sc = new Scanner (System.in);
		int tablaA[] = new int [12], tablaB[] = new int [12], tablaC[] = new int [24];
		System.out.println("Números de la serie A");
		for (int i=0; i<tablaA.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, tablaA.length);
			tablaA[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Números de la serie B");
		for (int i=0; i<tablaB.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, tablaB.length);
			tablaB[i] = sc.nextInt();
			sc.nextLine();
		}
		for (int i=0, k=0; i<tablaC.length/2; i+=3) {
			for(int j=0; j<3; j++, k++) tablaC[k]=tablaA[i+j];
			for(int j=0; j<3; j++, k++) tablaC[k]=tablaB[i+j];
		}
		System.out.print("Números ordenados:");
		for (int n:tablaC) System.out.print(" "+n);
		System.out.println("\n");
	}
	
	private static void ejercicio07() {
		System.out.println("""
				7. Diseñar una aplicación que declare una tabla de 10 elementos enteros.
				Leer mediante el teclado 8 números.
				Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detras.""");
		sc = new Scanner(System.in);
		int numeros[] = new int [10];
		System.out.println("Números de la serie");
		for (int i = 0; i<8; i++) {
			System.out.printf("Introduzca un número (%d/8): ", i+1);
			numeros[i]=sc.nextInt();
			sc.nextLine();
		}
		System.out.print("Introduzca un nuevo número: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Introduzca su posición: ");
		int posicion = sc.nextInt() - 1;
		sc.nextLine();
		for (int i = 8; i > posicion; i--) numeros[i]=numeros[i-1];
		numeros[posicion]=num;
		System.out.print("La nueva serie es:");
		for (int i=0; i<numeros.length-1; i++) System.out.print(" "+numeros[i]);
		System.out.println("\n");
	}
	
	private static void ejercicio08() {
		System.out.println("""
				8. Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo:
				el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.""");
		sc = new Scanner (System.in);
		int numeros[] = new int [10];
		System.out.println("Números de la serie");
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i!=numeros.length-1 ? i+1 : 0] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Números de la serie ordenados: "+Arrays.toString(numeros)+"\n");
	}
	
	private static void ejercicio09() {
		System.out.println("""
				9. Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo
				(N será introducido por el usuario).""");
		sc = new Scanner (System.in);
		int numeros[] = new int [10];
		System.out.println("Números de la serie");
		for (int i=0; i<numeros.length;i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.print("Introduzca el número de desplazamientos: ");
		int N = sc.nextInt();
		sc.nextLine();
		int last;
		for(int i=0; i<N; i++) {
			last = numeros[numeros.length-1];
			for (int j=numeros.length-1; j>0; j--) numeros[j]=numeros[j-1];
			numeros[0] = last;
		}
		System.out.println("Números de la serie ordenados: "+Arrays.toString(numeros)+"\n");
	}
	
	private static void ejercicio10() {
		System.out.println("""
				10. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los cuardaremos en una tabla de tamaño 10.
				Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.""");
		sc = new Scanner (System.in);
		int[] numeros = new int [10];
		boolean creciente;
		do {
			creciente = true;
			for(int i=0; i<5 && creciente; i++) {
				System.out.printf("Introduzca un número (%d/5): ", i+1);
				numeros[i]=sc.nextInt();
				sc.nextLine();
				creciente = i == 0 || numeros[i-1] < numeros[i];
			}
			if (!creciente) System.err.println("La serie de números ya no está ordenada de forma creciente.\nIntroduzca de nuevo los números");
		} while (!creciente);
		System.out.print("Introduzca otro número: ");
		int N = sc.nextInt();
		sc.nextLine();
		for (int i=5; i>=0 && (i==5 || numeros[i+1]!=N); i--) numeros[i] = i==0 ? N : (numeros[i-1]>=N ? numeros[i-1] : N);
		System.out.println("Números de la serie ordenados: "+Arrays.toString(numeros)+"\n");
	}
	
	private static void ejercicio11() {
		System.out.println("""
				11. Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9).
				Eliminar el elemento situado en la posición dada sin dejar huecos.""");
		sc =  new Scanner (System.in);
		int[] numeros = new int [10];
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i] = sc.nextInt();
			sc.nextLine();
		}
		int posicion;
		do {
			System.out.print("Introduzca la posición del número a eliminar (del 0 al 9): ");
			posicion = sc.nextInt();
			sc.nextLine();
			if (posicion<0 || posicion>9) System.err.println("El número introducido no está en el rango establecido.");
		} while (posicion<0 || posicion>9);
		for (int i = posicion; i<numeros.length-1; i++) numeros[i] = numeros[i + 1];
		numeros = Arrays.copyOf(numeros, numeros.length - 1);
		System.out.println("Serie nueva: "+Arrays.toString(numeros)+"\n");
	}
	
	private static void ejercicio12() {
		System.out.println("""
				12. Leer 10 números enteros en una tabla.
				Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.""");
		sc = new Scanner (System.in);
		int[] numeros = new int [10], pares = new int [10], impares = new int [10];
		int n_par = 0, n_impar = 0;
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
			numeros[i] = sc.nextInt();
			sc.nextLine();
			if (numeros[i]%2==0) pares[n_par++]=numeros[i];
			else impares[n_impar++]=numeros[i];
		}
		pares = Arrays.copyOf(pares, n_par);
		impares = Arrays.copyOf(impares, n_impar);
		System.out.print(n_par!=0 ? "Números pares introducidos:" : "No se introdujeron números pares.");
		if (n_par!=0) for (int n:pares) System.out.print(" "+n);
		System.out.print("\n"+(n_impar!=0 ? "Números impares introducidos:" : "No se introdujeron números impares."));
		if (n_impar!=0) for (int n:impares) System.out.print(" "+n);
		System.out.println("\n");
	}
	
	private static void ejercicio13() {
		System.out.println("""
				13. Leer dos series de 10 enteros, que estarán ordenados crecientemente.
				Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.""");
		sc = new Scanner (System.in);
		int[] serieA = new int [10], serieB = new int[10], serieC = new int [20];
		boolean creciente;
		System.out.println("Números de la serie A");
		do {
			creciente = true;
			for(int i=0; i<serieA.length && creciente; i++) {
				System.out.printf("Introduzca un número (%d/%d): ", i+1, serieA.length);
				serieA[i] = sc.nextInt();
				sc.nextLine();
				creciente = i == 0 || serieA[i-1] < serieA[i];
			}
			if (!creciente) System.err.println("La serie de números ya no está ordenada de forma creciente.\nIntroduzca de nuevo los números");
		} while (!creciente);
		System.out.println("Números de la serie B");
		do {
			creciente = true;
			for(int i=0; i<serieB.length && creciente; i++) {
				System.out.printf("Introduzca un número (%d/%d): ", i+1, serieB.length);
				serieB[i] = sc.nextInt();
				sc.nextLine();
				creciente = i == 0 || serieB[i-1] < serieB[i];
			}
			if (!creciente) System.err.println("La serie de números ya no está ordenada de forma creciente.\nIntroduzca de nuevo los números");
		} while (!creciente);
		for (int i=0, j=0; j<serieC.length; i++, j++) {
			serieC[j] = serieA[i];
			serieC[++j] = serieB[i];
		}
		Arrays.sort(serieC);
		System.out.print("\nSerie ordenada:");
		for (int n:serieC) System.out.print(" "+n);
	}
	
	private static void ejercicio14() {
		System.out.println("""
				14. Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
				Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.""");
		sc = new Scanner (System.in);
		int[] numeros = new int[10];
		boolean creciente, nPresente = false;
		do {
			creciente = true;
			for(int i=0; i<numeros.length && creciente; i++) {
				System.out.printf("Introduzca un número (%d/%d): ", i+1, numeros.length);
				numeros[i]=sc.nextInt();
				sc.nextLine();
				creciente = i == 0 || numeros[i-1] < numeros[i];
			}
			if (!creciente) System.err.println("La serie de números ya no está ordenada de forma creciente.\nIntroduzca de nuevo los números");
		} while (!creciente);
		System.out.print("Introduzca el número que busca: ");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<numeros.length && !nPresente; i++)
			if (nPresente = numeros[i] == num) System.out.printf("El número se encuentra en la posición %d.", i);
		if (!nPresente) System.out.print("El número introducido no se encuentra en la serie.");
		System.out.println("\n");
	}
	
	private static void ejercicio15() {
		System.out.println("""
				15. Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
				Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
				Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra
				en la posición N (N se lee por teclado).""");
		sc = new Scanner (System.in);
		float[] notas1 = new float [5], notas2 = new float [5], notas3 = new float [5];
		System.out.println("Notas del primer trimestre");
		for (int i=0; i<notas1.length; i++) {
			System.out.printf("Introduzca la nota del alumno nº%d: ", i+1);
			notas1[i] = sc.nextFloat();
			sc.nextLine();
		}
		System.out.println("Notas del segundo trimestre");
		for (int i=0; i<notas2.length; i++) {
			System.out.printf("Introduzca la nota del alumno nº%d: ", i+1);
			notas2[i] = sc.nextFloat();
			sc.nextLine();
		}
		System.out.println("Notas del tercer trimestre");
		for (int i=0; i<notas3.length; i++) {
			System.out.printf("Introduzca la nota del alumno nº%d: ", i+1);
			notas3[i] = sc.nextFloat();
			sc.nextLine();
		}
		float suma1 = 0, suma2 = 0, suma3 = 0;
		System.out.println("Nota media de cada trimestre");
		for (int i=0; i<5; i++) {
			suma1+=notas1[i];
			suma2+=notas2[i];
			suma3+=notas3[i];
		}
		System.out.printf("Primer trimestre: %.2f.\n", suma1/notas1.length);
		System.out.printf("Segundo trimestre: %.2f.\n", suma2/notas2.length);
		System.out.printf("Tercer trimestre: %.2f.\n", suma3/notas3.length);
		System.out.print("Introduzca el número del alumno del cual se va a calcular su media: ");
		int nAlumno = sc.nextInt();
		sc.nextLine();
		float mediaN = (notas1[--nAlumno]+notas2[nAlumno]+notas3[nAlumno])/3;
		System.out.printf("La media del alumno %d es: %.2f", nAlumno+1, mediaN);
	}
}
