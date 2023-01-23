
package TeoríaOperaciones;

public class Operación {
	//Atributos
	
	//Métodos
	
	//Método para sumar ambos números
	public int sumar(int n1, int n2) {int suma = n1+n2; return suma;}
	
	//Método para restar ambos números
		public int restar(int n1, int n2) {int resta = n1-n2; return resta;}
		
	//Método para multiplicar ambos números
	public int multiplicar(int n1, int n2) {int mult = n1*n2; return mult;}
	
	//Método para dividir ambos números
	public float dividir(int n1, int n2) {float div = (float)n1/n2; return div;}
	
	public void mostrarResultados(int suma, int resta, int mult, float div) {
		System.out.println("La suma de los números es "+suma);
		System.out.println("La resta de los números es "+resta);
		System.out.println("La multiplicación de los números es "+mult);
		System.out.println("La división de los números es "+div);
	}
}
