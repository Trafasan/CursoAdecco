/**
 * 
 */
package intro;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Introducción {
	public static void datosPrimitivos() {
		byte n1=13;
		System.out.println("Número entero: "+n1);
		/*
		 * La variable byte tiene como rango (-128,127).
		 * El espacio en memoria de byte es de 8 bits.
		 */
		short n2=-20913;
		System.out.println("Número entero: "+n2);
		/*
		 * La variable short tiene como rango (-32.768,32.767).
		 * El espacio en memoria de short es de 16 bits.
		 */
		int n3=1679420913;
		System.out.println("Número entero: "+n3);
		/*
		 * La variable int tiene como rango (-2.147.483.648,2.147.483.647).
		 * El espacio en memoria de int es de 32 bits.
		 */
		long n4=-2079420913;
		System.out.println("Número entero: "+n4);
		/*
		 * La variable long tiene como rango (-9.223.372.036.854.775.808,9.223.372.854.775.807).
		 * El espacio en memoria de long es de 64 bits.
		 */
		float d1=3.14f; //Es importante poner la f ya que daría error si faltase
		System.out.println("Número decimal: "+d1);
		/*
		 * La variable float tiene como rango (1,4e-45,3,4e38).
		 * El espacio en memoria de float es de 32 bits.
		 */
		double d2=3.14159265;
		System.out.println("Número decimal: "+d2);
		/*
		 * La variable double tiene como rango (4,9e-324,1,8e308).
		 * El espacio en memoria de float es de 64 bits.
		 */
		char letra='J';
		System.out.println("Letra: "+letra);
		char nChar='2';
		System.out.println("Número: "+nChar);
		char s='$';
		System.out.println("Símbolo: "+s);
		//Cuando solo es un caracter, se utiliza una coma 
		boolean verdad=true;
		System.out.println("La decisión es: "+verdad);
		boolean falso=false;
		System.out.println("La decisión es: "+falso);
	}
	public static void datosNoPrimitivosYCadenas() {
		Integer n=null;//Dato no primitivo, también se pueden poner números
		System.out.println("El número es: "+n);
		String frase="Hola, ¿qué tal?";//Cadena de caracteres
		System.out.println(frase);	
	}
	public static void constantes() {
		int n=10;
		System.out.println(n);
		n=15;
		System.out.println(n);
		final int n2=13;
		System.out.println(n2);
	}
	public static void entradaSalidaDatosConsola() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserte un número entero: ");
		int nE=sc.nextInt();
		System.out.println("El número es: "+nE);
		System.out.print("Inserte un número decimal: ");
		/*
		 * Al meter en la consola el número decimal, hay que ponerlo con una coma.
		 * Si se pone un punto, la consola da error.
		 */
		float nD=sc.nextFloat();
		System.out.println("El número es: "+nD);
		System.out.print("Inserte una palabra: ");
		String palabra=sc.next();//Esta acción guarda la cadena hasta el primer espacio que encuentre
		System.out.println("La palabra es: "+palabra);
		System.out.print("Inserte una cadena: ");
		String frase=sc.nextLine();//Esta acción guarda la cadena entera y limpia el Scanner
		System.out.println("La cadena es: "+frase);
		System.out.print("Inserte una letra: ");
		char letra=sc.next().charAt(0);//La última parte de la línea permite guardar solo el primer caracter
		System.out.println("La letra es: "+letra);
		sc.close();
	}
	public static void entradaSalidaDatosJOptionPane() {
		String cadena;
		int entero;
		char letra;
		double decimal;
		cadena=JOptionPane.showInputDialog("Inserte una cadena: ");
		entero=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número entero: "));
		letra=JOptionPane.showInputDialog("Inserte una letra: ").charAt(0);
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Inserte un número decimal: "));
		//Al meter el número decimal en JOptionPane, hay que ponerlo con un punto.
		JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
		JOptionPane.showMessageDialog(null,"El número decimal es: "+entero);
		JOptionPane.showMessageDialog(null, "La letra es: "+letra);
		JOptionPane.showMessageDialog(null, "El número decimal es: "+decimal);
	}
	
	public static void main(String[] args) {
		// datosPrimitivos();
		// datosNoPrimitivosYCadenas();
		// constantes();
		// entradaSalidaDatosConsola();
		// entradaSalidaDatosJOptionPane();
	}

}
