package service;

import model.Cobranca;
import model.LocacaoImovel;

public class LocacaoService {
	private ImpostoBrasilService impostoBrasilService;
	public LocacaoService(ImpostoBrasilService impostoBrasilService) {
		this.impostoBrasilService = impostoBrasilService;
	}

	public void processarCobranca(LocacaoImovel locacaoImovel) {
		double valorPricipal = locacaoImovel.getValorPorDiaria() * locacaoImovel.getQuantidadeDiarias();
		double valorImposto = this.impostoBrasilService.calcularImposto(valorPricipal);
		Cobranca cobranca = new Cobranca(valorPricipal, valorImposto);
		locacaoImovel.setCobranca(cobranca);
	}
	
}
