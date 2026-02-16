package model;

public class Cobranca {
         
	private double valorPrincipal;
	private double valorImposto;
	
	
	
	public Cobranca(double valorPrincipal, double valorImposto) {
		this.valorPrincipal = valorPrincipal;
		this.valorImposto = valorImposto;
	}



	public double getValorPrincipal() {
		return valorPrincipal;
	}



	public void setValorPrincipal(double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}



	public double isValorImposto() {
		return valorImposto;
	}



	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}



	public double valorPagamento() {
		
		
		return this.valorPrincipal + this.valorImposto;
	 
	}



	@Override
	public String toString() {
		return "Cobranca [valorPrincipal=" + valorPrincipal + ", valorImposto=" + valorImposto + ", valorPagamento()="
				+ valorPagamento() + "]";
	}



	

	
	
	
	
	
}
