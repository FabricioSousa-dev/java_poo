package model;

public class produto {
	private long identificador;
	private String nome;
	private double preço;
	private int quantidade;
	public double totalApagar;
	
	public produto(long identificador , String nome , double preço , int quantidade ) {
		this.identificador = identificador;
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
		}
	
	public long getIdentificador() {
		return this.identificador;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPreço() {
		return this.preço;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setIdentificador( long identificador) {
		this.identificador = identificador;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
   public String toString() {
	   return "*******************************************" + " \n" +
       this.nome + " " + this.preço + " R$"+"\n" +
	    "Identificação " + this.identificador + " \n" +
       "Total a pagar : " + this.calculadoradeprodutos();
			   
   }
   public double calculadoradeprodutos() {
	   this.totalApagar = (preço * quantidade);
			   return totalApagar;
	  
	   
   }
}
