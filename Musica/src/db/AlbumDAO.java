package db;

import model.Album;

public interface AlbumDAO {
	    void create(Album album);
	    Album buscarPorId(String id);
	    List<Album> buscarPorArtista(int artistaId);
	    void update(Album album);
	    void delete(String id);
	}

	

