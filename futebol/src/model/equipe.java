package model;

public class equipe {
	 private String nome;
	 private int divisao;
	 private int pontuacao;
	 private int vitorias;
	 private int derrotas;
	 private int empates;
	 
	 public equipe( String nome ,int divisao){
		 this.nome = nome;
		 this.divisao = divisao;
		 }

	public String getNome() {
		 return this.nome;
	 }
	 public int getDivisao() {
		 return this.divisao;
	 }
	 public int getPontuacao() {
		 return this.pontuacao;
	 }
	 public int getVitorias() {
		 return this.vitorias;
	 }
	 public int getDerrotas() {
		 return this.derrotas;
	 }
	 public int getEmpates() {
		 return this.empates;
	 }
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 public void setDivisao(int divisao) {
		 this.divisao = divisao;
	 }
	 public void setPontuacao(int pontuacao) {
		 this.pontuacao = pontuacao;
	 }
	 public void setVitorias(int vitorias) {
		 this.vitorias = vitorias;
	 }
	 public void setDerrotas(int derrotas) {
		 this.derrotas = derrotas;
	 }
	 public void setEmpates(int empates) {
		 this.empates =empates;
	 }
	 public void apresentar() {
		 System.out.println(this.toString());
	 }
	 public void ganharPartida() {
		 this.vitorias++;
		 this.pontuacao += 3;
	 }
	 public void perderPartida() {
	 this.derrotas++;
	 }
	 public void empatarPartida() {
		 this.empates++;
		 this.pontuacao++;
	 }
	public String toString() {
		String s = "--Equipe: " + this.nome + " (" + this.divisao + "a divisão) " + "---\n" +
	               " pontuação: " + this.pontuacao + "v=" + this.vitorias +
	               " E=" + this.empates + " D=" + this.derrotas + "\n" + 
	               "=-----------------------------";
		return s;
	}

	}

