package br.com.entra21.switch1.exercicio001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. \r\n"
				+ "Qual é a sua estação do ano favorita? ");
		Scanner input = new Scanner(System.in);
		byte opcao;
		
		
		
		System.out.println("1= Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		System.out.println("Escolha sua estação favorita: ");
		opcao = input.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.println("As flores aparecem");
			break;
			
		case 2:
			System.out.println("O inverno esta chegando");
			break;
			
		case 3:
			System.out.println("Hora de se agasalhar");
			break;
			
		case 4:
			System.out.println("Praia do rosa lotadassa");
			break;
			
			default:
				System.out.println("Você esta tentando quebrar meu codigo ?");
				break;
		}
	}

}
