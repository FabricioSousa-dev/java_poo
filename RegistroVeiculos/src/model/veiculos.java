package model;

public class veiculos {
private String marca;
private String modelo;
private int anofabricacao;
private String cor;
private double preço;
//Crie uma classe Veiculo com atributos para marca, modelo, ano, cor e preço.
//Implemente métodos para alterar a cor do veículo e imprimir todas as informações do veículo.
//Crie um serviço para calcular o imposto a pagar de um veículo, usando a seguinte tabela:
 //Veículos com até 2 anos de fabricação: O imposto é 10% do preço do veículo
//Veículos mais de 2 até até 5 anos de fabricação: O imposto é 7% do preço do veículo
// Veículos mais de 5 até até 10 anos de fabricação: O imposto é 5% do preço do veículo
//Veículos com mais de 10 anos: O imposto é zero (isento)

public veiculos(){
	
}
public veiculos(String marca , String modelo , int anofabricacao , String cor , double preço) {
	this.marca = marca;
	this.modelo = modelo;
	this.anofabricacao = anofabricacao;
	this.cor = cor;
	this.preço = preço;
}

public String getMarca() {
	return this.marca;
}
public String getModelo() {
	return this.modelo;
}
public int getAnoFabricacao() {
	return this.anofabricacao;
}
public String getCor() {
	return this.cor;
}
public double getPreço() {
	return this.preço;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public void setModelo( String modelo) {
	this.modelo = modelo;
}
public void setAnoFabricacao(int anofabricacao) {
	this.anofabricacao = anofabricacao;
}
public void setCor(String cor) {
	this.cor = cor;
}
public void setPreço(double preço) {
	this.preço = preço;
}
public String toString(){
	return "*****O veiculo da marca: " + this.marca + " \n" + "\n" +
    "modelo: " + this.modelo + " \n" + 
	"tem " + this.anofabricacao + " ano(s) de fabricação" + " \n" +
    "Cor: " + this.cor + " \n" +
	"preço de fabrica: " + this.preço + " \n" +
    "será " + this.calcularimposto() + " de imposto";
    
	
	
}
public double calcularimposto() {
	if(anofabricacao <= 2) {
	return preço * 0.10; 
	}
	if(anofabricacao > 2 && anofabricacao <= 5) {
		return preço * 0.7;
		}
	if( anofabricacao > 5 && anofabricacao <=10) {
		return preço * 0.5;
	}
	if(anofabricacao > 10) {
		System.out.println("Você está isento");
		return 0;
	}
	return anofabricacao;
	}
	
	
}







 


