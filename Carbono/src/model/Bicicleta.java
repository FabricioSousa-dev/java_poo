package model;

public class Bicicleta  implements EmissorCarbono{
      private int aro;
      private String modelo;
      
	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public double getEmissorCarbono() {
		// TODO Auto-generated method stub
		return 0;
	}

}
