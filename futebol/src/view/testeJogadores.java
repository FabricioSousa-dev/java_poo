package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.jogadores;

public class testeJogadores {

	public static void main(String[] args) {
		
		jogadores tadeu = new jogadores("tadeu", 9);
	 
		
		String url = "jdbc:postgresql://localhost:5432/db-campeonatos";
		String usuario = "postgres" ;
		String senha = "09062004" ;
		
	    String sql = "INSERT INTO JOGADORES(JOG_NUMERO , JOG_NOME , JOG_GOLS)" +
	               "VALUES (2, 'MARCAO' , 15)";
		 
	   
		
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			Statement meuStatement = conexao.createStatement();
			meuStatement.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
			}

}
