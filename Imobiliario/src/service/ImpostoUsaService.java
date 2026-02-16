package service;

public class ImpostoUsaService implements ImpostoService{
	
	public double calcularImposto( double baseDeCalculo) {
		return baseDeCalculo * 0.1;
	}
	

}
