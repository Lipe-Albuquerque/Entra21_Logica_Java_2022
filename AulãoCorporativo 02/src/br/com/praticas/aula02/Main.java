package br.com.praticas.aula02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;
		String name;
		System.out.println("Olá digite seu nome para começarmos: ");
		name = input.nextLine();
		linha();
		System.out.println("Muito prazer " + name + " Vamos prosseguir...");

		do {
			linha();
			System.out.println("\tEscolha uma opção do menu abaixo");
			System.out.println("\t0- Sair...");
			System.out.println("\t1- Converter temperaturas");
			System.out.println("\t1- ");
			System.out.println("\t1- ");
			System.out.println("\t1- ");
			System.out.println("\t1- ");
			System.out.println("\t1- ");
			linha();
			option = input.nextByte();

			switch (option) {

			case 1:
				converttemperature();
				break;

			}

		} while (option != 0);

	}

	private static void linha() {

		System.out.println("===========================================================");

	}

	private static void converttemperature() {
		Scanner input = new Scanner(System.in);

		byte tipo;
		float temp;
		linha();
		System.out.println("Selecione o tipo de Temperatura que deseja converter: ");
		linha();
		System.out.println("1- Celsius para Fahrenheit.");
		System.out.println("	    ou		     	");
		System.out.println("2- Fahrenheit para Celsius.");
		linha();
		tipo = input.nextByte();

		if (tipo == 1) {
			System.out.println("Digite a temperatura em graus Celsius: ");
			temp = input.nextFloat();
			temp = (temp * 9 / 5) + 32;
			System.out.println("Sua temperatura é: " + temp + " Fahrenheit");

		} else if (tipo == 2) {
			System.out.println("Digite a temperatura em graus Fahrenheit: ");
			temp = input.nextFloat();
			temp = (temp - 32) * 5 / 9;
			System.out.println("Sua temperatura é: " + temp + " Celsius");
		}

	}

}
