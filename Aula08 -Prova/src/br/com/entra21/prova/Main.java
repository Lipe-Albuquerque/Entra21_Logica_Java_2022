package br.com.entra21.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// iniciar o menu
		
		menu();

	}

	public static void menu() {
		Scanner input = new Scanner(System.in);
		String pressEnter;
		String opcao;
		System.out.println("============================================");
		System.out.println("- PROGRAMA DE EXIBIÇÃO DOS EXERCICIOS PARA PROVA -");
		System.out.println("============================================");
		System.out.println("	Press enter to continue.");
		pressEnter = input.nextLine();

		System.out.println(" Selecione o programa que você deseja visualizar:");
		System.out.println("");
		System.out.println("  1 - Programa de calcular capturando 2 numero  e processar o resultado na tela.");


		System.out.println(
				"=============================================================================================");
		System.out.println("  3 - Para sair.");
		System.out.println(
				"=============================================================================================");
		System.out.println("  Digite a opção: ");
		opcao = input.next();

		switch (opcao) {
		case "1":
			calculadora();
			break;

		case "3":
			System.out.println("Obrigado por usar nosso programa.");
			System.exit(0);
			break;

		default:
			System.out.println("");
			System.out.println("Por favor seguir as normas de seleção citadas acima.");
			System.out.println("");
			menu();
			break;
		}

	}

	public static void calculadora() {
		float numA, numB;
		float resultado = 0;
		Scanner input = new Scanner(System.in);
		String opcao1;
		System.out.println();
		System.out.println(
				"=============================================================================================");
		System.out.println("- BEM VINDO A CALCULADORA DO TIO FILIPE -");
		System.out.println(
				"=============================================================================================");
		System.out.println("Selecione uma operação: ");
		System.out.println("1- Soma. \n2- Subtração.\n3- Multiplicação.\n4-Divisão.\n5-Retornar ao menu\n6-Sair.");
		opcao1 = input.next();

		switch (opcao1) {
		case "6":
			System.out.println("Obrigado por usar nosso programa.");
			System.exit(0);

			break;
		case "2":
			System.out.println("Digite um numero: ");
			numA = input.nextFloat();
			System.out.println("Digite outro numero: ");
			numB = input.nextFloat();
			resultado = numA - numB;
			break;

		case "3":
			System.out.println("Digite um numero: ");
			numA = input.nextFloat();
			System.out.println("Digite outro numero: ");
			numB = input.nextFloat();
			resultado = numA * numB;
			break;

		case "4":
			System.out.println("Digite um numero: ");
			numA = input.nextFloat();
			System.out.println("Digite outro numero: ");
			numB = input.nextFloat();
			resultado = numA / numB;
			break;

		case "1":
			System.out.println("Digite um numero: ");
			numA = input.nextFloat();
			System.out.println("Digite outro numero: ");
			numB = input.nextFloat();
			resultado = numA + numB;
			break;

		case "5":
			menu();
			break;
		default:
			System.out.println("");
			System.out.println("Por favor seguir as normas de seleção citadas acima.");
			System.out.println("");
			break;
		}
		System.out.println("");
		System.out.println("O resultado da sua conta é: " + resultado);
		System.out.println("");
		calculadora();

		return;

	}



	
	
}
