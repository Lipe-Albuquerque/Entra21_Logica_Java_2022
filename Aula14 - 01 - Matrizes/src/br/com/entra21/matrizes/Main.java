package br.com.entra21.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);

	// Definindo minhas variavel entrada do tipo Scanner acessivel em toda classe
	// Main
	// Como o metodo main é static, tanto metodos ou variaveis devem ser static para
	// se relacionarem com o metodo main

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte opcao;

		do {
			System.out.println(escreverMatrizes());
			opcao = entrada.nextByte();
			switch (opcao) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderMatrizesSimples();
				break;

			case 2:
				aprenderMatrizesInicializados();
				break;

			default:
				break;
			}

		} while (opcao != 0);

	}

	private static String escreverMatrizes() {
		String conteudoMenu = "Escolha uma opção para aprender:\n";
		conteudoMenu += "\t1 - Inicializnado matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando martrizes com valores predeterminados";
		return conteudoMenu;
	}

	private static void aprenderMatrizesSimples() {
		System.out.println("Aprendendo sobre Matrizes simples");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos\n");
		float notas[][];
		notas = new float[10][3];
		// primeiro indice é a quantidade de vetores
		// segundo indice é a capacidade de cada vetor
		// apenas no ultimo indice da criacao pela sintaxe ficam os valores

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:");
		quantidadeAlunos = entrada.nextByte();

		System.out.println("Informe a quantidade de notas para cada alunos:");
		quantidadeNotas = entrada.nextByte();

		// quem, decide o tamanho da minha matriz é o usuario
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte countLevelOne = 0; countLevelOne < novasNotas.length; countLevelOne++) {
			System.out.println(
					"Nessa posição [" + countLevelOne + "] temos " + novasNotas[countLevelOne].length + " notas");
			for (byte countLastLevel = 0; countLastLevel < novasNotas[countLevelOne].length; countLastLevel++) {
				System.out.println("\t Valor da nota [" + countLastLevel + "]   ===>   "
						+ novasNotas[countLevelOne][countLastLevel]);
			}
		}
	}

	private static void aprenderMatrizesInicializados() {
		
		float salarioAlunos[][] = { { 1000, 1250.50f, 2500.35f, }, { 2600, 3500, 4500 }, { 50000, 150000, 2000000 } };

		byte matrizInrregular[][]= {
				{1,2,3,4,5,6},
				{98,5,22,2},
				{1,2,3,4,5,6,9,8,5,22,2}
		};
		
		String ementa[][]= {
			{"Metedologias ageis","introdução","git"},
			{"logicas","variaveis","constantes","desvios comportamentais"},
			{"POO","Classes","Herança","Encapsulamento","Polimorfia"}
		};
		
	}
}