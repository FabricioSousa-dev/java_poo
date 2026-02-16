package view;

import model.Cobranca;
import model.LocacaoImovel;
import model.imovel;
import service.ImpostoBrasilService;
import service.LocacaoService;

public class teste {

	public static void main(String[] args) {
		imovel casa1 = new imovel("Casa no bueno");
		LocacaoImovel locacao1 = new LocacaoImovel(casa1, 10, 200);
		LocacaoService locacaoService = new LocacaoService(new ImpostoBrasilService());
		locacaoService.processarCobranca(locacao1);
		System.out.println(locacao1);

	}

}
