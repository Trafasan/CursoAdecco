/**
 * 
 */
package operadores;

import java.util.Scanner;

/**
 * @author Sandra
 *
 */
public class Operadores {
	public static void operadoresAritmeticos() {
		Scanner sc=new Scanner(System.in);
		float n1,n2,suma,resta,mult,div,resto;
		System.out.print("Inserte dos números: ");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		sc.nextLine();
		/*
		 * Se pueden insertar los números de dos maneras:
		 * Insertando los dos juntos separados por un espacio
		 * Insertando uno presionando luego Enter, y añadir después el siguiente
		 */
		suma=n1+n2;
		resta=n1-n2;
		mult=n1*n2;
		div=n1/n2;
		resto=n1%n2; // Este operador se refiere al resto de la división
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("La multiplicación es:"+mult);
		System.out.println("La división es:"+div);
		System.out.println("El resto es:"+resto);
		sc.close();
	}
	
	public static void operadoresAritmeticosCombinadosConAsignacion() {
		int n1=10;		
		n1+=5;// Esto es igual a n1=n1+5		
		System.out.println("El resultado de la suma es: "+n1);
		int n2=13;		
		n2-=5;//Esto es igual a n2=n2-5		
		System.out.println("El resultado de la resta es: "+n2);
		// Este tipo de expresiones sirven para todos los operadores aritméticos
	}
	
	public static void incrementoDetrimento() {
		int a=5;
		a++;//Esto equivale a a+=1 y, por tanto, a a=a+1
		System.out.println("El resultado del incremento es: "+a);
		int b=5;		
		b--;//Esto equivale a b-=1 y, por tanto, a b=b-1
		System.out.println("El resultado del detrimento es: "+b);
		int x=5, y;
		y=++x;
		/*
		 * Si se ponen los símbolos + después de la x, el valor de y sería 5.
		 * Esto ocurre ya que se produce la asignación antes que el incremento.
		 * Pasaría lo mismo si en vez del incremento, se usa el detrimento.
		 */
		System.out.println("El valor de y es: "+y);
		System.out.println("El valor de x es: "+x);
	}
	
	public static void claseMath() {
		double raiz1=Math.sqrt(9);
		System.out.println("Raíz cuadrada de 9: "+raiz1);
		int raiz2=(int)Math.sqrt(9);
		System.out.println("Raíz cuadrada de 9: "+raiz2);
		//No es recomendable, el resultado es más exacto con decimales.
		double raiz3=Math.sqrt(36.67);
		System.out.println("Raíz cuadrada de 36.67: "+raiz3);
		double base=5, exp=2;
		double resultadoA=Math.pow(base, exp);
		System.out.println("5 al cuadrado: "+resultadoA);
		double n1=4.56;
		long resultadoB=Math.round(n1);
		System.out.println("Redondear 4.56: "+resultadoB);
		float n2=1.23f;
		int resultadoC=Math.round(n2);
		System.out.println("Redondear 1.23: "+resultadoC);
		double n3=Math.random();
		System.out.println("Número aleatorio: "+n3);
		//Estas son solo algunas operaciones de la clase Math, pero hay muchas más.
	}
	
	public static void main(String[] args) {
		// operadoresAritmeticos();
		// operadoresAritmeticosCombinadosConAsignacion();
		// incrementoDetrimento();
		// claseMath();
	}

}
