package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejer1 {

	public static void main(String[] args) throws SQLException {

		String sql = "SELECT * FROM coche;";

		// todo lo que este dentro del try se cierra automaticamente al ser autoClosable
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:D:/sqlite/concesionario.db");
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("nombre"));

			}
		} // fin try, se cierran las conexiones

		System.out.println("terminamos");
	}

}