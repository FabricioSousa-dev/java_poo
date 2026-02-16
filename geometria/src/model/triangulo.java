	package model;

public class triangulo {
	
    private double ladoA;
	private double ladob;
	private double ladoc;
	private String cor;
	
	
	
	public double getladoA() {
		return this.ladoA;
	}
	public double getladob() {
		return this.ladob;
	}
	public double getLadoc() {
		return this.ladoc;
	}
	public String getCor(){
		return this.cor;
	}
     public void setladoA(double ladoA) {
    	 this.ladoA = ladoA;
     }
     public void setladob( double ladob) {
    	 this.ladob = ladob;
     }
     public void setladoc(double ladoc) {
    	 this.ladoc = ladoc;
     }
     public void setCor(String cor) {
    	 this.cor = cor;
     }
	public String informaTipo() {
		double a,b, c;
		a = this.ladoA;
		b = this.ladob;
		c = this.ladoc;
	    
	    if(a < b+c && b < a+c && c < a+b) {
	    	
	    	if (a == b && b == c) {
	    		return " Equilátero";
	    	}else { 
	    		if(a == b || a == c || b == c) {
	    			
	    			return " Isósceles";
	    		}else { 
	    			
	    			return " escaleno";
	    		}
	    			
	    			
	    		}
	    		
	          
	    } else {
	    	
	    	
	   return "Não e  triangulo!";
		
		
	}}
	public double informaArea() {
		double a,b, c , p ,area;
		a = this.ladoA;
		b = this.ladob;
		c = this.ladoc;
		if(this.informaTipo() != "impossivel") {
		
		p = (a + b + c)/ 2;
		area = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		return area;
	
	}else {
		return 0;
	}
	}
	public void mudarCor(String cor) {
		this.cor = cor;
		
		}
	public String toString() {
		return "*****************O triangulo tem: \n" +
	    "lado A: " + this.ladoA + "\n" +
		"Lado B: " + this.ladob + "\n" +
	    "Lado C: " + this.ladoc + "\n" +
		"Cor: " + this.cor + "\n";
		
	}
	
	
	
	
	
	
	}
