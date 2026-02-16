package model;

public class retanguloCorpo {
	private int largura;
	private int comprimento;	
	private int area;
	
	public int getLargura(){
		return this.largura;
	}
	public int getComprimento() {
		return this.comprimento;
	}
	public int getArea() {
		return this.area;
	}
	public void setLargura(int largura) {
		this.largura = largura;
		
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String informaRetanguloMedidas(){
		int c, l, a;
		c = this.comprimento;
		l =this.largura;
		a = this.area;
		if(c > 0 && l > 0 && a > 0) {
			return"Executando";
			
		}else {
			if(c < 1 && l < 0 && a < 0)
				return"*********nenhuma operação pode ser executada com esses valores***************";
		}
		return null;
		
		}

	public String toString(){
		return "**************************** As medidas do retangulo são: \n" +
	    "A largura: " + this.largura  + 
	    "\nO comprimento: " + this.comprimento + "\n" +
	    "A área: " + this.area + "\n";
		
		
		
	}

}
