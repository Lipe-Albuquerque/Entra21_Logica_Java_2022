package br.com.entra21.ex01.AreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.");
		System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.\r\n"
				+ "O perímetro é obtido ao somar todos os vertices do retângulo.");

		Scanner input = new Scanner(System.in);
		float base, altura, area, perimetro;
		
		System.out.println("Informe a base do retangulo");
		base = input.nextFloat();
		
		System.out.println("Informe a altura do retangulo");
		altura = input.nextFloat();
				
				area = base * altura;
				perimetro = base * 2 + altura * 2;
				
		System.out.println("area: "+ area + "/ perimetro " + perimetro);
		
		
	}

}
