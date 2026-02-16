package view;

import java.util.ArrayList;
import java.util.List;

import model.EstoqueLivros;
import model.livro;

public class tela {

	public static void main(String[] args) {
          livro livro1 = new livro("Maquiavel", "roberto", 100, 500);
          livro livro2 = new livro("o rapto do menino de ouro", "carrera", 300, 100);
          livro livro3 = new livro("Entendendo algoritmos", "adiya h", 200, 1000);
          livro1.setLivro(livro1);
          List<livro> meuslivros = new ArrayList<livro>();
          meuslivros.add(livro1);
          meuslivros.add(livro2);
          meuslivros.add(livro3);
   
          
         System.out.println(meuslivros);
       
	}

}
