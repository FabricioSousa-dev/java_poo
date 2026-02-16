package model;

import java.util.Random;

public class partida {
	private boolean autorizada;
	private equipe equipeDaCasa;
	private equipe equipeVisitante;
	private int golsEquipeDaCasa;
	private int golsEquipeVisitante;
	
	public partida(equipe equipeDaCasa , equipe equipeVisitante) {
		this.equipeDaCasa = equipeDaCasa;
		this.equipeVisitante = equipeVisitante;
		autorizada();
	}

	public void setEquipeDaCasa(equipe equipeDaCasa) {
		this.equipeDaCasa = equipeDaCasa;
	}
   public void setEquipeVisitante(equipe equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public boolean autorizada() {
		if(this.equipeDaCasa == this.equipeVisitante) {
			this.autorizada = false;
			return false;
		}else {
			if(this.equipeDaCasa.getDivisao() != this.equipeVisitante.getDivisao()) {
				this.autorizada = false;
				return false;
			}else {
				this.autorizada = true;
				return true;
			}
		}
	}
    public void jogar() {
    	if(!this.autorizada) {
    		System.out.println("partida não autorizada!");
    	}else {
    		
    		Random sorteador = new Random();
    		this.golsEquipeDaCasa = sorteador.nextInt(5);
    		int golsVisitante = sorteador.nextInt(4);
    		if(this.golsEquipeDaCasa > this.golsEquipeVisitante) {
    			this.equipeDaCasa.ganharPartida();
    			this.equipeVisitante.perderPartida();
    		}else if(this.golsEquipeVisitante > this.golsEquipeDaCasa) {
    			this.equipeVisitante.ganharPartida();
    			this.equipeDaCasa.perderPartida();
    		}else {
    			this.equipeDaCasa.empatarPartida();
    			this.equipeVisitante.empatarPartida();
    		}
    		}
    }
	
	public String toString() {
		String s = " ----partida de futebol----\n" +
	"  " + this.equipeDaCasa.getNome() + " " + this.golsEquipeDaCasa + " x " + this.golsEquipeVisitante + " " + this.equipeVisitante.getNome() + "\n" +
	"--------------------------------";
		return s;
	}
	
}

