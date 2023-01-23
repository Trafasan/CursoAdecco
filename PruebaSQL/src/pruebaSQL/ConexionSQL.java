package pruebaSQL;

import java.sql.*;

public class ConexionSQL {

	public static void main(String[] args) {
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

}
