/**
 * 
 */
package bucles;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Bucles {
	public static void bucleWhile() {
		Scanner sc=new Scanner (System.in);
		System.out.print("Inserte el número final de la serie: ");
		int contador=sc.nextInt();
		int x=1;
		while (x<=contador) { // Este ciclo comprueba antes de ejecutarse que la condición es válida
			System.out.println(x);
			x++;
		}
		sc.close();
	}
	
	public static void bucleDoWhile() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte el número final de la serie: ");
		int contador=sc.nextInt();
		int x=1;
		do { //Este ciclo comprueba después de ejecutarse que la condición es válida
			System.out.println(x);
			x+=3;
		}while(x<=contador);
		sc.close();
	}
	
	public static void bucleFor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserte el número final de la serie: ");
		int contador=sc.nextInt();
		for (int x=2;x<=contador;x+=2) {
			System.out.println(x);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// bucleWhile();
		// bucleDoWhile();
		// bucleFor();
	}

}
