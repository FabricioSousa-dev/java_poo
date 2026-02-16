package model;

public class ingrediente {
	private String nome;
	private int calorias;
	
	public ingrediente( String nome , int calorias) {
		this.nome = nome;
		this.calorias = calorias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}


}
