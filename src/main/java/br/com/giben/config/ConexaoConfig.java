package br.com.giben.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
 * 
 * To execute a query, call an execute method from Statement such as the following:
 * - execute: Returns true if the first object that the query returns is a ResultSet object. Use this method if the query could return one or more ResultSet objects. Retrieve the ResultSet objects returned from the query by repeatedly calling Statement.getResultSet.
 * - executeQuery: Returns one ResultSet object.
 * - executeUpdate: Returns an integer representing the number of rows affected by the SQL statement. Use this method if you are using INSERT, DELETE, or UPDATE SQL statements.

 * @throws SQLException
 */
@Configuration
public class ConexaoConfig {

	private static Environment env;
	private static Connection connection;

	public Environment getEnv() {
		return env;
	}

	@Autowired
	public void setEnv(Environment env) {
		ConexaoConfig.env = env;
	}

	public Connection conectar() {
		String jdbcUrl = getEnv().getProperty("spring.datasource.url");
		String username = getEnv().getProperty("spring.datasource.username");
		String password = getEnv().getProperty("spring.datasource.password");

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			setConnection(connection);
			System.out.println("\n Conexão com MySQL estabelecida com sucesso!");
			return getConnection();
		} catch (SQLException e) {
			System.out.println("\n Erro de conexão com o database. \n");
			e.printStackTrace();
		}
		return null;
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		ConexaoConfig.connection = connection;
	}

}
