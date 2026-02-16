package view;

import model.produto;

public class telaPrincipal {

	public static void main(String[] args) {
		System.out.println("ola");
		produto caixa1;
		produto caixa2;
		caixa1 = new produto(0, null, 0, 0);
		caixa2 = new produto(0, null, 0, 0);
		caixa1.getNome();
		caixa1.getIdentificador();
		caixa1.getQuantidade();
		caixa1.getPreço();
		
		caixa1.setNome("café");
		caixa1.setIdentificador(455678);
		caixa1.setQuantidade(3);
		caixa1.setPreço(32.92);
		
		System.out.println(caixa1.toString());
		
		

	}

}
