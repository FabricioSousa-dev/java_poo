package db;

import model.Artista;
import java.util.List;

public interface ArtistaDAO {
    void create(Artista artista);
    Artista buscarPorId(int id);
    List<Artista> buscarTodos();
    void update(Artista artista);
    void delete(int id);
}


	
	

