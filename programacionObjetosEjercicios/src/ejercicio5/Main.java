package ejercicio5;

import java.util.Scanner;

public class Main {
	public static double areaMayor(Triángulos isosceles[]) {
		double area;
		area = isosceles[0].getArea();
		for(int i=1; i<isosceles.length; i++) {
			if(isosceles[i].getArea() > area) {
				area = isosceles[i].getArea();
			}
		}
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, lado;
		int nTriangulos;
		System.out.print("Inserte la cantidad de triángulos: ");
		nTriangulos = sc.nextInt();
		Triángulos isosceles[] = new Triángulos[nTriangulos];
		for(int i=0; i<isosceles.length; i++) {
			System.out.println("\nDatos del triángulo "+(i+1));
			System.out.print("Introduzca la medida de la base: ");
			base = sc.nextDouble();
			System.out.print("Introduzca la medida del lado: ");
			lado = sc.nextDouble();
			isosceles[i] = new Triángulos(base, lado);
			System.out.println("\nEl perímetro del triángulo es: "+isosceles[i].getPerimetro());
			System.out.println("El área del triángulo es: "+isosceles[i].getArea());
		}
		System.out.println("\nEl área del triángulo de mayor superficie es: "+areaMayor(isosceles));
		sc.close();

	}

}
