package model;

public class piscina {
 private double comprimento;
 private double largura;
 private double profundidademaxima;
 private double litrosagua;
 private double quantidademaximadeagua;
 
 
 public piscina(){
	 
 }
 public piscina(double comprimento , double largura , double profundidademaxima , double litrosagua , double quantidademaximadeagua) {
	this.comprimento = comprimento;
	this.largura = largura;
	this.profundidademaxima = profundidademaxima;
	this.litrosagua = litrosagua;
	this.quantidademaximadeagua = quantidademaximadeagua;
 }
 public double getComprimento() {
	 return this.comprimento;
 }
 public double getLargura() {
	 return this.largura;
 }
 public double getProfundidademaxima() {
	 return this.profundidademaxima;
 }

 public double getlitrosAgua() {
	 return this.litrosagua;
 }
 public double getQuantidadeMaximaDeAgua() {
	 return this.quantidademaximadeagua;
	 
 }
 public void setComprimento( double comprimento) {
	 this.comprimento = comprimento;
 }
 public void setLargura( double largura) {
	 this.largura = largura;
 }
 public void setprofundidadeMaxima( double profundidademaxima) {
	 this.profundidademaxima = profundidademaxima;
 }
 
 public void setlitrosAgua(double litrosagua) {
	 this.litrosagua = litrosagua;
 }
 public void setquantidadeMaximaDeAgua(double quantidademaximadeagua) {
	 this.quantidademaximadeagua = quantidademaximadeagua;
 }
 public String toString() {
	 return "*************************A piscina tem " + this.comprimento + " comprimento" + " \n" +
     "De largura: " + this.largura + "\n" + "\n" +
	  "De comprimento: " + this.comprimento + " \n" +
      "A profundidade máxima é: " + this.profundidademaxima + "\n" +
	  "|Ela tem " + this.litrosagua + " de litros de agua" + "\n" +
       "o limite total de litros de água é: "+ this.quantidademaximadeagua + " ***************************************************";
	 
 }
 public void esvaziar() {
	 if(this.litrosagua< this.profundidademaxima) {
		 this.litrosagua--;
		 System.out.println("Esvaziando");
	 }
 }
 public void litrosagua() {
	 if(this.litrosagua <= this.profundidademaxima) {
		 System.out.println("trabalhando");
	 }
 } 
 public void encher() {
	 if(this.litrosagua <= this.profundidademaxima) {
	 this.litrosagua++		;
		 System.out.println("Enchendo");
	 }else {
		 System.out.println("cheio! se ultrapassar o limite, vai vazar!!!");
	 }
 }
}
