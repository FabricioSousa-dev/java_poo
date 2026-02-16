package model;

public class Carro  implements EmissorCarbono{
     private String identificador;
     private int cilindradas;
     private String combustivel;
     
     public Carro(String indentificador , int cilindradas , String combustivel) {
       this.identificador = indentificador;
       this.cilindradas = cilindradas;
       this.combustivel = combustivel;
     }
	
	public String getIndentificador() {
		return identificador;
	}



	public void setIndentificador(String indentificador) {
		this.identificador = indentificador;
	}



	public int getCilindradas() {
		return cilindradas;
	}



	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}



	public String getCombustivel() {
		return combustivel;
	}



	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}



	public double getEmissorCarbono(){
		double fator = 0;

	    
	    if (combustivel.equalsIgnoreCase("gasolina")) {
	        fator = 2.3; 
	    } else if (combustivel.equalsIgnoreCase("diesel")) {
	        fator = 2.7; 
	    } else if (combustivel.equalsIgnoreCase("etanol")) {
	        fator = 1.5; 
	    }

	   
	    return cilindradas * fator;
	}

}
