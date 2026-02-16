package view;

import model.ContaBancaria;

public class TelaPrincipal {

	public static void main(String[] args) {
		ContaBancaria cliente1;
		cliente1 = new ContaBancaria();
		cliente1.setnome("Henrique barbosa");
		cliente1.setnumeroConta(45667);

		System.out.println(cliente1.toString());
		

	}

}
