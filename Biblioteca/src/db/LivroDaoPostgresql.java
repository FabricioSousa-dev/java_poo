package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Autor;
import model.Livro;

public class LivroDaoPostgresql implements LivroDao {

	private Connection conexao;
	public LivroDaoPostgresql() {
		this.conexao = FabricaDeConexoes.pegarConexao();
		
	}
	@Override
	public void create(Livro livro) {
		String sql = "INSERT INTO livros (LIV_ISBN, LIV_TITULO, LIV_ANO, LIV_AUT_ID) "+ 
	                  "VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setString(1, livro.getIsnb());
			stm.setString(1, livro.getTitulo());
			stm.setInt(3, livro.getAno());
			stm.setInt(4,livro.getAutor().getId());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		
	}
	public Livro read(String isbn) {
		String sql = "SELECT LIV.LIV_ISBN , LIV_TITULO , LIV_ANO ,"
			        + "AUT.AUT_ID , AUT_NOME , AUT_PAIS "
			       + "FROM LIVROS LIV INNER JOIN AUTORES AUT ON LIV.LIV_AUT_ID = AUT.AUT_ID"
			        + "WHERE LIV.LIV_ISBN = ?";

	Livro livro = new Livro();
	try {
		PreparedStatement stm = conexao.prepareStatement(sql);
		ResultSet rs = stm.executeQuery();
		stm.setString(1, isbn);
		
		while(rs.next()) {
			livro.setIsnb(rs.getString("LIV_ISBN"));
			livro.setTitulo(rs.getString("LIV_TITULO"));
			livro.setAno(rs.getInt("LIV_ANO"));
			livro.setAutor(new Autor(rs.getInt("AUT_ID"), rs.getString("AUT_NOME"), rs.getString("AUT_PAIS")));
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
return livro;
	}
	@Override
	public List<Livro> findByAutor(Autor autor) {
		List<Livro>livros = new ArrayList<Livro>();
			String sql = "SELECT LIV.LIV_ISBN , LIV_TITULO , LIV_ANO ,"
				        + "AUT.AUT_ID , AUT_NOME , AUT_PAIS "
				       + "FROM LIVROS LIV INNER JOIN AUTORES AUT ON LIV.LIV_AUT_ID = AUT.AUT_ID"
				        + "WHERE AUT.AUT_ID = ?";

	
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			stm.setInt(1, autor.getId());
			
			while(rs.next()) {
				Livro livro = new Livro();
				livro.setIsnb(rs.getString("LIV_ISBN"));
				livro.setTitulo(rs.getString("LIV_TITULO"));
				livro.setAno(rs.getInt("LIV_ANO"));
				livro.setAutor(new Autor(rs.getInt("AUT_ID"), rs.getString("AUT_NOME"), rs.getString("AUT_PAIS")));
		         livros.add(livro);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	return livros;
	}
	@Override
	public void update(Livro livro) {
		String sql = "UPDATE LIVROS SET"
				+ "LIV_TITULO =?"
				+ "LIV_ANO = ?"
				+ "WHERE LIV_ISNB = ?";
		try {
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setString(1, livro.getTitulo());
			stm.setInt(2, livro.getAno());
			stm.setString(3, livro.getIsnb());
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void delete(String isbn) {
		String sql = "DELETE FROM LIVROS WHERE LIV_ISBN = ?";

	    try {
	        PreparedStatement stm = conexao.prepareStatement(sql);
	        stm.setString(1, isbn);
	        stm.executeUpdate();
	        System.out.println("Livro com ISBN " + isbn + " removido com sucesso.");
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
	}
}
