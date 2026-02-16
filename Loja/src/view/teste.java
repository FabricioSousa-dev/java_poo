package view;

import db.produtosDao;
import model.Produto;

public class teste {

	public static void main(String[] args) {
		
		produtosDao produtosDao = new produtosDao();
		
		/*Produto c1 = new Produto("iphone 15", 88499, 13999);
		Produto c2 = new Produto("Sansung galaxy A35", 65677, 1800);
		Produto c3 = new Produto("Motorola G54", 97887, 1088);
		
		produtosDao.salvar(c1);
		produtosDao.salvar(c2);
		produtosDao.salvar(c3);
	      */
           System.out.println("teste");
           Produto meuProduto = produtosDao.pegarInstanciaPor(2);
           System.out.println(meuProduto);

	}

}
