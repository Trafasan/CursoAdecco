/**
 * 
 */
package cosasVarias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Sandra
 *
 */
public class CosasVarias {
	public static void fechasEnJava() {
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
	
	public static void determinarNPrimo() {
		Scanner sc = new Scanner (System.in);
		boolean esPrimo = true;
		System.out.print("Inserte un número: ");
		int N = sc.nextInt();
		for (int x=2; x<(N/2) && esPrimo; x++) if(N%x == 0) esPrimo = false;
		System.out.println(esPrimo ? "El número "+N+" es un número primo." : "El número "+N+" no es un número primo.");
		sc.close();
	}
	
	public static void determinarNPrimoConBreak() {
		Scanner sc = new Scanner (System.in);
		boolean esPrimo = true;
		System.out.print("Inserte un número: ");
		int N = sc.nextInt();
		for (int x=2; x<(N/2); x++) {
			if(N%x == 0) {
				esPrimo = false;
				break;
			}
		}
		System.out.println(esPrimo ? "El número "+N+" es un número primo." : "El número "+N+" no es un número primo.");
		sc.close();
	}
	
	public static void sumaNAnteriores() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserte un número: ");
		int N=sc.nextInt();
		int suma=0;
		for(int x=N; x>0; x--) {
			suma+=x;
			System.out.print(x+((x!=1) ? " + " :" = "));
		}
		System.out.println(suma);
		sc.close();
	}
	
	public static void tablaMultiplicar() {
		final int N=5;		
		for (int x=0; x<=10; x++) {
			int producto=N*x;
			System.out.println(N+" x "+x+" = "+producto);
		}
	}
	
	public static void tablasMultiplicar() {
		for (int x=0; x<10; x++) {
			System.out.println("Tabla de multiplicar del "+x);
			for (int y=1; y<=10; y++) {
				int producto =x*y;
				System.out.println(x+" x "+y+" = "+producto);
			}
			System.out.println("\n");
		}
	}
	
	public static void notasMusicales() {
		String[] notas = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do'"};
		int opcion;
		do {
			opcion = JOptionPane.showConfirmDialog(null, "Pulsa Aceptar para generar una nota", "CREA TU PROPIA CANCIÓN", 2, 1, null);
			if (opcion == 0) {
				int random = (int) Math.random()*notas.length;
				System.out.println(notas[random]);
			}
		} while (opcion == 0);
	}
	
	public static void gestores() {
		System.out.println("1 --> Gestores\n");
	}
	public static void clientes() {
		System.out.println("2 --> Clientes\n");
	}
	public static void transferencias() {
		System.out.println("3 --> Transferencias\n");
	}
	public static void mensajes() {
		System.out.println("4 --> Mensajes\n");
	}
	public static void prestamos() {
		System.out.println("5 --> Préstamos\n");
	}
	public static void salir() {
		System.out.println("6 -> Salir\n");
	}
	public static void menuProyecto() {
		Scanner sc = new Scanner(System.in);
		int number;
		do{
			System.out.print("1. Gestores\t\t2. Clientes\n3. Transferencias\t4. Mensajes\n5. Préstamos\t\t6. Salir\nInserte un número: ");
			number=sc.nextInt();
			switch(number) {
			case 1 -> gestores();
			case 2 -> clientes();
			case 3 -> transferencias();
			case 4 -> mensajes();
			case 5 -> prestamos();
			case 6 -> salir();
			}
		} while(number!=6);
		sc.close();
	}
	
	public static void conexionSQL() {
		try {
			// Se crea la conexión
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3309/banco", "root", "Trafasan");
			// Se crea el objeto statement
			Statement statement = connection.createStatement();
			// Se ejecuta SQL
			ResultSet resultado = statement.executeQuery("SELECT * FROM gestor");
			// Recorrer el ResultSet
			while (resultado.next()) {
				System.out.println(resultado.getString("nombre") + " " + resultado.getString("usuario"));
			}
		} catch (Exception e) {
			System.out.println("No conecta");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// fechasEnJava();
		// determinarNPrimo();
		// determinarNPrimoConBreak();
		// sumaNAnteriores();
		// tablaMultiplicar();
		// tablasMultiplicar();
		// notasMusicales();
		// menuProyecto();
		// conexionSQL();
	}

}
