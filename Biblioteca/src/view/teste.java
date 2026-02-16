package view;

import java.util.List;

import db.AutorDaoPostgresql;
import db.LivroDaoPostgresql;
import model.Autor;
import model.Livro;

public class teste {

	public static void main(String[] args) {
		
		AutorDaoPostgresql autorDaoPostgresql = new AutorDaoPostgresql();
		//autorDaoPostgresql.create(new Autor(1, "joao lino", "Brasil"));
		//autorDaoPostgresql.create(new Autor(2, "gurra dos tronos", "Alemanha"));
		//autorDaoPostgresql.create(new Autor(3, "Trono de ferro", "Inglaterra"));
		//System.out.println(autorDaoPostgresql.read(2));
		LivroDaoPostgresql livroDaoPostgresql = new LivroDaoPostgresql();
		//livroDaoPostgresql.create(new Livro("321", "Romance de abril", 2018, autorDaoPostgresql.read(2)));
		//livroDaoPostgresql.create(new Livro("4321", "Manuel morreu", 2024, autorDaoPostgresql.read(3)));
	
		
		List<Autor>Autores = autorDaoPostgresql.findall();
		for(Autor a : Autores) {
			System.out.println(a);
			
		}
		
	

	}

}
