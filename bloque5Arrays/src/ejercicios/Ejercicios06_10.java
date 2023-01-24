/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios06_10 {
	public static void ejercicio06() {
		/*
		 * Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma:
		 * 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de B, etc.
		 */
		Scanner sc = new Scanner (System.in);
		int tablaA[]=new int [12], tablaB[]=new int [12], tablaC[]=new int [24];
		System.out.println("Números de la serie A");
		for (int i=0; i<12; i++) {
			System.out.print("Inserte un número ("+(i+1)+"/12): ");
			tablaA[i]=sc.nextInt();
		}
		System.out.println("\nNúmeros de la serie B");
		for (int i=0; i<12; i++) {
			System.out.print("Inserte un número ("+(i+1)+"/12): ");
			tablaB[i]=sc.nextInt();
		}
		int x=0, j=0;
		while(x<12) {
			for(int i=0; i<3; i++) {tablaC[j]=tablaA[x+i];j++;}
			for(int i=0; i<3; i++) {tablaC[j]=tablaB[x+i];j++;}
			x+=3;
		}
		System.out.print("\nNúmeros ordenados:");
		for (int y:tablaC) System.out.print(" "+y);
		sc.close();
	}
	
	public static void ejercicio07() {
		/*
		 * Crear un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
		 * Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
		 */
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte el número de horas: ");
		int horasT = sc.nextInt();
		int horas = horasT%24;
		int díasT = horasT/24;
		int días = díasT%7;
		int semanas = díasT/7;
		System.out.print(horasT+" horas son equivalentes a "+semanas+" semanas, "+días+" días y "+horas+" horas.");
		sc.close();
	}
	
	public static void ejercicio08() {
		/*
		 * Diseñar una aplicación que declare una tabla de 10 elementos enteros.
		 * Leer mediante el teclado 8 números.
		 * Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detras.
		 */
		Scanner sc = new Scanner(System.in);
		int n[]=new int [10];
		System.out.println("Números de la serie");
		for (int x=0;x<8;x++) {
			System.out.print("Inserte un número ("+(x+1)+"/8): ");
			n[x]=sc.nextInt();
		}
		System.out.print("\nInserte un nuevo número: ");
		int nNuevo=sc.nextInt();
		System.out.print("Inserte su posición: ");
		int y=sc.nextInt(); y--;
		for (int x=7;x>=y;x--) {n[x+1]=n[x];}
		n[y]=nNuevo;
		System.out.print("\nLa nueva serie es: ");
		for (int x=0;x<9;x++) System.out.print(n[x]);
		sc.close();
	}
	
	public static void ejercicio09() {
		/*
		 * Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo:
		 * el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
		 */
		Scanner sc = new Scanner (System.in);
		int n[]=new int [10];
		System.out.println("Números de la serie");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n[x]=sc.nextInt();
		}
		System.out.print("Números de la serie ordenados:");
		for (int x=0; x<10; x++) {
			int y=x-1; if (y==-1) {y=9;}
			System.out.print(" "+n[y]);
		}
		sc.close();
	}
	
	public static void ejercicio10() {
		// Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo (N es digitado por el usuario).
		Scanner sc = new Scanner (System.in);
		int n[]=new int [10];
		System.out.println("Números de la serie");
		for (int x=0;x<10;x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n[x]=sc.nextInt();
		}
		System.out.print("\nInserte el número de desplazamientos: ");
		int N=sc.nextInt();
		
		for(int y=1; y<=N; y++) {
			int last= n[9];
			for (int x=8; x>=0;x--) {n[x+1]=n[x];}
			n[0]=last;
		}
		System.out.print("Números de la serie ordenados:");
		for (int x:n) System.out.print(" "+x);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio06();
		// ejercicio07();
		// ejercicio08();
		// ejercicio09();
		// ejercicio10();
	}

}
