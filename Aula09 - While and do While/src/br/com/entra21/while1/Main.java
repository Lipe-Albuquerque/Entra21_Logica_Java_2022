package br.com.entra21.while1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("======================================================");
		System.out.println("=             Choose one option                     =");
		System.out.println("======================================================");
		System.out.println(" 0 - Sair\n 1 - While\n 2 - Do While");
		System.out.println("======================================================");
		// instanciando um objeto da classe Scanner
		switch (new Scanner(System.in).next().toLowerCase()) {
		case "0":
			System.out.println("Programing encerred");
			break;
		case "1", "while":
			aprenderWhile();

			break;
		case "2", "do-while":
			aprenderDoWhile();
		

			break;
		default:
			System.out.println("\nInvalid text");
			main(null);
			break;
		}

	}

	private static void aprenderWhile() {

		System.out.println("Vamos aprender o while aqui");
		byte contagem = 1;
		while (contagem<=10) {// condição de permanencia
			System.out.println("Contando..." + contagem++);
		}	//para fazer uma repetição com base em quantidade 
		
		System.out.println("Acabei");
		
		Scanner input = new Scanner(System.in);
		String resposta=input.next();
		while(contagem!=0 && resposta.equals("continuar")) {
			System.out.println("Você respondeu: "+resposta);
			System.out.println("Deseja continuar?");
			resposta=input.next();
		}
		
		System.out.println("Terminou meu while com base em decisão");
	
		main(null);
	}

	private static void aprenderDoWhile() {
		System.out.println("Vamos aprender o do while aqui");
		main(null);
	}

}
