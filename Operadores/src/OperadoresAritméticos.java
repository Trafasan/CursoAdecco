import java.util.Scanner;

/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class OperadoresAritméticos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Entrada=new Scanner(System.in);
		float número1,número2,suma,resta,mult,div,resto;
		
		System.out.print("Inserte dos números: ");
		número1=Entrada.nextFloat();
		número2=Entrada.nextFloat();
		/*
		 * Se pueden insertar los números de dos maneras:
		 * Insertando los dos juntos separados por un espacio
		 * Insertando uno presionando luego Enter, y añadir después el siguiente
		 */
		
		suma=número1+número2;
		resta=número1-número2;
		mult=número1*número2;
		div=número1/número2;
		resto=número1%número2;//Este operador se refiere al resto de la división
		
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("La multiplicación es:"+mult);
		System.out.println("La división es:"+div);
		System.out.println("El resto es:"+resto);
	}

}
