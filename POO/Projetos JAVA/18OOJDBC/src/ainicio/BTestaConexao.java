package ainicio;

import java.sql.Connection;
import java.sql.SQLException;

public class BTestaConexao {
	public static void main(String[] args) {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conexão aberta!");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
