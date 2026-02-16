package model;

public class jogadores {
	private String nome;
	private int numero;
	private int gols;
	
	public jogadores(String nome , int numero) {
		
	}
	public String getNome() {
		return nome;
	}
	public int getGols() {
		return this.gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String toString() {
		return "jogador: " + this.nome + " (" + this.numero + ") gols = " + this.gols;
		
	}
	

}
