/**
 * 
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class Ejercicios06_10 {
	public static void ejercicio06() {
		// Hacer un programa que tome dos números y diga si ambos son pares o impares.
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte otro número: "));
		if ((n1%2==0) && (n2%2==0)) JOptionPane.showMessageDialog(null, "Ambos números son pares");
		else if ((n1%2!=0) && (n2%2!=0)) JOptionPane.showMessageDialog(null, "Ambos números son impares");
		else JOptionPane.showMessageDialog(null, "Un número es par y el otro es impar");
	}
	
	public static void ejercicio07() {
		// Pedir tres números y mostrarlos ordenados de mayor a menor.
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número: "));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número: "));
		int n3=Integer.parseInt(JOptionPane.showInputDialog("Inserte el tercer número: "));
		if ((n1>n2)&&(n2>n3)&&(n1>n3)) JOptionPane.showMessageDialog(null, "La serie ordenada es: "+n1+'>'+n2+'>'+n3);
		else if ((n1<n2)&&(n2>n3)&&(n1>n3)) JOptionPane.showMessageDialog(null, "La serie ordenada es: "+n2+'>'+n1+'>'+n3);
		else if ((n1>n2)&&(n2<n3)&&(n1<n3)) JOptionPane.showMessageDialog(null, "La serie ordenada es: "+n3+'>'+n1+'>'+n2);
		else if ((n1>n2)&&(n2<n3)&&(n1>n3)) JOptionPane.showMessageDialog(null, "La serie ordenada es: "+n1+'>'+n3+'>'+n2);
		else if ((n1<n2)&&(n2>n3)&&(n1<n3)) JOptionPane.showMessageDialog(null, "La serie ordenada es: "+n2+'>'+n3+'>'+n1);
		else if ((n1<n2)&&(n2<n3)&&(n1<n3)) JOptionPane.showMessageDialog(null, "La serie ordenada es: "+n3+'>'+n2+'>'+n1);
		else JOptionPane.showMessageDialog(null, "ERROR \nHay dos números o más iguales");
	}
	
	public static void ejercicio08() {
		// Pedir un número entre 0 y 99999 y decir cuántas cifras tiene.
		int n = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número entre 0 y 99999: "));
		if ((n>=0)&&(n<=9)) JOptionPane.showMessageDialog(null, "El número "+n+" tiene una cifra.");
		else if ((n>=10)&&(n<=99)) JOptionPane.showMessageDialog(null, "El número "+n+" tiene dos cifras.");
		else if ((n>=100)&&(n<=999)) JOptionPane.showMessageDialog(null, "El número "+n+" tiene tres cifras.");
		else if ((n>=1000)&&(n<=9999)) JOptionPane.showMessageDialog(null, "El número "+n+" tiene cuatro cifras.");
		else if ((n>=10000)&&(n<=99999)) JOptionPane.showMessageDialog(null, "El número "+n+" tiene cinco cifras.");
		else JOptionPane.showMessageDialog(null, "ERROR \nEl número "+n+" no está en el rango establecido.");
	}
	
	public static void ejercicio09() {
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días.
		int dd=Integer.parseInt(JOptionPane.showInputDialog("Inserte el día: "));
		int mm=Integer.parseInt(JOptionPane.showInputDialog("Inserte el mes: "));
		int yyyy=Integer.parseInt(JOptionPane.showInputDialog("Inserte el año: "));
		// !(dd>=1) significa que dd no es ni mayor ni igual a 1
		if (!(dd>=1) || !(dd<=30)) JOptionPane.showMessageDialog(null, "ERROR\nEl día no es válido.");
		if (!(mm>=1) || !(mm<=12)) JOptionPane.showMessageDialog(null, "ERROR\nEl mes no es válido.");
		if (!(yyyy>=1)) JOptionPane.showMessageDialog(null, "ERROR\nEl año no es válido.");
		if ((dd>=1)&&(dd<=30)&&(mm>=1)&&(mm<=12)&&(yyyy>=1)) JOptionPane.showMessageDialog(null, "Fecha correcta.\nLa fecha es:\n"+dd+'/'+mm+'/'+yyyy);
	}
	
	public static void ejercicio10() {
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
		int dd=Integer.parseInt(JOptionPane.showInputDialog("Inserte el día: "));
		int mm=Integer.parseInt(JOptionPane.showInputDialog("Inserte el mes: "));
		int yyyy=Integer.parseInt(JOptionPane.showInputDialog("Inserte el año: "));
		// || es el operador or
		if ((dd<=0||dd>31)&&(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12)) JOptionPane.showMessageDialog(null, "ERROR\nEl día no es válido.");
		else if ((dd<=0||dd>30)&&(mm==4||mm==6||mm==9||mm==11)) JOptionPane.showMessageDialog(null, "ERROR\nEl día no es válido.");
		else if ((dd<=0||dd>28)&&(mm==2)) JOptionPane.showMessageDialog(null, "ERROR\nEl día no es válido.");
		else if ((mm<1||mm>12)) JOptionPane.showMessageDialog(null, "ERROR\nEl mes no es válido.");
		else if (yyyy<1) JOptionPane.showMessageDialog(null, "ERROR\nEl año no es válido.");
		
		if ((dd>=1 && dd<=31)&&(mm>=1 && mm<=12)&&(yyyy>=1)&&(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12))
			JOptionPane.showMessageDialog(null, "Fecha correcta.\nLa fecha es:\n"+dd+'/'+mm+'/'+yyyy);
		else if ((dd>=1)&&(dd<=30)&&(mm>=1)&&(mm<=12)&&(yyyy>=1)&&(mm==4||mm==6||mm==9||mm==11))
			JOptionPane.showMessageDialog(null, "Fecha correcta.\nLa fecha es:\n"+dd+'/'+mm+'/'+yyyy);
		else if ((dd>=1 && dd<=28)&&(mm==2)&&(yyyy>=1))
			JOptionPane.showMessageDialog(null, "Fecha correcta.\nLa fecha es:\n"+dd+'/'+mm+'/'+yyyy);
	}
	
	public static void main(String[] args) {
		// ejercicio06();
		// ejercicio07();
		// ejercicio08();
		// ejercicio09();
		// ejercicio10();

	}

}
