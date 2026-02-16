package view;

import model.ContaCorrente;
import model.ContaPoupanca;
import model.Relatorio;

public class TesteExecutavel {

	public static void main(String[] args) {
		
	ContaCorrente c1 = new ContaCorrente(676887, 9000.00);
	ContaPoupanca c2 = new ContaPoupanca(7657898, 2000000.00);
	Relatorio r1 = new Relatorio();
	c1.sacar(600.00);
	c1.depositar(900.00);
	r1.gerarRelatorio(c1);
	System.out.println(c1.sacar(900.00));
	System.out.println("O saque da conta c1 foi: " + c1.getSaldo());
	System.out.println("*****************************************************************************************************");
	
	r1.gerarRelatorio(c2);
	System.out.println(c2.sacar(3000000.00));
	System.out.println("O saque da conta c2 foi: " + c2.getSaldo());
	
	

}
}
