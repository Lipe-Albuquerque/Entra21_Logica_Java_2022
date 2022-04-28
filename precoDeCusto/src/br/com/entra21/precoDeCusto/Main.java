package br.com.entra21.precoDeCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double obtainedScore=0, totalScore=0;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, após, processe um aumento de 65% e informe qual será o preço de venda.\r\n"
				+ "");
		System.out.println("Digite o nome do produto: ");
		name = input.nextLine();
		
		System.out.println("Digite o valor de custo do produto");
		obtainedScore = input.nextDouble();
		
		
		
		
		totalScore = (obtainedScore*1.65);
		
		System.out.println("O preçõ do final do produto "+ name + "é: "+totalScore);
		
		
		
		
		

	}

}
