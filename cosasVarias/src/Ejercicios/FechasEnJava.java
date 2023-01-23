package Ejercicios;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FechasEnJava {

	public static void main(String[] args) {
		// LocalDateTime obtiene la fecha en el formato yyyy-MM-ddThh:mm:ss
		LocalDateTime fechaActual = LocalDateTime.now(); // .now() obtiene la fecha actual
		System.out.println("Sin cambios: "+fechaActual+"\n");
		
		LocalDateTime arregloNano = fechaActual.withNano(0); // .withNano(0) resetea los nanosegundos a 0, para que así no aparezcan
		System.out.println("Fecha sin nanosegundos: "+arregloNano+"\n");

		// Arreglo del formato de la fecha
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // Se establece el formato de la fecha
		String arregloFormato = arregloNano.format(formateo); // Se cambia el formato de la fecha al establecido normalmente
		System.out.println("Cambio de formato: " +arregloFormato+"\n");
		
		// Para ZonedDateTime...
		ZonedDateTime fechaZoned = ZonedDateTime.now().withNano(0);
		DateTimeFormatter formateoZ = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z"); //La z muestra la zona horaria
		String actualZoned = fechaZoned.format(formateoZ);
		System.out.println("Fecha con zona horaria: " + actualZoned);
	}

}
