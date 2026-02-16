	package view;


import java.util.ArrayList;
import java.util.List;

import model.campeonato;
import model.equipe;
import model.partida;

public class telaprincipal {

			
	public static void main(String[] args) {
			 	
			
			 equipe e01 = new equipe("vila", 1);
			 equipe e02 = new equipe("Anapolis", 1);
			 equipe e03 = new equipe("Goiás", 1);
			 equipe e04 = new equipe("Atlético", 1);
			 List<equipe> equipes = new ArrayList<equipe>();
			     equipes.add(e01);
			     equipes.add(e02);
			     equipes.add(e03);
			     equipes.add(e04);
			     
			 partida p01 = new partida(e01, e02);
			 partida p02 = new partida(e01, e03);
			 partida p03 = new partida(e01, e04);
			 
			 partida p04 = new partida(e02, e01);
			 partida p05 = new partida(e02, e03);
			 partida p06 = new partida(e02, e04);
			 
			 partida p07 = new partida(e02, e01);
			 partida p08 = new partida(e02, e03);
			 partida p09 = new partida(e02, e04);
			 
			 partida p10 = new partida(e02, e01);
			 partida p11 = new partida(e02, e03);
			 partida p12 = new partida(e02, e04);
			 
			 List<partida> partidas = new ArrayList<partida>();
			 
               partidas.add(p01);
               partidas.add(p02);
               partidas.add(p03);
               partidas.add(p04);
               partidas.add(p05);
               partidas.add(p06);
               partidas.add(p07);
               partidas.add(p08);
               partidas.add(p09);
               partidas.add(p10);
               partidas.add(p11);
               partidas.add(p12);
              campeonato goianao = new campeonato(equipes , partidas);
                 goianao.executarPartidas(partidas);
               equipe campeao = goianao.mostrarEquipes();
               System.out.println("O grande campeão foi : \n" + campeao.toString());;
			 
	}
}
