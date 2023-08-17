package com.sandra.poo.ejercicios.clases;

public class NumComplejo {
	private int num_real;
	private int num_imaginario;
	
	public NumComplejo() {}
	
	public NumComplejo(int num_real, int num_imaginario) {
		this.num_real = num_real;
		this.num_imaginario = num_imaginario;
	}
	
	public static NumComplejo sumar(NumComplejo n1, NumComplejo n2) {
		//(a + bi) + (c + di) = (a + c) + (b + d)i
		return new NumComplejo(n1.num_real + n2.num_real, n1.num_imaginario + n2.num_imaginario);
	}
	
	public static NumComplejo multiplicar(NumComplejo n1, NumComplejo n2) {
		//(a + bi) ⋅ (c + di) = (ac - bd) + (ad+bc)i
		return new NumComplejo(n1.num_real*n2.num_real - n1.num_imaginario*n2.num_imaginario,
				n1.num_real*n2.num_imaginario + n1.num_imaginario*n2.num_real);
	}
	
	private double getAbs() {
		return Math.sqrt(Math.pow(num_real, 2) + Math.pow(num_imaginario, 2));
	}
	
	public static String comparar(NumComplejo n1, NumComplejo n2) {
		// Los números complejos se comparar mediante su valor absoluto: |a + bi| = Raíz cuadrada(a^2 + b^2)
		double valor1 = n1.getAbs(), valor2 = n2.getAbs();
		return valor1 != valor2 ? String.format("""
				Los dos números complejos son diferentes:
				· Valor absoluto del número %s: %.3f
				· Valor absoluto del número %s: %.3f""", n1, valor1, n2, valor2) :
					String.format("Los dos números complejos son iguales. Valor absoluto: %.3f", valor1);
	}
	
	public static NumComplejo multEntero(NumComplejo numComplejo, int numEntero) {
		//n(a + bi) = (na + nbi)
		return new NumComplejo(numEntero*numComplejo.num_real, numEntero*numComplejo.num_imaginario);
	}
	
	@Override
	public String toString() {
		return String.format("%d + %di", num_real, num_imaginario);
	}
	
	
}
