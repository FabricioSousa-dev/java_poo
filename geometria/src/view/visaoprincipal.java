package view;

import model.triangulo;

public class visaoprincipal {

	public static void main(String[] args) {
		System.out.println("Olá");
		
		
		triangulo triangulo1;
		triangulo1 = new triangulo();
		
		triangulo Triangulo2 = new triangulo();
		
		triangulo1.getCor();
		triangulo1.getladoA();
		triangulo1.getladoA();
		triangulo1.getLadoc();
		
		triangulo1.setCor("cinza");
		triangulo1.setladoA(20);
		triangulo1.setladob(50);
		triangulo1.setladoc(60);
		
		System.out.println(triangulo1.toString());
		
		Triangulo2.getCor();
		Triangulo2.getladoA();
		Triangulo2.getladob();
		Triangulo2.getLadoc();
		
		Triangulo2.setCor("azul");
		Triangulo2.setladoA(80);
		Triangulo2.setladob(80);
		Triangulo2.setladoc(90);
		
		System.out.println(Triangulo2.toString());
		
		
		
		
		
		
	
		

	}

}
