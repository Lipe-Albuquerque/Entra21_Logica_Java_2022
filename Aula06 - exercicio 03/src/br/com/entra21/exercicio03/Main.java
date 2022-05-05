package br.com.entra21.exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"Escreva um menu de opções e trate a situação onde o usuário não escolha uma opção informada na lista ");

		String choose;
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma opção");
		System.out.println("Brasil\nEUA\nChina");
		choose = input.next();
		choose = choose.toLowerCase();

		switch (choose) {
		case "brasil":
			System.out.println("Brasileiro");
			break;
		case "eua":
			System.out.println("gringo safado");
		case "china":
			System.out.println("chinguilingue");
		default:
			System.out.println("you dont saber digitar uma opção dada ?");
			break;
		}

	}

}
