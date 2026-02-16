package view;

import model.Pessoa;
import model.calculadoraAmor;

public class tela {

	public static void main(String[] args) {
		Pessoa ele = new Pessoa(18, "Filipe");
        Pessoa ela = new Pessoa(20, "maria");
        calculadoraAmor calc= new calculadoraAmor();
        int chance = calc.calcularcompatiblilidade(ele, ela);
        System.out.println("A chance de da certo e de: " + chance);
	}

}
