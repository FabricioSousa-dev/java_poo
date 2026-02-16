package model;

public class PessoaJuridica  extends Contribuinte{
	

	
	

	public PessoaJuridica(String nome, double renda) {
		super(nome, renda);
		
	}
	@Override
	public double CalcularImposto() {
		double renda = getRenda();
		if (renda >= 1000 && renda < 2000) {
	        return renda * 0.20;	
	    }
	    if (renda >= 2000 && renda < 5000) {
	        return renda * 0.20;
	    }
	    if(renda > 500) {
	    	return renda *0.20;
	    }
		return renda;
	    
	}
	@Override
	public String toString() {
		return "Pessoa Juridica" +  " "+ "Nome: " + getNome() +" "+ "renda: " + getRenda() + " "+" imposto: " +  CalcularImposto() ;
	}
	

}
