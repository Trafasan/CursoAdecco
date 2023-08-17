package com.sandra.poo.clases.herencia;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Profesor extends Persona implements ITiempoTrabajado{
	private final LocalDate contrato = LocalDate.now();
	
	public Profesor() {}

	public Profesor(String nombre, int edad, String dni) {
		super(nombre, edad, dni);
	}

	public LocalDate getContrato() {
		return contrato;
	}

	@Override
	public String getTiempoTrabajado() {
		Period tiempo_trabajado = Period.between(contrato, LocalDate.parse("2024-09-16", DateTimeFormatter.ISO_LOCAL_DATE));
		int yyyy = tiempo_trabajado.getYears(), MM = tiempo_trabajado.getMonths(), dd = tiempo_trabajado.getDays();
		return (yyyy!=0 ? String.format("%d año%s", yyyy, yyyy!=1 ? "s" : "") : "")
				+(yyyy!=0 && MM!=0 && dd!=0 ? ", " : (yyyy!=0 && (MM!=0 || dd!=0) ? " y " : ""))
				+(MM!=0 ? String.format("%d mes%s", MM, MM!=1 ? "es" : "") : "")
				+(MM!=0 && dd!=0 ? " y " : "")
				+(dd!=0 ? String.format("%d día%s", dd, dd!=1 ? "s" : "") : "");
	}

	@Override
	public void presentacion() {
		System.out.printf("Hola, me llamo %s y trabajo en este instituto desde el %s.\n", nombre,
				contrato.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")).replace("/", " de "));
	}

	@Override
	public String toString() {
		return super.toString()+String.format("""
				· Fecha del contrato: %s
				· Tiempo trabajado: %s
				""", contrato.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), getTiempoTrabajado());
	}
	
}