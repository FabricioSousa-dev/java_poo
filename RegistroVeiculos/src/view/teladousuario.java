package view;

import model.veiculos;

public class teladousuario {

	public static void main(String[] args) {
        System.out.println("ola");
		veiculos carro1;
		veiculos carro2;
		veiculos carro3;
		carro1 = new veiculos(null, null, 0, null, 0);
		carro2 = new veiculos();
		carro3 = new veiculos();
		carro1.getMarca();
		carro1.getModelo();
		carro1.getAnoFabricacao();
		carro1.getCor();
		carro1.getPreço();
		carro1.setMarca("fiat");
		carro1.setModelo("mobi");
		carro1.setAnoFabricacao(11);
		carro1.setCor("vermelho");
		carro1.setPreço(40.000);
		
		carro2.getMarca();
		carro2.getModelo();
		carro2.getAnoFabricacao();
		carro2.getCor();
		carro2.getPreço();
		carro2.setMarca("volkswagen");
		carro2.setModelo("parati");
		carro2.setAnoFabricacao(24);
		carro2.setCor("prata");
		carro2.setPreço(26.000);
		System.out.println(carro2.toString());
		
		carro3.getMarca();
		carro3.getModelo();
		carro3.getAnoFabricacao();
		carro3.getCor();
		carro3.getPreço();
		carro3.setMarca("toyota");
		carro3.setModelo("corolla");
		carro3.setAnoFabricacao(1);
		carro3.setCor("preta");
		carro3.setPreço(144.814);		
		System.out.println(carro3.toString());
		
		
		
		
		
		
		
		
		System.out.println(carro1.toString());
		
		
		
		
	

	}

}
