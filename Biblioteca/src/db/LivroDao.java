package db;

import java.util.List;

import model.Autor;
import model.Livro;

public interface LivroDao {

	void create(Livro livro);
    Livro read(String isbn);
    List<Livro> findByAutor(Autor autor);
    void update(Livro livro);
    void delete(String isbn);
}
