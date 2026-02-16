package service;

public class ImpostoBrasilService implements ImpostoService{

	public double calcularImposto( double baseDeCalculo) {
		double imposto = 0;
		if(baseDeCalculo <= 1000) {
			return baseDeCalculo * 0.2;
		}else if(baseDeCalculo > 1000 && baseDeCalculo <= 5000) {
			return baseDeCalculo * 0.4;
		}else if(baseDeCalculo > 5000) {
			return baseDeCalculo * 0.5;
		}
		
		
		return imposto;
	}
}
