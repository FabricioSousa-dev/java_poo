package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connetionFactory {

	public class ConnectionFactory {
	    private static final String URL = "jdbc:postgresql://localhost:5432/seu_banco";
	    private static final String USER = "postgresql";
	    private static final String PASSWORD = "1234";

	    public static Connection getConnection() {
	        try {
	            return DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            throw new RuntimeException("Erro ao conectar com o banco de dados", e);
	        }
}
	}
	}
