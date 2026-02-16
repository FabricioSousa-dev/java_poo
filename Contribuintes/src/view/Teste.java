package view;

import java.util.ArrayList;
import java.util.List;

import model.Contribuinte;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Teste {

	public static void main(String[] args) {
    
      
      
      List<Contribuinte> contribuintes = new ArrayList<Contribuinte>();
      contribuintes.add(new PessoaFisica("Carlos", 4000.00));
      contribuintes.add(new PessoaFisica("Núbia", 8000.00));
      contribuintes.add(new PessoaFisica("Jóse", 8000.00));
      contribuintes.add(new PessoaFisica("Rafael", 1000.00));
      
      for (Contribuinte a : contribuintes) {
    	  System.out.println(contribuintes);
      }
      
		
	}

}
