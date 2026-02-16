package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Autor;

public class AutorDaoPostgresql implements AutorDao {

	private Connection conexao;
	private Autor autor;
	
	public AutorDaoPostgresql() {
		
		this.conexao = FabricaDeConexoes.pegarConexao();
	}

	@Override
	public void create(Autor autor) {
		String sql = "INSERT INTO AUTORES (AUT_ID, AUT_NOME, AUT_PAIS) "+ 
                "VALUES (?, ?, ?)";
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setInt(1, autor.getId());
			stm.setString(2, autor.getNome());
			stm.setString(3, autor.getPais());
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Autor read(int id) {
		String sql = "SELECT AUT.AUT_ID, AUT_NOME, AUT_PAIS "
				+ "FROM AUTORES AUT"
				+ "WHERE AUT.AUT_ID = ?";
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
			Autor autor = new Autor();
			while (rs.next()) {
				autor.setId(rs.getInt("AUT_ID"));
				autor.setNome(rs.getString("AUT_NOME"));
				autor.setPais(rs.getString("AUT_PAIS"));
			}
			return autor;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void upadate(Autor autor) {
		String sql = "UPDATE AUTORES SET"
	      + "AUT_NOME = ? ,"
		  + "AUT_PAIS = ?"
		  + "WHERE AUT_ID = ?";
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
	         stm.setString(1, autor.getNome());
	         stm.setString(2, autor.getPais());
	         stm.setInt(3, autor.getId());
	         stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql = "DELEYE FROM AUTORES WHERE AUT_ID = ?";
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setInt(1, id);
			stm.executeUpdate();
			System.out.println("ID" + id + "removida com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
     @Override
	public List<Autor> findybyname(String nome) {
    	 List<Autor> MeusAutores = new ArrayList<>();
    	    
    	   
    	    String sql = "SELECT AUT_ID, AUT_NOME, AUT_PAIS FROM AUTORES WHERE AUT_NOME ILIKE ?";

    	    try {
    	        PreparedStatement stm = conexao.prepareStatement(sql);
    	        stm.setString(1, "%" + nome + "%"); 
    	        ResultSet rs = stm.executeQuery();

    	        while (rs.next()) {
    	            Autor autor = new Autor(
    	                rs.getInt("AUT_ID"),
    	                rs.getString("AUT_NOME"),
    	                rs.getString("AUT_PAIS")
    	            );
    	            MeusAutores.add(autor);
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	    }

    	    return MeusAutores;
	}

	@Override
	public List<Autor> findall() {
		List<Autor> ListaDeAutores = new ArrayList<Autor>();
		
		String sql = "SELECT AUT_ID ,AUT_NOME , AUT_PAIS FROM AUTORES";

		
		    try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Autor autor = new Autor(rs.getInt("AUT_ID"), rs.getString("AUT_NOME"), rs.getString("AUT_PAIS"));
				ListaDeAutores.add(autor);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ListaDeAutores;
	}
}
