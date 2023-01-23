/**
 * 
 */
package Teoría;

/**
 * @author Sandra
 *
 */
public class BucleForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] nombres= {"Jorge", "Sandra", "Juan", "Yolanda", "Luis", "María", "Roberto", "Jessica"};
		
		for (int x=0;x<nombres.length;x++) {System.out.println(nombres[x]);}
		
		for (String x:nombres) {System.out.println("Nombre: "+x);}

	}

}
