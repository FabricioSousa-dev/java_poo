package db;

import model.Album;
import java.sql.*;
import java.util.*;

public class AlbumDAOPostgres implements AlbumDAO {
    @Override
    public void create(Album album) {
        String sql = "INSERT INTO ALBUNS (ALB_ID, ALB_TITULO, ALB_ANO, ALB_ART_ID) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, album.getId());
            stmt.setString(2, album.getTitulo());
            stmt.setInt(3, album.getAnoLancamento());
            stmt.setInt(4, album.getArtistaId());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Álbum cadastrado com sucesso!");
            } else {
                System.out.println("Falha ao cadastrar o álbum.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Album buscarPorId(String id) {
        String sql = "SELECT * FROM ALBUNS WHERE ALB_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Album(
                    rs.getString("ALB_ID"),
                    rs.getString("ALB_TITULO"),
                    rs.getInt("ALB_ANO"),
                    rs.getInt("ALB_ART_ID")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Album> buscarPorArtista(int artistaId) {
        List<Album> lista = new ArrayList<>();
        String sql = "SELECT * FROM ALBUNS WHERE ALB_ART_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, artistaId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new Album(
                    rs.getString("ALB_ID"),
                    rs.getString("ALB_TITULO"),
                    rs.getInt("ALB_ANO"),
                    artistaId
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void update(Album album) {
        String sql = "UPDATE ALBUNS SET ALB_TITULO = ?, ALB_ANO = ?, ALB_ART_ID = ? WHERE ALB_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, album.getTitulo());
            stmt.setInt(2, album.getAnoLancamento());
            stmt.setInt(3, album.getArtistaId());
            stmt.setString(4, album.getId());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Álbum atualizado com sucesso!");
            } else {
                System.out.println("Nenhuma alteração foi feita.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM ALBUNS WHERE ALB_ID = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Álbum excluído com sucesso!");
            } else {
                System.out.println("Nenhum álbum encontrado para exclusão.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
