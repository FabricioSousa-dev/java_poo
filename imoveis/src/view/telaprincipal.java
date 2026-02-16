package view;

import model.Imovel;

public class telaprincipal {

	 public static void main(String[] args) {
	        
	        Imovel imovel1 = new Imovel(150, "urbano", "Centro", 500000);
	        Imovel imovel2 = new Imovel(300, "urbano", "Bairro A", 400000);
	        Imovel imovel3 = new Imovel(12000, "rural", "Zona Rural", 1000000);

	      
	        System.out.println(imovel1);
	        System.out.println(imovel2);
	        System.out.println(imovel3);

	     
	        System.out.println("Imposto do Imóvel 1: R$ " + imovel1.calcularImposto());
	        System.out.println("Imposto do Imóvel 2: R$ " + imovel2.calcularImposto());
	        System.out.println("Imposto do Imóvel 3: R$ " + imovel3.calcularImposto());

	       
	        Imovel melhorImovel = Imovel.mostrarMelhorImovel(imovel1, imovel2);
	        if (melhorImovel != null) {
	            System.out.println("O melhor imóvel é: " + melhorImovel);
	        } else {
	            System.out.println("Os imóveis não são comparáveis.");
	        }
	    }
}
	

		


