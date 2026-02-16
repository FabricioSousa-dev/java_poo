package model;

public class Pessoa {
    private String nome;
    private int idade;
    
    
    public Pessoa(int idade , String nome) {
    	this.idade = idade;
    	this.nome = nome;
    }
    public String getNome() {
    	return this.nome;
    }
    public int getIdade() {
    	return this.idade;
    }
     public void setNome(String nome) {
    	 this.nome = nome;
     }
     public void setIdade(int idade) {
    	 this.idade = idade;
     }
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
     
	}
    

