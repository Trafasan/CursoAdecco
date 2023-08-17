package com.sandra.poo.teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sandra.poo.clases.Coche;
import com.sandra.poo.utilidades.MenuUtils;

public class Poo {
	private static String opcion;
	private static Scanner sc;
	
	public static void apartados() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un apartado del tema 'POO': ", "TEORÍA DE POO", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] {"Clases, atributos y métodos", "Constructores", "Getters y setters", "Otros métodos importantes",
										"Herencia"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Clases, atributos y métodos" -> clasesAtributosMetodos();
			case "Constructores" -> constructores();
			case "Getters y setters" -> getterSetter();
			case "Otros métodos importantes" -> otrosMetodos();
			case "Herencia" -> Herencia.apartados();
			case "Volver atrás" -> MenuUtils.mainMenu();
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void clasesAtributosMetodos() {
		sc = new Scanner (System.in);
		System.out.println("""
				Cada archivo .java es una clase, por lo que la clase tendrá el mismo nombre que el archivo.
				Para poder crear un objeto de una clase, se deben definir las propiedades y métodos que tendrán dichos objetos.
				Todos los objetos creados a partir de una misma clase tendrán la misma funcionalidad (métodos)
				pero sus atributos pueden tener diferentes valores.
				En el siguiente ejemplo, se ha creado un objeto de la clase Coche, la cual contiene los atributos
				marca (String), modelo (String) y km (int).""");
		Coche coche = new Coche("Chevrolet", "Spark", 10000);
		System.out.printf("Coche creado: %s\n", coche);
		System.out.print("""
				Con el método viaje() se pueden cambiar los kilómetros del coche.
				Introduzca los kilómetros que ha recorrido el coche durante el viaje:\s""");
		int km = sc.nextInt();
		sc.nextLine();
		coche.setKm(coche.getKm()+km);
		System.out.printf("Ahora, los datos del coche serán los siguientes: %s\n", coche.toString());
		System.out.printf("""
				Tanto para los atributos como los métodos se suele indicar el modificador de acceso. Existen tres tipos:
				· public: Se pueden utilizar en todas las clases del proyecto.
				· private: Solo se pueden utilizar en la misma clases.				
				· protected: Se pueden utilizar en la misma clase y en clases que hereden de esta.
				Si no se especifica modificador, se pueden utilizar en las clases del mismo paquete.
				Además, existe el modificador static, el cual denota que el atributo o el método está vinculado a la propia clase.
				A los atributos o métodos estáticos se les puede llamar desde los métodos de la clase,
				o desde fuera usando directamente el nombre de la clase.
				Número de coches creados durante el uso del programa: %d
				
				""", Coche.cochesCreados);
	}
	
	private static void constructores() {
		System.out.println("""
				Para poder crear objetos de una clase es necesario declarar un constructor.
				Existen diferentes tipos de constructores:
				· Constructor por defecto: No recibe ningún parámetro y está vacío.
				· Constructor parametrizado: Recibe uno o más parámetros. No es necesario que reciba todos los atributos de la clase.
				· Constructor sin parámetros: No recibe parámetros, pero asigna valores fijos a los atributos.
				· Constructor de copia: Recibe un parámetro del mismo tipo que la clase. Sirve para hacer una copia de un objeto
				en vez de referenciarlo. Así se evita modificar el objeto original al cambiar un valor de la copia.""");
		Coche coche = new Coche("Chevrolet", "Spark", 10000), coche_nuevo = new Coche("Peugout", "3008"),
				coche_defecto = new Coche(), coche_copia = new Coche(coche_defecto), coche_copia2 = coche_defecto;
		coche_copia2.setKm(coche_copia2.getKm()+15000);
		System.out.printf("""
				Coches creados:
				· Constructor con todos los parámetros: %s
				· Constructor con algunos parámetros: %s
				· Constructor sin parámetros: %s
				· Constructor de copia: %s
				· Sin constructor (se han cambiado los kilómetros): %s
				
				""", coche, coche_nuevo, coche_defecto, coche_copia, coche_copia2);
	}
	
	private static void getterSetter() {
		System.out.println("""
				Si se declaran los atributos como privados o protegidos, no se pueden acceder a ellos directamente.
				Para poder hacerlo, se deben declarar los getters y los setters.
				Con el get, se obtiene el valor del atributo y, con el set, se modifica.
				Estos métodos también permiten controlar los datos:
				· Con el get, se puede controlar la manera de obtener el valor
				· Con el set, se puede controlar el valor que se quieren insertar, por lo que resulta útil para
				  no crear o modificar un coche con kilómetros negativos o sin marca (String vacío).""");
		Coche coche = new Coche("Chevrolet", "Spark", 10000);
		System.out.printf("Coche creado: %s\n", coche);
		coche.setKm(-1000);
		System.out.printf("Kilómetros: %d\n\n", coche.getKm());
	}
	
	private static void otrosMetodos() {
		System.out.println("""
				Aparte de los getters y los setters, se pueden declarar otros métodos útiles en programación orientada a objetos:
				hashCode()
					Este método devuelve un número entero (hash) que 'identifica' al objeto cuando se guarda en una estructura de datos
					conocida como HashMap (u otros como Hashtable, HashSet). Este método complementa al método equals, ya que,
					si dos objetos son iguales, deben tener el mismo hash.
				equals()
					Este método compara dos objetos y determina si son iguales. Se especifican los valores que hacen que dos objetos sean iguales.
					Usando el ejemplo de los coches, dos coches con la misma marca y modelo pero con diferente kilometraje son iguales.
				toString()
					Este método convierte los datos del objeto a String para poder imprimirlos. Si no se sobreescribe este método,
					se imprime el nombre de la clase que se ha instanciado y la dirección de memoria del objeto. En este método se
					puede utilizar el propio atributo o el getter. No hace falta llamar a este método para que se invoque.
				Estos tres métodos están presentes en la clase Object, de la cual heredan todas las clases que se crean.
				Por tanto, no se declaran, se sobreescriben. Para declarar que un método está sobreescrito se anota @Override encima de este.""");
		Coche coche1 = new Coche(), coche2 = new Coche("Opel", "Tigra"), coche3 = new Coche(coche1);
		coche3.setKm(5000);
		System.out.printf("	· Coches: %s, %s, %s.\n", coche1, coche2, coche3);
		System.out.printf("	· El primer coche es %s al segundo coche.\n", coche1.equals(coche2)? "igual" : "diferente");
		System.out.printf("	· El primer coche es %s al tercer coche.\n\n", coche1.equals(coche3)? "igual" : "diferente");
	}
	
}
