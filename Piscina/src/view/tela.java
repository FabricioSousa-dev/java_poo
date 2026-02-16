package view;

import model.piscina;

public class tela {

	public static void main(String[] args) {
		System.out.println("ola");
       piscina piscina1;
       piscina piscina2;
       piscina2 = new piscina(0, 0, 0, 0, 0);
       piscina1 = new piscina(0, 0, 0, 0, 0);
       piscina1.getComprimento();
       piscina1.getLargura();
       piscina1.getProfundidademaxima();
       piscina1.getQuantidadeMaximaDeAgua();       
       piscina1.getlitrosAgua();
       
       piscina1.setComprimento(50.0);
       piscina1.setLargura(25.0);
       piscina1.setprofundidadeMaxima(2.50);
       piscina1.setquantidadeMaximaDeAgua(2.500);
       piscina1.setlitrosAgua(2.500);
       piscina1.encher();
       piscina1.encher();
       piscina1.encher();
       
       System.out.println(piscina1.toString());
       
       piscina2.getComprimento();
       piscina2.getLargura();
       piscina2.getProfundidademaxima();
       piscina2.getQuantidadeMaximaDeAgua();
       piscina2.getlitrosAgua();
       
       piscina2.setComprimento(40.0);
       piscina2.setLargura(15.6);
       piscina2.setprofundidadeMaxima(3.50);
       piscina2.setquantidadeMaximaDeAgua(5.500);
       piscina2.setlitrosAgua(2.000);
       piscina2.esvaziar();
       piscina2.esvaziar();
       piscina2.esvaziar();
       
       

	}

}
