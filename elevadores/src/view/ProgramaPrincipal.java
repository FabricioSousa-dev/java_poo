package view;


import model.Elevador;

public class ProgramaPrincipal {
		public static void main(String[] args) {
			System.out.println("Olá");
			
			Elevador e1 = new Elevador();
			e1.setNome("Atlas 2001");
		    e1.setCapacidadePessoas(6);
			e1.receberPessoas();
			e1.receberPessoas();
			e1.receberPessoas();
			e1.receberPessoas();
			e1.receberPessoas();
			e1.receberPessoas();
			e1.receberPessoas();
		
			System.out.println(e1.tostring());	
			Elevador e2 = new Elevador();
			
			
			e2.setNome("schindler 2020");
			e2.setCapacidadePessoas(20);
			e2.receberPessoas(10);
			System.out.println(e2.tostring());
			
		}

	

}
