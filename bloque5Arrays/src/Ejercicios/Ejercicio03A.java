/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio03A {
//Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int Npos=0, Nneg=0, Ncero=0;
		float Spos=0,  Sneg=0;
		float[] número=new float [5];
		for (int x=0; x<5; x++) {
			System.out.print("Inserte un número ("+(x+1)+"/5): ");
			número[x]=Entrada.nextFloat();
			if (número[x]>0) {Spos+=número[x]; Npos++;}
			else if (número[x]<0) {Sneg+=número[x]; Nneg++;}
			else {Ncero++;}
		}
		float Mpos=Spos/Npos, Mneg=Sneg/Nneg;
		if (Npos==0) {System.out.println("No se introdujeron números positivos.");}
		else {System.out.println("La media de los números positivos es: "+Mpos);}
		if (Nneg==0) {System.out.println("No se introdujeron números negativos.");}
		else {System.out.println("La media de los números negativos es: "+Mneg);}
		if (Ncero==0) {System.out.println("No se introdujeron ceros.");}
		else {System.out.println("La cantidad de ceros introducidos es: "+Ncero);}
		
		Entrada.close();

	}

}
