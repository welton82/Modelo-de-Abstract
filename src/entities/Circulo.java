package entities;

import enums.Color;

public class Circulo extends Shappe{

	private Double raio;
	
	
	public Circulo(Double raio, Color color) {
		super(color);
		this.raio = raio;
	}

	public Circulo() {
		super();
	}


	public Double getRaio() {
		return raio;
	}


	public void setRaio(Double raio) {
		this.raio = raio;
	}



	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
		
	}

}
