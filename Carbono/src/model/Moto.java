package model;

public class Moto implements EmissorCarbono {
	
	private String identificador;
	private int potencia;
	private int numeroDePessoas;
	private boolean usaEnergiaRenovavel;
	private boolean temArcondicionado;
	
	
     

	public Moto(String identificador, int potencia, int numeroDePessoas, boolean usaEnergiaRenovavel,
			boolean temArcondicionado) {
		
		this.identificador = identificador;
		this.potencia = potencia;
		this.numeroDePessoas = numeroDePessoas;
		this.usaEnergiaRenovavel = usaEnergiaRenovavel;
		this.temArcondicionado = temArcondicionado;
	}
	




	public String getIdentificador() {
		return identificador;
	}





	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}





	public int getPotencia() {
		return potencia;
	}





	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}





	public int getNumeroDePessoas() {
		return numeroDePessoas;
	}





	public void setNumeroDePessoas(int numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}





	public boolean isUsaEnergiaRenovavel() {
		return usaEnergiaRenovavel;
	}





	public void setUsaEnergiaRenovavel(boolean usaEnergiaRenovavel) {
		this.usaEnergiaRenovavel = usaEnergiaRenovavel;
	}





	public boolean isTemArcondicionado() {
		return temArcondicionado;
	}





	public void setTemArcondicionado(boolean temArcondicionado) {
		this.temArcondicionado = temArcondicionado;
	}





	public double getEmissorCarbono() {
	    double fator = usaEnergiaRenovavel ? 0.5 : 2.3; // Exemplo de emissão reduzida para energia renovável
	    
	    double emissaoBase = potencia * fator; 
	    
	    
	    if (temArcondicionado) {
	        emissaoBase *= 1.1; 
	    }

	    return emissaoBase / Math.max(numeroDePessoas, 1); 
	}


}
