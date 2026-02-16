package model;


public abstract class ContaBancaria {
    private long numeroDaConta;
    private double saldo;

    public ContaBancaria(long numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }


	public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean sacar(double valor);
    public abstract void depositar(double valor);
}
