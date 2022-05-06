package br.com.entra21.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String frase;
		String opcao;
		System.out.println("Quero executar o assunto abaixo:");
		System.out.println("1- Procedimento");
		System.out.println("2- Paramentro");
		System.out.println("3- retorno");
		System.out.println("4- Completo");
		System.out.println("11- Exercicio 1");
		System.out.println("12- Ecercicio 2");
		opcao = input.nextLine();

		switch (opcao.toLowerCase()) {
		case "1":
		case "procedimento":
			verProcedimentos();
			break;
		case "2":
			verParametros(2);
			verParametros(18);
		case "parametros":
			System.out.println("");
		case "retornos":
			verProcedimentos();
			break;
		case "completo":
			verProcedimentos();
			break;
			
		default:

			System.out.println("Não tenho essa opção no menu");

			break;
		}

		System.out.println("1 - procedimentos");

		capturarFrase();
		frase = input.nextLine();

	}

	public static void capturarFrase() {
		// declaração de função
		// as regras de uso e como será executado
		System.out.println("Escreva uma frase...");
		System.out.println("-----------------------------");
		System.out.println("-   Enter para continuar    -");
		System.out.println("-----------------------------");

	}
	
	public static void verProcedimentos() {
		Scanner input = new Scanner(System.in);
		String frase;
		System.out.println("1 - procedimentos");

		capturarFrase();
		frase = input.nextLine();

		System.out.println("1 - procedimentos");

		capturarFrase();
		frase = input.nextLine();

		System.out.println("1 - procedimentos");

		capturarFrase();
		frase = input.nextLine();

		
		
	}
	
	public static void verParametros(int numero) {
		
		System.out.println("Vc me passou por parametro o numero: "+ numero);
		if (numero % 2 == 0) {
			System.out.println("que legal ele é par");
		}
	}
	
	public static byte retornarValorInteiro() {
		byte variavelParaRetorno=15;
		return variavelParaRetorno;
	}

	public static float calcularDivisao(float numeroA,float numeroB) {
		
		return numeroA/numeroB;
		
	}
	
}
