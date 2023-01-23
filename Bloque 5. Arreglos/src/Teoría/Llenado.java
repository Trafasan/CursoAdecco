/**
 * 
 */
package Teoría;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Llenado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int nElementos;
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de elementos: "));
		
		char[] letras=new char[nElementos];
		System.out.println("Inserte los elementos a continuación");
		for (int x=0;x<nElementos;x++) {
			System.out.print("Inserte un caracter ("+(x+1)+"/"+nElementos+"): ");
			letras[x]=Entrada.next().charAt(0);
		}
		System.out.println("\nLos caracteres son: ");
		for (int x=0;x<nElementos;x++) {
			System.out.print(letras[x]+" ");
		}
		
		Entrada.close();

	}

}
