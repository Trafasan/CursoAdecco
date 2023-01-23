package Proyecto;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		do {
			System.out.print("Inserte un número: ");
			number=keyboard.nextInt();
			switch(number) {
			case 1: System.out.println("1 --> Gestores"); break;
			case 2: System.out.println("2 --> Clientes"); break;
			case 3: System.out.println("3 --> Transferencias"); break;
			case 4: System.out.println("4 --> Mensajes"); break;
			case 5: System.out.println("5 --> Préstamos"); break;
			case 6: System.out.println("6 -> Salir"); break;
			}
		}while(number !=6);
		keyboard.close();

	}

}
