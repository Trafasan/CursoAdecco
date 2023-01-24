/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios11_15 {
	public static void ejercicio11() {
		// Diseñar un programa que muestre el producto de los 10 primeros números impares.
		long mult = 1;
		for (int x=1;x<=20;x+=2) mult *= x;
		System.out.println("El producto de los primeros 10 números impares es "+mult+'.');
	}
	
	public static void ejercicio11ConScanner() {
		Scanner sc=new Scanner (System.in);
		int contador = 0,mult = 1;
		while (contador<10) {
			System.out.print("Inserte un número impar ("+(contador+1)+"/10): ");
			int n = sc.nextInt();
			if (n%2!=0) {contador++; mult*=n;}
		}
		System.out.println("El producto de los 10 números impares es "+mult+'.');
		sc.close();
	}
	
	public static void ejercicio12() {
		// Pedir un número y calcular su factorial.
		Scanner sc=new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int n = sc.nextInt();
		long factorial=1;
		for (int x=1;x<=n;x++) factorial*=x;
		System.out.println("El factorial de "+n+" es "+factorial+'.');
		sc.close();
	}
	
	public static void ejercicio13() {
		// Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
		Scanner sc = new Scanner (System.in);
		int contador=0,sumaP=0,sumaN=0,cantP=0,cantN=0,ceros=0;
		while (contador<10) {
			System.out.print("Inserte un número ("+(contador+1)+"/10): ");
			int n = sc.nextInt();
			if (n>0) {
				contador++;
				sumaP+=n;
				cantP++;
			}
			else if (n<0) {
				contador++;
				sumaN+=n;
				cantN++;
			}
			else {
				contador++;
				ceros++;
			}
		}
		float mediaP= (float) sumaP/cantP;
		float mediaN= (float) sumaN/cantN;
		if (cantP==0) System.out.println("No se insertaron números positivos."
					+ "\nLa media de los números negativos es: "+mediaN
					+ "\nLa cantidad de ceros es: "+ceros);
		else if (cantN==0) System.out.println("La media de los números positivos es: "+mediaP
					+"\nNo se insertaron números negativos."
					+ "\nLa cantidad de ceros es: "+ceros);
		else System.out.println("La media de los números positivos es: "+mediaP
					+"\nLa media de los números negativos es: "+mediaN
					+"\nLa cantidad de ceros es: "+ceros);
		sc.close();
	}
	
	public static void ejercicio14() {
		// Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de $1000.
		Scanner sc=new Scanner (System.in);
		int contador=0, mil=0;
		float suma=0;
		while (contador<10) {
			System.out.print("Inserte un sueldo ("+(contador+1)+"/10): ");
			float sueldo=sc.nextInt();
			contador++;suma+=sueldo;
			if (sueldo>1000) mil++;
		}
		System.out.println("La suma de los 10 sueldos es: $"+suma+"\nHay "+mil+" sueldos mayores de $1000.");
		sc.close();
	}
	
	public static void ejercicio15() {
		/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
		 * la cantidad de alumnos mayores de 18 años,y la cantidad de alumnos que miden más de 1.75.
		 */
		Scanner sc = new Scanner (System.in);
		int sumaEd=0, mayores=0, altos=0, contador=0;
		float sumaEs=0;
		while (contador<5) {
			System.out.print("Inserte su edad ("+(contador+1)+"/5): ");
			int edad = sc.nextInt();
			sumaEd+=edad;
			if (edad>18) mayores++;
			System.out.print("Inserte su estatura ("+(contador+1)+"/5): ");
			float estatura = sc.nextFloat();
			sumaEs+=estatura;
			if (estatura>1.75f) altos++;
			contador++;
		}
		float mediaEd= (float) sumaEd/contador;
		float mediaEs= (float) sumaEs/contador;
		System.out.println("La media de edad es: "+mediaEd+"\nHay "+mayores+" alumno(s) mayor(es) de edad.");
		System.out.println("La media de estatura es: "+mediaEs+"\nHay "+altos+" alumno(s) que mide(n) más de 1.75.");
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio11();
		// ejercicio11ConScanner();
		// ejercicio12();
		// ejercicio13();
		// ejercicio14();
		// ejercicio15();

	}

}
