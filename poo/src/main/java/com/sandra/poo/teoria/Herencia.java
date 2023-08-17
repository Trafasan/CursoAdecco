package com.sandra.poo.teoria;

import javax.swing.JOptionPane;

import com.sandra.poo.clases.herencia.Alumno;
import com.sandra.poo.clases.herencia.NivelEducativo;
import com.sandra.poo.clases.herencia.Profesor;

public class Herencia {
	private static String opcion;
	
	public static void apartados() {
		do {
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione un subapartado del apartado 'Herencia': ", "TEORÍA DE HERENCIA",
								JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Concepto de herencia", "Clases abstractas",
										"Interfaces y enumerados"}, null).toString();
			} catch (NullPointerException e) {
				opcion = "Volver atrás";
			}
			switch (opcion) {
			case "Concepto de herencia" -> conceptoHerencia();
			case "Clases abstractas" -> clasesAbstractas();
			case "Interfaces y enumerados" -> interfacesEnums();
			case "Volver atrás" -> Poo.apartados();
			}
		} while(!opcion.equals("Volver atrás"));
	}
	
	private static void conceptoHerencia() {
		System.out.println("""
				La herencia permite crear clases derivadas (o clases hijas) a partir de otras (clases base o padre),
				que heredan sus atributos y métodos. Por ejemplo, las clases Alumno y Profesor (clases hijas) pueden
				heredar de la clase Persona (clase padre).""");
		Alumno a = new Alumno("Sandra", 16, "12345678A", NivelEducativo.Bachiller_de_ciencias, 1);
		Profesor p = new Profesor("Yolanda", 46, "98765432Z");
		a.addNotas(4, 6, 12, -3);
		System.out.println(a+"\n"+p);
		System.out.println("""
				Como se comentó anteriormente con los métodos especiales, se pueden sobreescribir los métodos de las clases padre
				declarándolos en las clases hijas y añadiendo la anotación @Override encima de este.
				Si no se quiere sobreescribir sino complementarlo, se puede llamar al método padre con super.nombre_metodo(), como
				es el caso de los métodos toString() de Alumno y Profesor. Además, la palabra reservada super también se puede utilizar
				en los constructores para llamar a uno de los constructores de la clase padre.""");
	}
	
	private static void clasesAbstractas() {
		System.out.println("""
				Las clases abstractas no permiten instanciar objetos, pero se pueden instanciar objetos de las clases derivadas de esta.
				En este caso, se ha declarado la clase Persona como abstracta.
				Se pueden declarar métodos abstractos en estas clases. La particularidad de estos métodos es que se deben sobreescribir
				en las clases derivadas con la anotación @Override.
				Una clase derivada o un método sobrescrito (override) también pueden ser declarados como abstractos a su vez, por lo que
				se debería generar un nuevo nivel de herencia a partir de dicha clase si se quieren crear objetos.""");
		Alumno a = new Alumno("Sandra", 16, "12345678A", NivelEducativo.Bachiller_de_ciencias, 1);
		Profesor p = new Profesor("Yolanda", 46, "98765432Z");
		a.presentacion();
		p.presentacion();
	}
	
	private static void interfacesEnums() {
		System.out.println("""
				Tanto las interfaces como los enumerados son clases especiales de Java.
				· Una interfaz es como una clase completamente abstracta que solo contiene métodos, y en la cual todos sus métodos son abstractos.
				  Se utilizan para definir una serie de métodos que deben implementar las clases que hereden de dicha interfaz.
				  Para heredar una interfaz se usa la palabra implements. Las clases pueden heredar de varias interfaces.
				· Un enumerado (enum) limita la creación de objetos a los especificados explícitamente en la implementación de la clase.
				  Se puede declarar un constructor, pero debe ser privado para que no se puedan crear nuevos objetos.""");
	}
}
