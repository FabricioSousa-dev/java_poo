package db;

import java.sql.Connection;

public class RacaDao {

	public Connection conexao;
	
	public RacaDao() {
		
		this.conexao = FabricaDeConexoes.pegarConexao();
	}
}
