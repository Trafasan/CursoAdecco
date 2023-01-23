package Ejercicios;
import javax.swing.JOptionPane;

public class NotasMusicales {

	public static void main(String[] args) {
		int opcion;
		try {
			do {
				opcion = JOptionPane.showConfirmDialog(null, "Pulsa Aceptar para generar una nota", "CREA TU PROPIA CANCIÓN",
						2, 1, null);
				if (opcion == 0) {
					int random = (int) (Math.random() * (9 - 1)) + 1;
					switch (random) {
					case 1:
						System.out.println("Do");
						break;
					case 2:
						System.out.println("Re");
						break;
					case 3:
						System.out.println("Mi");
						break;
					case 4:
						System.out.println("Fa");
						break;
					case 5:
						System.out.println("Sol");
						break;
					case 6:
						System.out.println("La");
						break;
					case 7:
						System.out.println("Si");
						break;
					case 8:
						System.out.println("Do'");
						break;
					}
				}
			} while (opcion == 0);
		} catch (Exception e) {
			opcion = 0;
		}

	}

}
