/**
 * 
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Ejercicio15B {
/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años,y la cantidad de alumnos que miden más de 1.75.
 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner (System.in);
		int edad, sumaEd=0, mayores=0, altos=0, contador=0;
		float estatura,sumaEs=0, mediaEd, mediaEs;
		
		while (contador<5) {
			System.out.print("Inserte su edad ("+(contador+1)+"/5): ");
			edad=Entrada.nextInt(); sumaEd+=edad;
			if (edad>18) {mayores++;} else {}
			System.out.print("Inserte su estatura ("+(contador+1)+"/5): ");
			estatura=Entrada.nextFloat(); sumaEs+=estatura;
			if (estatura>1.75f) {altos++;} else {}
			contador++;
		}
		mediaEd= (float) sumaEd/contador; mediaEs= (float) sumaEs/contador;
		System.out.println("La media de edad es: "+mediaEd+"\nHay "+mayores+" alumno(s) mayor(es) de edad.");
		System.out.println("La media de estatura es: "+mediaEs+"\nHay "+altos+" alumno(s) que mide(n) más de 1.75.");
		
		Entrada.close();

	}

}
