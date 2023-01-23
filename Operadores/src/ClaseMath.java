/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class ClaseMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double raízA=Math.sqrt(9);
		System.out.println("Raíz cuadrada de 9: "+raízA);
		
		int raízB=(int)Math.sqrt(9);
		System.out.println("Raíz cuadrada de 9: "+raízB);
		//No es recomendable, el resultado es más exacto con decimales.
		
		double raízC=Math.sqrt(36.67);
		System.out.println("Raíz cuadrada de 36.67: "+raízC);
		
		double base=5, exp=2;
		double resultadoA=Math.pow(base, exp);
		System.out.println("5 al cuadrado: "+resultadoA);
		
		double númeroA=4.56;
		long resultadoB=Math.round(númeroA);
		System.out.println("Redondear 4.56: "+resultadoB);
		
		float númeroB=1.23f;
		int resultadoC=Math.round(númeroB);
		System.out.println("Redondear 1.23: "+resultadoC);
		
		double númeroC=Math.random();
		System.out.println("Número aleatorio: "+númeroC);
		//Estas son solo algunas operaciones de la clase Math, pero hay muchas más.

	}

}
