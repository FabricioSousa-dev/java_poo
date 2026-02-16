package model;

public class LocacaoImovel {
	
	private int quantidadeDiarias;
	private double valorPorDiaria;
	private imovel imovel;
	private Cobranca cobranca;
	
	
	
	
	public LocacaoImovel(imovel imovel,int quantidadeDiarias, double valorPorDiaria) {
		this.imovel = imovel;
		this.quantidadeDiarias = quantidadeDiarias;
		this.valorPorDiaria = valorPorDiaria;
	
	}

	public int getQuantidadeDiarias() {
		return quantidadeDiarias;
	}
	public void setQuantidadeDiarias(int quantidadeDiarias) {
		this.quantidadeDiarias = quantidadeDiarias;
	}
	public double getValorPorDiaria() {
		return valorPorDiaria;
	}
	public void setValorPorDiaria(double valorPorDiaria) {
		this.valorPorDiaria = valorPorDiaria;
	}

	public imovel getImovel() {
		return imovel;
	}

	public void setImovel(imovel imovel) {
		this.imovel = imovel;
	}

	public Cobranca getCobranca() {
		return cobranca;
	}

	@Override
	public String toString() {
		return "LocacaoImovel [quantidadeDiarias=" + quantidadeDiarias + ", valorPorDiaria=" + valorPorDiaria
				+ ", imovel=" + imovel + ", cobranca=" + cobranca + "]";
	}

	public void setCobranca(Cobranca cobranca) {
		this.cobranca = cobranca;
	}

	
	
	

}
