package Ejercicios;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Ejercicio6O {
//Hacer un programa que calcule el cuadrado de una suma.
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		double a,b,Resultado1,Resultado2;
		System.out.print("Inserte dos números: ");
		a=Entrada.nextDouble();
		b=Entrada.nextDouble();
		
		Resultado1=Math.pow(a+b,2);
		Resultado2=Math.pow(a,2)+Math.pow(b,2)+2*a*b;
		
		System.out.println("El cuadrado de la suma de "+a+" y "+b+ " es: "+Resultado1+" (método 1)");//El método 1 es (a+b)^2
		System.out.println("El cuadrado de la suma de "+a+" y "+b+ " es: "+Resultado2+" (método 2)");//El método 2 es a^2+2ab+b^2
		
		Entrada.close();
		
	}

}
