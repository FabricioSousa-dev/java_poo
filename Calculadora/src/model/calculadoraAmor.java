package model;

public class calculadoraAmor {
	public int calcularcompatiblilidade(Pessoa p1 , Pessoa p2) {
		int compatiblidade = 0;
		int k = p1.getIdade() - p2.getIdade();
		if(k < 0) {
			k = k -1;
		}
		compatiblidade = 100 - k;
		return compatiblidade;
	}

}
