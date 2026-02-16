package model;

public class Autor {

	private int id;
	private String nome;
	private String pais;
	
	public Autor(int id, String nome, String pais) {
		this.id = id;
		this.nome = nome;
		this.pais = pais;
	}
	public Autor() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "teste [id=" + id + ", nome=" + nome + ", pais=" + pais + "]";
	}
	
	
	

}


