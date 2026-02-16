package model;

public class Artista {

	private int id;
	private String nome;
	private String pais;
	
	public Artista(int id, String nome , String pais) {
		this.id = id;
		this.nome = nome;
		this.pais= pais;
	}
	
	
	public Artista() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Artista [id=" + id + ", nome=" + nome + ", pais=" + pais + "]";
	}



	
	
	
	
	
	
}
