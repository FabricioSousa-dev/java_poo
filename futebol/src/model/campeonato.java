package model;

import java.util.List;

public class campeonato {
	private List<equipe> equipes;
	private List<partida> partidas;
	public campeonato(List<equipe>equipes , List<partida>partidas) {
		this.equipes = equipes;
		this.partidas = partidas;
	}
  public void executarPartidas(List<partida>partidas) {
	  for(partida p : this.partidas) {
		  p.jogar();
		  System.out.println(p);
	  }
	  
  }
  public equipe mostrarEquipes() {
	  equipe campeao = null;
	  int maiorPontuacao = 0;
	   for(equipe e : this.equipes) {
		   System.out.println(e);
		   if(e.getPontuacao() > maiorPontuacao) {
			   campeao = e;
			   maiorPontuacao = e.getPontuacao();
		   }
	   }
	   return campeao;
  }
}
