package model;

public class ContaCorrente extends ContaBancaria implements Imprimivel {
    private double limite;

    public ContaCorrente(long numeroDaConta, double saldo) {
        super(numeroDaConta, saldo);
       
    }

    public void setLimite(double limite) {
    	this.limite = limite;
    	
    }
    public double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }

	@Override
	public void mostrarDados() {
		System.out.println("Conta corrente - número: " + getNumeroDaConta() + " \n" +
	     "Saldo: " + getSaldo() + " \n" +
		 "limite: " + getLimite());
		
	}
}