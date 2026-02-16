package db;

import model.Artista;
import java.sql.*;
import java.util.*;

public class ArtistaDAOPostgres implements ArtistaDAO {
    @Override
    public void create(Artista artista) {
        String sql = "INSERT INTO ARTISTAS (ART_ID, ART_NOME, ART_PAIS) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, artista.getId());
            stmt.setString(2, artista.getNome());
            stmt.setString(3, artista.getPais());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Artista buscarPorId(int id) {
        String sql = "SELECT * FROM ARTISTAS WHERE ART_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Artista(
                    rs.getInt("ART_ID"),
                    rs.getString("ART_NOME"),
                    rs.getString("ART_PAIS")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Artista> buscarTodos() {
        List<Artista> lista = new ArrayList<>();
        String sql = "SELECT * FROM ARTISTAS";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new Artista(
                    rs.getInt("ART_ID"),
                    rs.getString("ART_NOME"),
                    rs.getString("ART_PAIS")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void update(Artista artista) {
        String sql = "UPDATE ARTISTAS SET ART_NOME = ?, ART_PAIS = ? WHERE ART_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, artista.getNome());
            stmt.setString(2, artista.getPais());
            stmt.setInt(3, artista.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM ARTISTAS WHERE ART_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
