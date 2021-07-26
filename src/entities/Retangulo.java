package entities;

import enums.Color;

public class Retangulo extends Shappe{

	private Double comprimento;
	private Double largura;
	
	

	public Retangulo(Double comprimento, Double largura, Color color) {
		super(color);
		this.comprimento = comprimento;
		this.largura = largura;
	}




	public Retangulo() {
		super();
	}




	public Double getComprimento() {
		return comprimento;
	}




	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}




	public Double getLargura() {
		return largura;
	}




	public void setLargura(Double largura) {
		this.largura = largura;
	}




	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return largura * comprimento;
	}
	
	
	
}
