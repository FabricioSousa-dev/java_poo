package model;

public class livro {
	private String titulo;
	private String autor;
	private int quantidade;
	private int numeroDePaginas;
	private livro livro;
	
	public livro( String titulo , String autor , int quantidade , int numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.quantidade = quantidade;
		this.numeroDePaginas = numeroDePaginas;
	}
	public livro getLivro() {
		return this.livro;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public int getNumeroDePaginas() {
		return this.numeroDePaginas;
	}
	public void setLivro(livro livro) {
		this.livro = livro;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	public String toString() {
		return "livro " + titulo +  "\nautor=" + autor + " \nquantidade=" + quantidade + "\nnumeroDePaginas "
				+ numeroDePaginas +"\n*************************************";
	}
	

}
