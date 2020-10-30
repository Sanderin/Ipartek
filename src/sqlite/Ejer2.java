package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pojo.Perro;

public class Ejer2 {
	public static void main(String[] args) throws SQLException {

		String sql = "SELECT * FROM perro;";
		ArrayList<Perro> lista = new ArrayList<Perro>();

		// todo lo que este dentro del try se cierra automaticamente al ser autoClosable
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/perrera.db");
				PreparedStatement pst = conn.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {

				Perro p = new Perro();
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setRaza(rs.getString("raza"));
				p.setPeso(rs.getFloat("peso"));
				p.setVacunado(rs.getBoolean("vacunado"));
				p.setHistoria(rs.getString("historia"));
				lista.add(p);

			}

			for (Perro perro : lista) {
				System.out.println(perro);
			}

		} // fin try, se cierran las conexiones

		System.out.println("terminamos");
	}

}
