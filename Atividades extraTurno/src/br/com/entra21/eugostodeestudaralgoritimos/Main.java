package br.com.entra21.eugostodeestudaralgoritimos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String opcao = "";
		System.out.println(
				"Escolha uma opção de programa: \n 1- Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar Algoritmos\n 2-");
		opcao = input.next();

		switch (opcao) {
		case "1":
			loop();
			break;

		default:
			break;
		}

	}

	public static void loop() {

		final String PHRASE = "Eu gosto de estudar algoritmo";
		byte i = 1;

		while (i <= 20) {
			System.out.println(PHRASE + "" + i);
			i++;

		}
		System.out.println("Deseja ");
	}

}
