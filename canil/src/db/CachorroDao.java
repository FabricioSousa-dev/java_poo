package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.cachorro;

public class CachorroDao {
             
	private Connection conexao;
	
	public CachorroDao() {
		
		this.conexao = FabricaDeConexoes.pegarConexao();
	}
	public void salvar(cachorro cachorro) {
		
		String sql = "INSERT INTO CACHORROS(CAO_ID , CAO_NOME) " + 
		 " VALUES (" + cachorro.getId() + ", '" + cachorro.getNome() + "')";
		try {
			Statement stm = this.conexao.createStatement();
			stm.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public cachorro pegarInstanciaPorId(int id) {
		
		String sql = "SELECT CAO.CAO_ID, CAO_NOME " +
		"FROM CACHORROS CAO " + 
	     "WHERE CAO.CAO_ID = " + id;
		try {
			Statement stm = this.conexao.createStatement();
			ResultSet resultado = stm.executeQuery(sql);
			resultado.next();
			
			cachorro cao = new cachorro(resultado.getInt("CAO_ID"), resultado.getString("CAO_NOME"));
			
			return cao;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
