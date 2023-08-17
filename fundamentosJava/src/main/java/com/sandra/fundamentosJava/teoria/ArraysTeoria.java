package com.sandra.fundamentosJava.teoria;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.fundamentosJava.utilidades.MenuUtils;

public class ArraysTeoria {
	private static String opcion;
	private static Scanner sc;
	
	public static void temario() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado del tema 'Arrays': ", "TEORÍA DE ARRAYS", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Conceptos básicos", "Bucle for-each", "Operaciones con arrays", "Arrays multidimensionales",
										"Cadenas como arrays"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Conceptos básicos" -> conceptosBasicos();
			case "Bucle for-each" -> bucleForEach();
			case "Operaciones con arrays" -> operacionesArrays();
			case "Arrays multidimensionales" -> arraysMultidimensionales();
			case "Cadenas como arrays" -> cadenasComoArrays();
			case "Volver atrás" -> MenuUtils.subMenu("Arrays");
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void conceptosBasicos() {
		System.out.print("""
				Un array es una estructura de datos capaz de almacenar una colección de valores del mismo tipo.
				Los arrays se pueden declarar de dos maneras:
				· 'Tipo_de_variable[] Nombre_del_arreglo = new Tipo_de_variable [dimensión]' si se declara vacío
				· 'Tipo_de_variable[] Nombre_del_arreglo = {datos separados por comas}' si se declara con valores
				""");
		int [] numeros = new int [3];
		String[] nombres = {"Jorge", "Sandra", "Isidro", "Mónica"};
		System.out.print("""
				Para guardar valores en un array, se accede a la posición que se quiera rellenar o cambiar y se le asigna el valor.
				Las posiciones siempre empiezan desde 0 y no se pueden modificar, es decir, no se puede alargar ni acortar un array.
				""");
		numeros[0]=7; numeros[1]=10; numeros[2]=13;
		System.out.print("""
				Para recorrer un array se puede utilizar el bucle for, y el iterador debe ser menor a la longitud del array.
				La longitud se puede hallar con la propiedad 'length'.
				""");
		System.out.print("Números:");
		for (int i=0; i<numeros.length; i++) System.out.print(" "+numeros[i]);
		System.out.print("\nNombres:");
		for (int i=0; i<nombres.length; i++) System.out.print(" "+nombres[i]);
		System.out.println("\nUna alternativa a imprimir todos los elementos de un array de datos String es la función 'join' de la clase String.");
		System.out.println("Nombres: "+String.join(", ", nombres));
		System.out.println("También se puede imprimir el array directamente con la función 'toString' de la clase Arrays.");
		System.out.println("Números: "+Arrays.toString(numeros)+"\n");
	}
	
	private static void bucleForEach() {
		System.out.print("""
				El bucle for-each es una alternativa al bucle for para recorrer los arrays.
				La única diferencia entre ellos es que no se puede acceder a la posición del elemento con el bucle for-each.
				""");
		String[] nombres = {"Jorge", "Sandra", "Isidro", "Yolanda", "Luis", "María", "Daniel", "Mónica"};
		System.out.print("Array de nombres recorrido con el bucle for:");
		for (int i=0; i<nombres.length; i++) System.out.print(" "+nombres[i]);
		System.out.print("\nArray de nombres recorrido con el bucle for-each:");
		for (String n:nombres) System.out.print(" "+n);
		System.out.println("\n");
	}
	
