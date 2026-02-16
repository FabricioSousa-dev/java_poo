package view;

import model.retanguloCorpo;

public class visaoDoUsuario {

	public static void main(String[] args) {
		System.out.println("olá");
		
		retanguloCorpo retangulo1;
		retanguloCorpo retangulo2;
		retangulo1 = new retanguloCorpo();
		retangulo2 = new retanguloCorpo();
		
		
		retangulo1.getLargura();
		retangulo1.getComprimento();
		retangulo1.getArea();
		
		retangulo1.setLargura(8);
		retangulo1.setComprimento(5);
		retangulo1.setArea(40);
		
		retangulo2.getLargura();
		retangulo2.getComprimento();
		retangulo2.getArea();
		
		retangulo2.setLargura(7);
		retangulo2.setComprimento(4);
		retangulo2.setArea(28);
		
              System.out.println(retangulo1.toString());
              System.out.println(retangulo2.toString());
	}

}
