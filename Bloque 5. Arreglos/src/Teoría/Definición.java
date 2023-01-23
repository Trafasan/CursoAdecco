/**
 * 
 */
package Teoría;

/**
 * @author Sandra
 *
 */
public class Definición {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Arreglos unidimensionales:
		 * Tipo_de_variable[] Nombre_del_arreglo = new Tipo_de_variable [dimensión]. Las posiciones siempre empiezan desde 0.
		 */
		int [] númerosA =new int [3];
			númerosA[0]=7; númerosA[1]=10; númerosA[2]=13;	//También se puede utilizar int[] números ={7,10,13};
			for (int x=0;x<3;x++) {System.out.println(númerosA[x]);}
			
		int[] númerosB ={5,7,9,10};
			for (int y=0;y<4;y++) {System.out.println(númerosB[y]);}

	}

}
