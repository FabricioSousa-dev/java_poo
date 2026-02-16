package model;

public class imovel {

	  private String descricao;

	  public imovel(String descricao) {
		  this.descricao = descricao;
	  }
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public String toString() {
		return "imovel [descricao=" + descricao + "]";
	}
	  
	  
	
	
}
