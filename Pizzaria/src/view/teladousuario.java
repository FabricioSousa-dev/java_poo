package view;

/*Fabricio Teixeira De Sousa 215f */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.ingrediente;
import model.pizza;
import util.CalculadoraDeCalorias;

public class teladousuario {

	 public static void main(String[] args) {
	    
	        pizza pizzaDoChefe = new pizza("Pizza do Chefe", 50.00);

	      
	        ingrediente calabresa = new ingrediente("Calabresa", 500);
	        ingrediente queijo = new ingrediente("Queijo", 400);
	        ingrediente bacon = new ingrediente("Bacon", 600);

	      
	        pizzaDoChefe.setIngrediente(Arrays.asList(calabresa, queijo, bacon));

	      
	        System.out.println(pizzaDoChefe);
	        CalculadoraDeCalorias calc = new CalculadoraDeCalorias();
	        int totalCalorias = calc.calcularCalorias(pizzaDoChefe);

	        System.out.println("Total de calorias da pizza: " + totalCalorias + " kcal");
	    }

	}


