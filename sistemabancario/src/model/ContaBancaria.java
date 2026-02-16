package model;

public class ContaBancaria {
	private long numeroConta;
	private String nome;
	private double saldo;
	
	public long getnumeroConta(){
	   return this.numeroConta;
	}
	public String getnome() {
		return this.nome;
	}
	public double getsaldo() {
		return this.saldo;
	} 
	public void setnumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
		
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public double saque( double valor) {
		if(saldo <= valor ) {
			System.out.println("Realizando operação");
		}else{
			return 0;
		}
		public double deposito(double valor){
			if(saldo <= valor) {
				System.out.println("Realizanod operação");
			}else {
				return 0;
			}
		}
		
	}
	public String toString() {
		return "***************titular: "+ this.nome + "\n" +
	    "Numero da conta: " + this.numeroConta + "\n" +
		"Saldo: " + this.saldo + "\n";		
	}

}

