package com.sandra.projectClases;

import java.util.List;

import com.sandra.projectClases.models.Cuenta;
import com.sandra.projectClases.models.CuentaCaixa;
import com.sandra.projectClases.models.CuentaSabadell;
import com.sandra.projectClases.utils.Methods;

public class App {
	
    public static void main(String[] args){
    	final String nombreFicheroCaixa = "caixa.txt";
    	final String nombreFicheroSabadell = "sabadell.txt";
    	List<CuentaCaixa> cuentasCaixa = CuentaCaixa.getListCuentaCaixa(nombreFicheroCaixa);
		List<CuentaSabadell> cuentasSabadell = CuentaSabadell.getListCuentaSabadell(nombreFicheroSabadell);
		Methods.valoresDePrueba(cuentasCaixa, cuentasSabadell); // Valores añadidos para ver si el método funciona
		rellenoDatos(cuentasCaixa, cuentasSabadell);
		impresionLista(cuentasCaixa, cuentasSabadell);
    }
	
	public static void rellenoDatos(List<CuentaCaixa> cuentasCaixa, List<CuentaSabadell> cuentasSabadell) {
		System.out.println("Sin ordenar la lista, el resultado sería el siguiente:");
		Methods.rellenarNivelCatalanSinOrdenar(cuentasCaixa, cuentasSabadell);
		System.out.println();
		System.out.println("Ordenando la lista, el resultado sería el siguiente:");
		Methods.rellenarNivelCatalan(cuentasCaixa, cuentasSabadell);
	}
	
	public static void impresionLista(List<CuentaCaixa> cuentasCaixa, List<CuentaSabadell> cuentasSabadell) {
		System.out.println("Sin ordenar la lista, el resultado sería el siguiente:");
		List<Cuenta> cuentasBancos = Methods.unirListas(cuentasCaixa, cuentasSabadell);
		for (Cuenta cuenta:cuentasBancos) {
			if (cuenta instanceof CuentaCaixa) System.out.println("Cuenta de CaixaBank\n"+cuenta);
			else System.out.println("Cuenta del banco Sabadell\n"+cuenta);
		}
		System.out.println();
		System.out.println("Ordenando la lista, el resultado sería el siguiente:");
		Methods.ordenarListasPorDni(cuentasCaixa, cuentasSabadell);
		List<Cuenta> cuentasBancosOrdenada = Methods.unirListas(cuentasCaixa, cuentasSabadell);
		for (Cuenta cuenta:cuentasBancosOrdenada) {
			if (cuenta instanceof CuentaCaixa) System.out.println("Cuenta de CaixaBank\n"+cuenta);
			else System.out.println("Cuenta del banco Sabadell\n"+cuenta);
		}
	}
}
