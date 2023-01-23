package Teoría;
/**
 * 
 */

/**
 * @author Sandra
 *
 */
public class IncrementoDetrimento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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

}
