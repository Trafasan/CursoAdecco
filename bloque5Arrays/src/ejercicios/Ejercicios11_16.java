/**
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicios11_16 {
	public static void ejercicio11() {
		/*
		 * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los cuardaremos en una tabla de tamaño 10.
		 * Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
		 */
		Scanner sc = new Scanner (System.in);
		int n[]=new int [10], posN=0, y=0;
		boolean creciente=true;
		do {
			for(int x=0; x<5; x++) {
				System.out.print("Inserte un número ("+(x+1)+"/5): ");
				n[x]=sc.nextInt();
				if (x ==0 || n[x]<n[x+1]) creciente=true;
				else {
					creciente=false;
					break;
				}
			}
			if (!creciente) System.out.println("ERROR\nLa serie de números introducida no está ordenada de forma creciente");
		} while (!creciente);
		System.out.print("Inserte otro número: ");
		int N=sc.nextInt();
		while (n[y]<N && y<5) {
			posN++;
			y++;
		}
		for (int x=4; x>=posN; x--) n[x+1]=n[x];
		n[posN]=N;
		System.out.print("Números de la serie ordenados:");
		for (int x:n) System.out.print(" "+x);
		sc.close();
	}
	
	public static void ejercicio12() {
		/*
		 * Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9).
		 * Eliminar el elemento situado en la posición dada sin dejar huecos.
		 */
		Scanner sc =  new Scanner (System.in);
		int n[]=new int [10];
		System.out.println("Números de la serie");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n[x]=sc.nextInt();
		}
		int posN;
		do {
			System.out.print("\nInserte la posición del número a eliminar (del 0 al 9): ");
			posN=sc.nextInt();
		} while (posN<0 || posN>9);
		for (int x=posN; x<9; x++) n[x]=n[x+1];
		System.out.print("Serie nueva:");
		for (int x:n) System.out.print(" "+x);
		sc.close();
	}
	
	public static void ejercicio13() {
		/*
		 * Leer 10 números enteros en una tabla.
		 * Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.
		 */
		Scanner sc = new Scanner (System.in);
		int n[]=new int [10], pares[]=new int [10], impares[]=new int [10];
		int p=0, i=0;
		System.out.println("Números de la serie");
		for (int x=0; x<10; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/10): ");
			n[x]=sc.nextInt();
			if (n[x]%2==0) {
				pares[p]=n[x];
				p++;
			}
			else {
				impares[i]=n[x];
				i++;
			}
		}
		if (p!=0) {
			System.out.print("\nNúmeros pares insertados:");
			for (int x:pares) System.out.print(" "+x);
		}
		else System.out.println("\nNo se insertaron números pares.");
		if (i!=0) {
			System.out.print("\nNúmeros impares insertados:");
			for (int x:impares) System.out.print(" "+x);
		}
		else System.out.println("\nNo se insertaron números impares.");
		sc.close();
	}
	
	public static void ejercicio14() {
		/*
		 * Leer dos series de 10 enteros, que estarán ordenados crecientemente.
		 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
		 */
		Scanner sc = new Scanner (System.in);
		int serieA[]=new int [10], serieB[]=new int[10];
		boolean crecienteA=true, crecienteB=true;
		System.out.println("Números de la serie A");
		do {
			for(int x=0; x<10; x++) {
				System.out.print("Inserte un número ("+(x+1)+"/10): ");
				serieA[x]=sc.nextInt();
				if (x == 0 || serieA[x]<serieA[x+1]) crecienteA=true;
				else {
					crecienteA=false;
					break;
				}
			}
			if (!crecienteA) System.out.println("\nERROR\nLa serie de números introducida no está ordenada de forma creciente\n");
		} while (!crecienteA);
		System.out.println("\nNúmeros de la serie B");
		do {
			for(int x=0;x<10;x++) {
				System.out.print("Inserte un número ("+(x+1)+"/10): ");
				serieB[x]=sc.nextInt();
				if (x == 0 || serieB[x]<serieB[x+1]) crecienteB=true;
				else {
					crecienteB=false;
					break;
				}
			}
			if (!crecienteB) {System.out.println("\nERROR\nLa serie de números introducida no está ordenada de forma creciente\n");}
		} while (!crecienteB);
		int serieC[]=new int [20], a=0, b=0, c=0;
		while (a<10 && b<10) {
			if (serieA[a]<serieB[b]) {
				serieC[c]=serieA[a];
				a++;
			}
			else {
				serieC[c]=serieB[b];
				b++;
			}
			c++;
		}
		if (a==10) 
			while (b<10) {
				serieC[c]=serieB[b];
				b++;
				c++;
			}
		else 
			while (a<10) {
				serieC[c]=serieA[a];
				a++;
				c++;
			}
		System.out.print("\nSerie ordenada:");
		for (int x:serieC) System.out.println(" "+x);
		sc.close();
	}
	
	public static void ejercicio15() {
		/*
		 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
		 * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
		 */
		Scanner sc = new Scanner (System.in);
		int n[]=new int[10];
		boolean creciente = true, nPresente = false;
		System.out.println("Serie de números");
		do {
			for(int x=0; x<10; x++) {
				System.out.print("Inserte un número ("+(x+1)+"/10): ");
				n[x]=sc.nextInt();
				if (x == 0 || n[x-1]<n[x]) creciente = true;
				else {
					creciente = false;
					break;
				}
			}
			if (!creciente) System.out.println("\nERROR\nLa serie de números introducida no está ordenada de forma creciente.\n");
		} while (!creciente);
		System.out.print("\nInserte el número que busca: ");
		int nBuscado=sc.nextInt();
		for (int x=0; x<10; x++) {
			if (n[x]==nBuscado) {
				System.out.print("Ese número se encuentra en la posición "+x+".");
				nPresente=true;
			}
		}
		if (!nPresente) System.out.print("El número introducido no se encuentra en la serie.");
		sc.close();
	}
	
	public static void ejercicio16() {
		/*
		 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
		 * Cada grupo (o clase) está compuesto por 5 alumnos.
		 * Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
		 * Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado).
		 */
		Scanner sc = new Scanner (System.in);
		float notas1[]= new float [5], notas2[]= new float [5], notas3[]= new float [5];
		System.out.println("Notas del primer trimestre");
		for (int x=0; x<5; x++) {
			System.out.print("Inserte la nota del alumno "+(x+1)+": ");
			notas1[x]=sc.nextFloat();
		}
		System.out.println("\nNotas del segundo trimestre");
		for (int x=0; x<5; x++) {
			System.out.print("Inserte la nota del alumno "+(x+1)+": ");
			notas2[x]=sc.nextFloat();
		}
		System.out.println("\nNotas del tercer trimestre");
		for (int x=0; x<5; x++) {
			System.out.print("Inserte la nota del alumno "+(x+1)+": ");
			notas3[x]=sc.nextFloat();
		}
		int suma1=0, suma2=0, suma3=0;
		System.out.println("\nNota media de cada trimestre");
		for (float x:notas1) suma1+=x;
		float media1=suma1/5f;
		System.out.println("Primer trimestre: "+media1);
		for (float x:notas2) suma2+=x;
		float media2=suma2/5f;
		System.out.println("Segundo trimestre: "+media2);
		for (float x:notas3) suma3+=x;
		float media3=suma3/5f;
		System.out.println("Tercer trimestre: "+media3);
		System.out.print("\nInserte el número del alumno del cual se va a calcular su media: ");
		int nAlumno=sc.nextInt();
		nAlumno--;
		float MediaN=(notas1[nAlumno]+notas2[nAlumno]+notas3[nAlumno])/3;
		System.out.println("La media del alumno "+(nAlumno+1)+" es: "+MediaN);
		sc.close();
	}
	
	public static void main(String[] args) {
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
		// ejercicio14();
		// ejercicio15();
		// ejercicio16();
	}

}
