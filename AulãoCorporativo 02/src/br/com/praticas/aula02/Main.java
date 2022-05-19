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

		byte tipo[] = { 0, 1 };
		float temp;

		do {
			linha();
			System.out.println("Selecione o tipo de Temperatura que deseja converter: ");
			linha();
			System.out.println("1- Celsius para Fahrenheit.");
			System.out.println("	    ou		     	");
			System.out.println("2- Fahrenheit para Celsius.");
			linha();
			tipo[0] = input.nextByte();

			if (tipo[0] == 1) {
				System.out.println("Digite a temperatura em graus Celsius: ");
				temp = input.nextFloat();
				temp = (temp * 9 / 5) + 32;
				System.out.println("Sua temperatura é: " + temp + " Fahrenheit");
				linha();
				System.out.println("Dseja continuar ?");
				tipo[1] = input.nextByte();

			} else if (tipo[0] == 2) {
				System.out.println("Digite a temperatura em graus Fahrenheit: ");
				temp = input.nextFloat();
				temp = (temp - 32) * 5 / 9;
				System.out.println("Sua temperatura é: " + temp + " Celsius");
				linha();
				System.out.println("Dseja continuar ? \n 1- Sim \n 2- Não");
				tipo[1] = input.nextByte();
				while (tipo[1] != 1 || tipo[1] != 2) {
					System.out.println("Digite uma opção valida");
				}
			} else {
				System.out.println("digite uma opção valida ");
			}

		} while (tipo[1] != 2);

	}

}
