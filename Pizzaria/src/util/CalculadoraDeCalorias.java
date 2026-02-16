package util;

import model.pizza;
import model.ingrediente;

public class CalculadoraDeCalorias {

    public int calcularCalorias(pizza pizza) {
        int total = 0;
        if (pizza.getIngrediente() != null) {
            for (ingrediente ing : pizza.getIngrediente()) {
                total += ing.getCalorias();
            }
        }
        return total;
    }
}
