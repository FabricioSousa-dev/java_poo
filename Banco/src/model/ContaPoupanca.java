package model;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {
    private double taxaDeOperacao;

    public ContaPoupanca(long numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
        this.taxaDeOperacao = 3.00; 
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxa) {
        this.taxaDeOperacao = taxa;
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + taxaDeOperacao;
        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        if (valor > taxaDeOperacao) {
            setSaldo(getSaldo() + (valor - taxaDeOperacao));
        }
    }

	@Override
	public void mostrarDados() {
		System.out.println("Conta corrente - número: " + getNumeroDaConta() + " \n" +
			     "Saldo: " + getSaldo() + " \n" +
				"Taxa de operação: " + getTaxaDeOperacao());
				 
		
	}
}

