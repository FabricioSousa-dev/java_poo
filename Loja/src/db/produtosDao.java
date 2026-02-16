package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Produto;

public class produtosDao {
	
	private Connection conexao;
	
	
	public produtosDao() {
		this.conexao = FabricaDeConexoes.pegarConexao();
	}
	public void salvar(Produto produto) {
		String sql = "INSERT INTO PRODUTOS(ITEM_NOME, ITEM_ID, ITEM_PREÇO) " +
	             "VALUES ('" + produto.getNome() + "', " + produto.getId() + ", " + produto.getPreço() + ")";

		  try {
			Statement stm = this.conexao.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		
	}
	public Produto pegarInstanciaPor(int id) {
		  
		 String sql = "SELECT ITEM.ITEM_ID , ITEM_NOME , ITEM_PREÇO" +
				 "FROM PRODUTOS ITEM" +
				 "WHERE ITEM.ITEM_ID = "  + id ;
		 try {
			Statement stm = this.conexao.createStatement();
			ResultSet resultado = stm.executeQuery(sql);
			resultado.next();
			Produto item = new Produto(resultado.getString("ITEM_NOME"),resultado.getInt("ITEM_ID"),resultado.getInt("ITEM_PREÇO"));
			return item;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	  }
	public void excluirObjeto(Produto produto) {
		
		String sql = "DELETE INTO PRODUTOS(ITEM_NOME, ITEM_ID, ITEM_PREÇO) " +
	             "VALUES ('" + produto.getNome() + "', " + produto.getId() + ", " + produto.getPreço() + ")";
		try {
			Statement stm = this.conexao.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public void alterarObjeto(Produto produto) {
		
		String sql = "UPDATE INTO PRODUTOS(ITEM_NOME, ITEM_ID, ITEM_PREÇO) " +
	             "VALUES ('" + produto.getNome() + "', " + produto.getId() + ", " + produto.getPreço() + ")";
		
		try {
			Statement stm = this.conexao.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
