package model;

public class Livro {

	private String isnb;
	private String titulo;
	private int ano;
	private Autor autor;
	
	
	
	public Livro(String isnb, String titulo, int ano, Autor autor) {
		this.isnb = isnb;
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
	}
	public Livro() {
		
	}
	public String getIsnb() {
		return isnb;
	}
	public void setIsnb(String isnb) {
		this.isnb = isnb;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro [isnb=" + isnb + ", titulo=" + titulo + ", ano=" + ano + ", autor=" + autor + "]";
	}
	
	
}
