/**
 * 
 */
package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Arrays {
	public static void definicionArray() {
		/*Arreglos unidimensionales:
		 * Tipo_de_variable[] Nombre_del_arreglo = new Tipo_de_variable [dimensión]. Las posiciones siempre empiezan desde 0.
		 */
		int [] n1 =new int [3];
			n1[0]=7; n1[1]=10; n1[2]=13;	//También se puede utilizar int[] n1 ={7,10,13};
			for (int x=0;x<3;x++) {System.out.println(n1[x]);}
			
		int[] n2 ={5,7,9,10};
			for (int y=0;y<4;y++) {System.out.println(n2[y]);}
	}
	
	public static void llenadoDeArrays() {
		Scanner sc=new Scanner (System.in);
		int nElementos=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de elementos: "));
		char[] letras=new char[nElementos];
		System.out.println("Inserte los elementos a continuación");
		for (int x=0;x<nElementos;x++) {
			System.out.print("Inserte un caracter ("+(x+1)+"/"+nElementos+"): ");
			letras[x]=sc.nextLine().charAt(0);
		}
		System.out.println("\nLos caracteres son: ");
		for (int x=0;x<nElementos;x++) System.out.print(letras[x]+" ");
		sc.close();
	}
	
	public static void bucleForEach() {
		String [] nombres= {"Jorge", "Sandra", "Juan", "Yolanda", "Luis", "María", "Roberto", "Jessica"};
		for (int x=0;x<nombres.length;x++) System.out.println(nombres[x]);
		for (String x:nombres) System.out.println("Nombre: "+x); // Bucle for each
	}
	
	public static void main(String[] args) {
		// definicionArray();
		// llenadoDeArrays();
		// bucleForEach();
	}

}
