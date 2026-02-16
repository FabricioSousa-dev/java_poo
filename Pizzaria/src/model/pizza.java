package model;

import java.util.List;

public class pizza {
	private String nome;
	private double preço;
	private List<ingrediente> ingrediente;
	
	public pizza(String nome , double preço) {
		this.nome = nome;
		this.preço = preço;
	}
	public List<ingrediente> getIngrediente(){
		return ingrediente;
		
	}
	public void setIngrediente(List <ingrediente> ingrediente) {
          this.ingrediente = ingrediente;		
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
        sb.append("**************************\n");
        sb.append("Pizza: ").append(nome).append("\n");
        sb.append("Preço: R$ ").append(String.format("%.2f", preço)).append("\n");
        sb.append("Ingredientes:\n");

        if (ingrediente != null && !ingrediente.isEmpty()) {
            for (ingrediente ing : ingrediente) {
                sb.append("- ").append(ing.getNome()).append(" (")
                  .append(ing.getCalorias()).append(" kcal)\n");
            }
        } else {
            sb.append("Nenhum ingrediente cadastrado.\n");
        }

        return sb.toString();
    }
	}
	
	


