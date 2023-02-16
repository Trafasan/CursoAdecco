package com.sandra.projectClases.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sandra.projectClases.models.Cuenta;
import com.sandra.projectClases.models.CuentaCaixa;
import com.sandra.projectClases.models.CuentaSabadell;
import com.sandra.projectClases.models.NivelCatalan;

/**
 * Hello world!
 *
 */
public class Methods {
	
	public static void valoresDePrueba(List<CuentaCaixa> cuentasCaixa, List<CuentaSabadell> cuentasSabadell) {
		cuentasCaixa.get(1).setNivelCatalan(NivelCatalan.Alto);
		cuentasSabadell.get(2).setNivelCatalan(NivelCatalan.Medio);
		cuentasCaixa.get(3).setNivelCatalan(NivelCatalan.Bajo);
		cuentasSabadell.get(3).setNivelCatalan(NivelCatalan.Alto);
		cuentasCaixa.get(3).setNivelCatalan(NivelCatalan.Bajo);
		cuentasSabadell.get(3).setNivelCatalan(NivelCatalan.Alto);
		cuentasCaixa.get(3).setNivelCatalan(NivelCatalan.Bajo);
		cuentasSabadell.get(3).setNivelCatalan(NivelCatalan.Alto);
	}
	
	public static void rellenarNivelCatalanSinOrdenar(List<CuentaCaixa> cuentasCaixa, List<CuentaSabadell> cuentasSabadell) {
		for (CuentaCaixa cuentaCaixa:cuentasCaixa) {
			String dni_cif = cuentaCaixa.getDni_cif();
			CuentaSabadell cuentaSabadell = cuentasSabadell.stream().filter(e->e.getDni_cif().equals(dni_cif)).toList().get(0);
			Methods.comprobarNivelCatalan(cuentaCaixa, cuentaSabadell);
		}
	}
	
	// Método para ordenar los dos tipos de listas de cuentas
	public static void ordenarListasPorDni(List<CuentaCaixa> cuentasCaixa, List<CuentaSabadell> cuentasSabadell) {
    	Collections.sort(cuentasCaixa, new Comparator<CuentaCaixa>() {
			@Override
			public int compare(CuentaCaixa c1, CuentaCaixa c2) {
				return Integer.parseInt(c1.getDni_cif())-Integer.parseInt(c2.getDni_cif());
			}
    	});
    	Collections.sort(cuentasSabadell, new Comparator<CuentaSabadell>() {
			@Override
			public int compare(CuentaSabadell c1, CuentaSabadell c2) {
				return Integer.parseInt(c1.getDni_cif())-Integer.parseInt(c2.getDni_cif());
			}
    	});
	}
	
	public static void rellenarNivelCatalan(List<CuentaCaixa> cuentasCaixa, List<CuentaSabadell> cuentasSabadell) {
		for (int i=0; i<cuentasCaixa.size(); i++) Methods.comprobarNivelCatalan(cuentasCaixa.get(i), cuentasSabadell.get(i));
	}
	
	// Método para comprobar si los niveles de catalán no son nulos y son iguales
	public static void comprobarNivelCatalan(CuentaCaixa cuentaCaixa, CuentaSabadell cuentaSabadell) {
		if (cuentaCaixa.getNivelCatalan() == null && cuentaSabadell.getNivelCatalan() == null) {
			System.out.println("Ambas cuentas de banco de "+cuentaCaixa.getNombre_cliente()+" no tiene definido su nivel de catalán");
		}
		else if (cuentaCaixa.getNivelCatalan() == null) {
			System.out.println("El cliente "+cuentaCaixa.getNombre_cliente()+" no tiene definido su nivel de catalán en su cuenta CaixaBank");
			System.out.println("¿Quiere copiar su nivel de catalán de su cuenta Sabadell?");
			System.out.println("Nivel de catalán: "+cuentaSabadell.getNivelCatalan());
		}
		else if (cuentaSabadell.getNivelCatalan() == null) {
			System.out.println("El cliente "+cuentaCaixa.getNombre_cliente()+" no tiene definido su nivel de catalán en su cuenta Sabadell");
			System.out.println("¿Quiere copiar su nivel de catalán de su cuenta CaixaBank?");
			System.out.println("Nivel de catalán: "+cuentaCaixa.getNivelCatalan());
		}
		else if (!cuentaCaixa.getNivelCatalan().equals(cuentaSabadell.getNivelCatalan())) {
			System.out.println("El cliente "+cuentaCaixa.getNombre_cliente()+" tiene diferentes niveles de catalán definidos en sus cuentas");
			System.out.println("¿Cuál es el nivel correcto?");
			System.out.println("Nivel de catalán CaixaBank: "+cuentaCaixa.getNivelCatalan());
			System.out.println("Nivel de catalán Sabadell: "+cuentaSabadell.getNivelCatalan());
		}
		else System.out.println("Los datos están correctos");
	}
	
	public static List<Cuenta> unirListas(List<CuentaCaixa> datosCaixa, List<CuentaSabadell> datosSabadell) {
		List<Cuenta> cuentasBancos = new ArrayList<Cuenta>();
		cuentasBancos.addAll(datosCaixa);
		cuentasBancos.addAll(datosSabadell);
		return cuentasBancos;
	}
}
