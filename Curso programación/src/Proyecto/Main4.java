package Proyecto;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Main4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		do{System.out.print("1. Gestores\t\t2. Clientes\n"
				+ "3. Transferencias\t4. Mensajes\n"
				+ "5. Préstamos\t\t6. Salir\n"
				+ "Inserte un número: ");
		number=keyboard.nextInt();
		gestores(number); clientes(number); transferencias(number); mensajes(number); prestamos(number); salir(number);
		}while(number !=6);
		keyboard.close();
	}
	public static void gestores(int a) {if (a==1) {System.out.println("1 --> Gestores\n");}}
	public static void clientes(int a) {if (a==2) {System.out.println("2 --> Clientes\n");}}
	public static void transferencias(int a) {if (a==3) {System.out.println("3 --> Transferencias\n");}}
	public static void mensajes(int a) {if (a==4) {System.out.println("4 --> Mensajes\n");}}
	public static void prestamos(int a) {if (a==5) {System.out.println("5 --> Préstamos\n");}}
	public static void salir(int a) {if (a==6) {System.out.println("6 -> Salir\n");}}
}