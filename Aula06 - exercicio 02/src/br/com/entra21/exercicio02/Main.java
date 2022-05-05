package br.com.entra21.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Com o mesmo formato do exercício 1 , agora aceite apenas String como resposta\r\n"
				+ "Qual é a sua cor favorita? ");
		
		String choose;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha sua cor favorita entre as opções: \nVerde\nVermelho\nAmarelo\nPreto");
		choose = input.next();
		//choose = choose.toLowerCase();
		//choose = choose.toUpperCase();
		switch(choose) {
		
		case "Verde":
		
		case "verde":
			System.out.println("Você gosta de verde em");

			break;
			
		case "Amarelo":
			
		case "amarelo":
			System.out.println("Você gosta de amarelo em");

			break;
			
		case "Vermelho":
		
		case "vermelho":
			System.out.println("Você gosta de vermelho em");

			break;
			
		case "Preto":
		
		case "preto":
			System.out.println("Você gosta de preto em");

			break;

		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