	private static void operacionesArrays() {
		sc = new Scanner (System.in);
		System.out.print("""
				BUSCAR UN ELEMENTO
				Para ello, se puede recorrer el array y comprobar valor por valor si coincide con el elemento a buscar.
				Se debe declarar una variable de tipo booleana con valor 'false' y cambiar su valor si hay una coincidencia.
				""");
		String[] nombres = {"Jorge", "Sandra", "Isidro", "Yolanda", "Luis", "María", "Daniel", "Mónica"};
		boolean coincidencia = false;
		System.out.print("Introduzca un nombre para buscarlo en el array: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < nombres.length && !coincidencia; i++) coincidencia = nombres[i].equals(nombre);
		System.out.println("El nombre "+nombre+(coincidencia ? "" : " no")+" se encuentra en el array.\n");
		
		System.out.print("""
				COPIAR UN ARRAY
				Se puede realizar una copia del array de dos maneras:
				· Creando un nuevo array con la longitud que se desea y recorrerlo para guardar los valores del original.
				  Una vez hecho esto, se reasigna la copia al array original.
				· Utilizando la función 'copyOf' de la clase Arrays
				También se puede asignar directamente a un nuevo array pero los cambios en la copia se verán reflejados en el original.
				""");
		int[] nums = {1, 2, 3, 4}, numsAux = new int[4], numsCopia = Arrays.copyOf(nums, 4), numsEq = nums;
		for (int i=0; i<nums.length; i++) numsAux[i] = nums[i];
		numsAux[1] = 5;
		numsCopia[2] = 6;
		numsEq[3] = 7;
		System.out.println("nums | numsAux | numsCopia | numsEq");
		for (int i=0; i<nums.length; i++) System.out.printf("%-4d | %-7d | %-9d | %-5d\n", nums[i], numsAux[i], numsCopia[i], numsEq[i]);
		
		System.out.print("""
				\nREDIMENSIONAR UN ARRAY
				Como se ha mencionado anteriormente, no se puede modificar la longitud de los arrays.
				Sin embargo, se puede realizar una copia del array con los dos primeros métodos explicados anteriormente con diferente longitud.
				Con el primer método, cuando se va a copiar el contenido con el bucle, se debe utilizar la longitud del array más corto como
				límite del iterador para evitar errores. Se puede reasignar el array auxiliar al original si solo se quiere redimensionar.
				""");
		char[] letras = {'a', 'b', 'c', 'd'}, letrasAux = new char[3], letrasCopia = Arrays.copyOf(letras, 5);
		for (int i=0; i<letrasAux.length; i++) letrasAux[i] = letras[i];
		letrasCopia[4] = 'e';
		System.out.print("Array original:");
		for (char l:letras) System.out.printf(" %c", l);
		System.out.print("\nArray auxiliar:");
		for (char l:letrasAux) System.out.printf(" %c", l);
		System.out.print("\nCopia del array:");
		for (char l:letrasCopia) System.out.printf(" %c", l);
		
		System.out.print("""
				\n\nBORRAR UN ELEMENTO
				Para borrar un elemento del array se deben mover todos los elementos menos el que se quiere eliminar
				a una posición anterior. El último elemento se eliminará del array redimensionándolo, así se podrá
				también consultar la longitud del array para hallar el número de elementos que contiene.
				""");
		System.out.println("Array original: "+Arrays.toString(nums));
		System.out.print("Introduzca la posición que desea eliminar: ");
		int posicion = sc.nextInt();
		sc.nextLine();
		for (int i = posicion; i<nums.length-1; i++) nums[i] = nums[i + 1];
		nums = Arrays.copyOf(nums, nums.length - 1);
		System.out.println("Resultado del borrado: "+Arrays.toString(nums));
		
		System.out.print("""
				\nAÑADIR UN ELEMENTO EN CUALQUIER POSICIÓN
				Para insertar un nuevo elemento se deben seguir los mismos pasos del borrado de forma inversa, es decir,
				redimensionar primero el array y, si no se quiere añadir el nuevo elemento en la última posición,
				mover los elementos que irán después del nuevo elemento a una posición posterior.
				""");
		System.out.print("Introduzca el nuevo número que se añadirá al array: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Introduzca la posición donde desea añadir el nuevo número: ");
		posicion = sc.nextInt();
		sc.nextLine();
		nums = Arrays.copyOf(nums, nums.length + 1);
		for (int i = nums.length-1; i>posicion; i--) nums[i] = nums[i-1];
		nums[posicion] = n;
		System.out.println("Resultado de la inserción: "+Arrays.toString(nums));
		
		System.out.print("""
				\nORDENAR ARRAYS
				Se puede utilizar la función sort de la clase Arrays para ordenar de manera ascendente los arrays.
				También se pueden ordenar inversamente los arrays de datos no primitivos.
				""");
		int[] numeros = {8, 4, 13};
		System.out.println("Array de números: "+Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println("Array ordenado: "+Arrays.toString(numeros));
		System.out.println("Array de nombres: "+Arrays.toString(nombres));
		Arrays.sort(nombres);
		System.out.println("Array ordenado: "+Arrays.toString(nombres));
		Arrays.sort(nombres, Comparator.reverseOrder());
		System.out.println("Array ordenado inversamente: "+Arrays.toString(nombres));
		String[] alfnum = {"1234", "Mundo", "5678", "Hola", "0987"};
		System.out.println("Array alfanumérico: "+Arrays.toString(alfnum));
		Arrays.sort(alfnum);
		System.out.println("Array ordenado: "+Arrays.toString(alfnum));
		Arrays.sort(alfnum, Comparator.reverseOrder());
		System.out.println("Array ordenado inversamente: "+Arrays.toString(alfnum));
	}
	
	private static void arraysMultidimensionales() {
		System.out.print("""
				Un array puede contener arrays de datos. En ese caso, se habla de arrays multidimensionales.
				Las dimensiones del array se determinan con el número de corchetes. Por ejemplo, un array tipo
				int[][] tendrá dos dimensiones, y otro de tipo String[][][] tendrá tres dimensiones.
				Para declararlos sin valores, se debe inicializar la primera dimensión. Posteriormente, se
				inicializan las siguientes dimensiones. Los arrays contenidos en el array principal pueden tener
				diferentes dimensiones.
				""");
		int[][] nums2D = new int[3][];
		for(int i=0; i<nums2D.length; i++) nums2D[i] = new int[2];
		String[][] palabras2D = new String[3][];
		palabras2D[0] = new String[2];
		palabras2D[1] = new String[4];
		palabras2D[2] = new String[3];
		System.out.print("""
				Para acceder a un valor a leer o modificarlo, se deben indicar ambas
				dimensiones. Además, para recorrer un array multidimensional, se debe
				recorrer la primera dimensión y luego cada array interno con otro bucle.
				""");
		for (int i=0; i<nums2D.length; i++) for (int j=0; j<nums2D[i].length; j++) nums2D[i][j] = i+j;
		for (int i=0; i<nums2D.length; i++) {
			for (int j=0; j<nums2D[i].length; j++) System.out.printf("%-3d", nums2D[i][j]);
			System.out.println();
		}
		for (int i=0; i<palabras2D.length; i++) for (int j=0; j<palabras2D[i].length; j++) palabras2D[i][j] = (i+j)%2==0 ? "Hola" : "Mundo";
		for (int i=0; i<palabras2D.length; i++) {
			for (int j=0; j<palabras2D[i].length; j++) System.out.printf("%s ", palabras2D[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	
	private static void cadenasComoArrays() {
		System.out.print("""
				Las cadenas internamente funcionan como un array de caracteres, por lo que
				se pueden recorrer de forma similar a un array.
				Para acceder a un elemento, se utiliza la función charAt en lugar de los corchetes.
				""");
		String cadena = "Hola mundo";
		for (int i= 0; i<cadena.length(); i++) System.out.printf("[%d]: %c\n", i, cadena.charAt(i));
		System.out.println();
	}
	
}
