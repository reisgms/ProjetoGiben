package br.com.giben.fornecedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/giben?useSSL=false&serverTimezone=UTC";
		String username = "root";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			System.out.println("Conexão ao banco de dados bem-sucedida!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
