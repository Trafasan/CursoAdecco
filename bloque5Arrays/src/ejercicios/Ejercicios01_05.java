/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios01_05 {
	public static void ejercicio01() {
		// Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
		Scanner sc = new Scanner (System.in);
		float[] n=new float[5];
		for (int x=0; x<5; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/5): ");
			n[x]=sc.nextFloat();
		}
		System.out.println("\nLos números son: ");
		for (float x:n) System.out.println(x);
		sc.close();
	}
	
	public static void ejercicio02() {
		// Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido.
		Scanner sc = new Scanner (System.in);
		float[] n=new float[5];
		for (int x=0; x<5; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/5): ");
			n[x]=sc.nextFloat();
		}
		System.out.println("\nLos números son: ");
		for (int x=4; x>=0; x--) System.out.println(" "+n[x]);
		sc.close();
	}
	
	public static void ejercicio03() {
		/*
		 * Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos,
		 * la media de los negativos y contar el número de ceros.
		 */
		Scanner sc = new Scanner (System.in);
		int nPos=0, nNeg=0, nCero=0;
		float sPos=0,  sNeg=0;
		float[] n = new float [5];
		for (int x=0; x<5; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/5): ");
			n[x]=sc.nextFloat();
			if (n[x]>0) {
				sPos+=n[x];
				nPos++;
			}
			else if (n[x]<0) {
				sNeg+=n[x];
				nNeg++;
			}
			else nCero++;
		}
		float mPos=sPos/nPos;
		float mNeg=sNeg/nNeg;
		System.out.println((nPos==0) ? "No se introdujeron números positivos." : "La media de los números positivos es: "+mPos);
		System.out.println((nNeg==0) ? "No se introdujeron números negativos." : "La media de los números negativos es: "+mNeg);
		System.out.println((nCero==0) ? "No se introdujeron ceros." : "La cantidad de ceros introducidos es: "+nCero);
		sc.close();
	}
	
	public static void ejercicio04() {
		/*
		 * Leer 10 números enteros, guardarlos en un arreglo.
		 * Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc.
		 */
		Scanner sc = new Scanner (System.in);
		int[] n=new int [10];
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n[x]=sc.nextInt();
		}
		System.out.println("La serie de números es: ");
		for (int x=0; x<5; x++) {
			System.out.println(n[x]);
			System.out.println(n[9-x]);
		}
		sc.close();
	}
	
	public static void ejercicio05() {
		/*
		 * Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma:
		 * el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
		 */
		Scanner sc = new Scanner (System.in);
		int[] n1= new int [10];
		System.out.println("Números de la serie A");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n1[x]=sc.nextInt();
		}
		int[] n2= new int [10];
		System.out.println("\nNúmeros de la serie B");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n2[x]=sc.nextInt();
		}
		int[] tabla= new int [20];
		int j=0;
		for(int x=0; x<10; x++) {
			tabla[j]=n1[x];
			j++;
			tabla[j]=n2[x];
			j++;
		}
		System.out.print("\nNúmeros ordenados:");
		for (int x:tabla) System.out.print(" "+x);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio01();
		// ejercicio02();
		// ejercicio03();
		// ejercicio04();
		// ejercicio05();

	}

}
