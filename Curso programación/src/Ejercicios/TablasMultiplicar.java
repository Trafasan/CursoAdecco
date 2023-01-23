/**
 * 
 */
package Ejercicios;

/**
 * @author Sandra
 *
 */
public class TablasMultiplicar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int x=0; x<10; x++) {
			System.out.println("Tabla de multiplicar del "+x);
			for (int y=1; y<=10; y++) {
				int producto =x*y;
				System.out.println(x+" x "+y+" = "+producto);
			}
			System.out.println("\n");
		}
	}
}
