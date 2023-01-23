package Ej6;

public class Complejos {
	private int n1r;
	private int n1i;
	private int n2r;
	private int n2i;
	private int nEntero;
	
	public Complejos(int n1r, int n1i, int n2r, int n2i) {
		this.n1r = n1r;
		this.n1i = n1i;
		this.n2r = n2r;
		this.n2i = n2i;
	}
	
	public Complejos(int n1r, int n1i, int nEntero) {
		this.n1r = n1r;
		this.n1i = n1i;
		this.nEntero = nEntero;
	}

	public String sumar(){
		//(a + b i) + (c + d i) = (a + c) + (b + d) i
		int sumaR = n1r + n2r;
		int sumaI = n1i + n2i;
		return "\nLa suma de los números complejos es "+sumaR+" + "+sumaI+"i.";
	}
	
	public String multComplejos() {
		//(a + b i) ⋅ (c + d i) = (ac - bd) + (ad+bc) i
		int multR = n1r*n2r - n1i*n2i;
		int multI = n1r*n2i + n1i*n2r;
		return "\nLa multiplicación de los números complejos es "+multR+" + "+multI+"i.";
	}
	
	public String comparar() {
		// Los números complejos se comparar mediante su valor absoluto
		// |a + b i| = Raíz cuadrada(a2 + b2)
		double valor1 = Math.sqrt(Math.pow(n1r, 2) + Math.pow(n1i, 2));
		double valor2 = Math.sqrt(Math.pow(n2r, 2) + Math.pow(n2i, 2));
		if (valor1 != valor2) {
			return "\nLos dos números complejos son diferentes:"
					+ "\n· Valor absoluto del número "+n1r+" + "+n1i+"i: "+valor1
					+ "\n· Valor absoluto del número "+n2r+" + "+n2i+"i: "+valor2;
		}
		else {
			return "\nLos dos números complejos son iguales.\nValor absoluto: "+valor1;
		}
	}
	
	public String multEntero() {
		//n(a + b i) = (na + nb i)
		int multR = nEntero*n1r;
		int multI = nEntero*n1i;
		return "\nLa multiplicación de los números complejos es "+multR+" + "+multI+"i.";
	}
	
	
}
