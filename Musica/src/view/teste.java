package view;

import java.util.List;

import db.AlbumDAO;
import db.AlbumDAOPostgres;
import model.Album;
import model.Artista;

public class teste {

	public static void main(String[] args) {

		
        Artista artista = new Artista(1, "Coldplay", "Reino Unido");

       
        Album album = new Album("ALB-001", "A Head Full of Dreams", 2015, artista);

      
        AlbumDAO albumDAO = new AlbumDAOPostgres();
        albumDAO.create(album);

    
        List<Album> albuns = albumDAO.buscarPorArtista(artista);
        for (Album a : albuns) {
            System.out.println("ID: " + a.getId());
            System.out.println("Título: " + a.getTitulo());
            System.out.println("Ano de Lançamento: " + a.getAnoLancamento());
    }
	}

	}


