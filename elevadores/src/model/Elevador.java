package model;

public class Elevador {
	private String nome;
	private int andarAtual;
	private int andarMaximo;
	private int andarMinimo;
	private boolean portaAberta;
	private int capacidadepessoas;	
	private int quantidadesPessoasdentro;
	
	public int getQuantidadePessoasdentro() {
		return this.quantidadesPessoasdentro;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadepessoas = capacidadePessoas;
	}
	public int getCapacidadePessoas() {
		 return this.capacidadepessoas;
	}
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public void subir() {
		if(this.andarAtual < this.andarMaximo) {
		   this.andarAtual++;
		System.out.println("Subir para o andar " + this.andarAtual);
		} else {
			System.out.println("Já estou no topo!");
		}
		
	}

public void descer() {
	if(this.andarAtual > this.andarMinimo) {
	this.andarAtual--;
	System.out.println("Desci para o andar " + this.andarAtual);
}else {
	
	System.out.println("ja estou no mínimo! ");
}
	}

public void receberPessoas() {
	if(this.quantidadesPessoasdentro < this.capacidadepessoas ) {
	this.quantidadesPessoasdentro++;
	System.out.println("Recebi uma pessoa. Estou com " + this.quantidadesPessoasdentro);
	}else {
		System.out.println("Capacidade máxima atingida!");
	}
	
	
}

public int receberPessoas(int numeroPessoas) {
	if(this.quantidadesPessoasdentro < this.capacidadepessoas) {
	this.quantidadesPessoasdentro += numeroPessoas;
	System.out.println("recebi " + numeroPessoas + " pessoas. Fiquei com " + this.quantidadesPessoasdentro);
	}else {
		
		System.out.println("Capacidade máxima atingida");
	}
	
	return numeroPessoas;
	
}

public String tostring() {
	return "*************************\n" +
    "Nome = " + this.nome + "\n" +
	"Capacidade = " + this.capacidadepessoas + " pessoas" + "\n" +
    "Capacidade de pessoas = " + this.quantidadesPessoasdentro + "\n" +
	"*********************\n";
}
  }

	
