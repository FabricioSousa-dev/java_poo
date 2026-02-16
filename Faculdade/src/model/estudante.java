package model;

public class estudante {
	private String nome;
	private int idade;
	private int matricula;
	private float nota1;
	private float nota2;
	private float mediaFinal;
	
	
	
	
	
	public estudante(String nome){
		this.nome = nome;
	}
	public estudante(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	public String getNome(){
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	public int getMatricula(){
		return this.matricula;
	}
	public float getNota1(){
		return this.nota1;
	}
	public float getNota2(){
		return this.nota2;
	}
	public float getMediaFinal(){
		return this.mediaFinal;
	}
	public void setNome( String nome){
		this.nome = nome;
	}
	public void setMatricula( int matricula){
		this.matricula = matricula;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setNota1( float nota1){
		this.nota1 = nota1;
	}
	public void setnota2( float nota2){
		this.nota2 = nota2;
	}
	public String infotmaMatricula() {
		if(this.matricula > 0) {
			return "Matricula aceita";
		}else {
			return "Nenhuma matricula no campo";		}
	}
	
	public String informaNota() {
		if(this.nota1 > 0 && this.nota2 > 0 && this.calculaMedia() > 6) {
		     return "Aprovado! nos vemos no proximo periodo!";
		}else {
			return "reprovado";
			
		}
		
	}
	public float calculaMedia() {
		this.mediaFinal = (nota1 + nota2)/2;
		return this.mediaFinal;
				
	}
	public String toString(){
	   return "*****O aluno: " + this.nome + "\n" + 
	   "Idade: " + this.idade + " \n" +
	   "matricula: " + this.matricula + " ********" + this.infotmaMatricula()+"*********" + " \n" + 
	   "Nota na prova a1: " + this.nota1 + " \n" +
	   "Nota na prova a2: " + this.nota2 + " \n" +
	   "media final: " + this.mediaFinal + " \n" +
	   "*********************\nVocê foi: " + this.informaNota() + " \n";
	   
	}
		
		
		
		
		
	}
