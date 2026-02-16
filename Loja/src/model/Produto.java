package model;

public class Produto {
	private String nome;
	private int id;
	private int preço;
	
	public Produto(String nome , int id , int preço) {
		this.nome = nome;
		this.id = id;
		this.preço = preço;
		
	}
	public double getPreço() {
		return this.preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Produto [nome=" + nome + ", id=" + id + ", preço=" + preço + "]";
	}

	
	

}
