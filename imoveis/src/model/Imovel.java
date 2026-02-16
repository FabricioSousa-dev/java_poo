package model;
public class Imovel {
    private double area;
    private String tipo; 
    private String bairro;
    private double valorDeMercado;

    
    public Imovel(double area, String tipo, String bairro, double valorDeMercado) {
        this.area = area;
        this.tipo = tipo;
        this.bairro = bairro;
        this.valorDeMercado = valorDeMercado;
    }

    // Getters
    public double getArea() {
        return area;
    }

    public String getTipo() {
        return tipo;
    }

    public String getBairro() {
        return bairro;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    
    public double calcularImposto() {
        if (tipo.equals("rural")) {
            if (area > 10000) {
                return 0.02 * valorDeMercado;
            } else {
                return 0.01 * valorDeMercado;
            }
        } else { 
            if (bairro.equals("Centro")) {
                return 0.10 * valorDeMercado;
            } else if (area <= 200) {
                return 0.03 * valorDeMercado;
            } else {
                return 0.05 * valorDeMercado;
            }
        }
    }

   
    public static Imovel mostrarMelhorImovel(Imovel imovel1, Imovel imovel2) {
        if (!imovel1.getTipo().equals(imovel2.getTipo())) {
            return null; 
        }

        double impostoPorMetroQuadrado1 = imovel1.calcularImposto() / imovel1.getArea();
        double impostoPorMetroQuadrado2 = imovel2.calcularImposto() / imovel2.getArea();

        return (impostoPorMetroQuadrado1 < impostoPorMetroQuadrado2) ? imovel1 : imovel2;
    }

    public String toString() {
        return "Imovel {" +
               "Área = " + area + " m², " +
               "Tipo = '" + tipo + "', " +
               "Bairro = '" + bairro + "', " +
               "Valor de Mercado = R$ " + valorDeMercado +
               '}';
    }

   
}

    