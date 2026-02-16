package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
      
	
	public  static Connection pegarConexao() {
		
		String url = "jdbc:postgresql://localhost:5432/db-canil";
		String usuario = "postgres" ;
		String senha = "09062004" ;
		
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
}
