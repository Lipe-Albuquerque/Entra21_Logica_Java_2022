package br.com.entra21.prova.signo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String name;
		String signo = "";
		byte dia, mes;
		System.out.println(
				"=============================================================================================");
		System.out.println("- BEM VINDO A AGENDA DE SIGNO DO TIO FILIPE -");
		System.out.println(
				"=============================================================================================");

		System.out.println("");
		System.out.println("Qual seu nome? ");
		name = input.nextLine();
		System.out.println("Que nome legal você tem " + name + " , Vamos prosseguir com o projeto.");

		System.out.println("Qual o seu mês de nascimento? obs: informe o seu mês em numeração.");
		System.out.println("");
		System.out.println("______________________________________________________");
		System.out.println("│1- Janeiro   │ 4- Abril │ 7- Julho    │ 10- Outubro │");
		System.out.println("│----------------------------------------------------│");
		System.out.println("│2- Fevereiro │ 5- Maio  │ 8- Agosto   │ 11- Novembro│");
		System.out.println("│----------------------------------------------------│");
		System.out.println("│3- Março     │ 6- Junho │ 9- Setembro │ 12- Dezembro│");
		System.out.println("│_____________│__________│_____________│_____________│");
		mes = input.nextByte();
		System.out.println("Muito bem agora eu tenho o seu mês que é " + mes
				+ ", porem ainda preciso do seu dia de informação poderia me passar ?");
		dia = input.nextByte();

		if (mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia <= 20 && dia <= 30) {
			signo = "Áries";
		}
		if (mes == 4 && dia >= 21 && dia <= 30 || mes == 5 && dia <= 20 && dia <= 31) {
			signo = "Touro";
		}
		if (mes == 5 && dia >= 21 && dia <= 31 || mes == 6 && dia <= 20 && dia <= 30) {
			signo = "Gêmeos";
		}
		if (mes == 6 && dia >= 21 && dia <= 30 || mes == 7 && dia <= 22 && dia <= 31) {
			signo = "Câncer";
		}
		if (mes == 7 && dia >= 23 && dia <= 31 || mes == 8 && dia <= 22 && dia <= 31 ) {
			signo = "Leão";
		}
		if (mes == 8 && dia >= 23 && dia <= 30 || mes == 9 && dia <= 22 && dia <= 30) {
			signo = "Virgem";
		}
		if (mes == 9 && dia >= 23 && dia <= 30 || mes == 10 && dia <= 22 && dia <= 31) {
			signo = "Libra";
		}
		if (mes == 10 && dia >= 23 && dia <= 31 || mes == 11 && dia <= 21 && dia <= 30) {
			signo = "Escorpião";
		}
		if (mes == 11 && dia >= 22  && dia <= 30|| mes == 12 && dia <= 21 && dia <= 31) {
			signo = "Sagitário";
		}
		if (mes == 12 && dia >= 22 && dia <= 31 || mes == 1 && dia <= 19 && dia <= 31) {
			signo = "Capricórnio";
		}
		if (mes == 1 && dia >= 20 && dia <= 31 || mes == 2 && dia <= 18 && dia <= 28) {
			signo = "Aquário";
		}
		if (mes == 2 && dia >= 19 && dia <= 28 || mes == 3 && dia <= 20 && dia <= 31) {
			signo = "Peixes";
		}

		System.out.println("Que incrivel, seu signo Sr.(a) " + name + " é: " + signo);
	}

}
