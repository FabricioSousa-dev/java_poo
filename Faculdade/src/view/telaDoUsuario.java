package view;

import model.estudante;

public class telaDoUsuario {

	public static void main(String[] args) {
		estudante estudante1;
		estudante estudante2;
		estudante estudante3;
		estudante1 = new estudante("Thiago");
		estudante2 = new estudante("Roberto");
		estudante3 = new estudante("Gyovanna");
		estudante1.getNome();
		estudante1.getIdade();
		estudante1.getMatricula();
		estudante1.getNota1();
		estudante1.getNota2();
		
		estudante1.setNome("Thiago");
		estudante1.setIdade(15);
		estudante1.setMatricula(435677);
		estudante1.setNota1(9);
		estudante1.setnota2(7);
		estudante1.calculaMedia();
		
		
		estudante2.setNome("Roberto");
		estudante2.setIdade(18);
		estudante2.setMatricula(98787);
		estudante2.setNota1(6);
		estudante2.setnota2(4);
		estudante2.calculaMedia();
		
		estudante3.setNome("gyovana");
		estudante3.setIdade(20);
		estudante3.setMatricula(67688);
		estudante3.setNota1(8);
		estudante3.setnota2(9);
		estudante3.calculaMedia();
		
		
	
		
		
		
		System.out.println(estudante1.toString());
		System.out.println(estudante2.toString());
		System.out.println(estudante3.toString());
		
		
		

	}

}
