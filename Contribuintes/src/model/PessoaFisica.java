package model;

public class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double CalcularImposto() {
        double renda = getRenda();
        if (renda >= 1000 && renda < 2000) {
            return renda * 0.10;    
        }
        if (renda >= 2000 && renda < 5000) {
            return renda * 0.20;
        }
        if (renda >= 5000) {
            return renda * 0.30;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", {PessoaFisica, imposto = " + CalcularImposto();
    }
}



		
		

	


