package application;

import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;
import enums.Color;

public class Program {
	
	

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informar a cor do Retangulo: ");
		Color color = Color.valueOf(scan.next().toUpperCase());
		
		System.out.print("Informe o Comprimento: ");
		Double comp = scan.nextDouble();
		System.out.print("Informe Largura: ");
		Double larg = scan.nextDouble();
		Retangulo r = new Retangulo(comp, larg, color);
		
		System.out.print("Informar a cor do Circulo: ");
		color = Color.valueOf(scan.next().toUpperCase());
		System.out.print("Informe o raio: ");
		Double raio = scan.nextDouble();
		Circulo c = new Circulo(raio, color);
		
		System.out.println("Cor do Retangulo: " + r.getColor() + " Área: " + String.format("%.2f", r.area()));
		System.out.println( "Cor do Circulo: " + c.getColor()+ " Área: " + String.format("%.2f", c.area()));
		
	}
	
}
