package br.com.entra21.aulao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// VALIDAR QUANTIDADE DE DIAS QUE ESTA CORRETA
		// VALIDAR O PERIODO E RETORNAR UM SIGNO

		startSystem();

	}

	private static void startSystem() {

		Scanner input = new Scanner(System.in);
		byte dayBirthday;
		String monthBirthday, nameUserFirst, nameUserFinal;

		System.out.println("Hello, what your fist name? ");
		nameUserFirst = input.nextLine();
		String fL = nameUserFirst.substring(0, 1).toUpperCase(); // Fazer a primeira letra ficar maiuscula
		nameUserFirst = fL + nameUserFirst.substring(1).toLowerCase(); // concatenando a primeira letra com as demais

		System.out.println("Hello, what your fist name? ");
		nameUserFinal = input.nextLine();
		String fL1 = nameUserFinal.substring(0, 1).toUpperCase(); // Fazer a primeira letra ficar maiuscula
		nameUserFinal = fL1 + nameUserFinal.substring(1).toLowerCase(); // concatenando a primeira letra com as demais
		System.out.println(nameUserFirst + "" + nameUserFinal + ", Qual seu dia de aniversario ?");
		dayBirthday = input.nextByte();

		System.out.println(nameUserFirst + " " + nameUserFinal + ", Qual seu mes de aniversario ?");
		System.out.println("");
		System.out.println(
				"1- Janeiro\n2-Fevereiro\n3-Março\n4-Abril\n5-Maio\n6-Junho\n7-Julho\n8-Agosto\n9-Setembro\n10-Outubro\n11-Novembro\n12-Dezembro");
		monthBirthday = input.next();

		switch (monthBirthday.toLowerCase()) {
		case "1", "janeiro":
			validetionThirtyOne(dayBirthday);
			break;
		case "2", "fevereiro":

			break;
		case "3", "marco":
			validetionThirtyOne(dayBirthday);
			break;
		case "4", "abril":

			break;
		case "5", "maio":
			validetionThirtyOne(dayBirthday);
			break;
		case "6", "junho":

			break;
		case "7", "julho":
			validetionThirtyOne(dayBirthday);
			break;
		case "8", "agosto":
			validetionThirtyOne(dayBirthday);
			break;
		case "9", "setembro":

			break;
		case "10", "outubro":
			validetionThirtyOne(dayBirthday);
			break;
		case "11", "novembro":

			break;
		case "12", "dezembro":
			validetionThirtyOne(dayBirthday);
			break;

		default:
			break;
		}

	}

	public static void validetionThirtyOne(byte dayBirthday) {
		final byte DAYLIMIT=31;
		if (dayBirthday > DAYLIMIT) {
			System.out.println("please enter a valid value for the day");
			startSystem();
		}else {
			startSystem();
		}
	}

	public static void validetionThirty(byte dayBirthday) {
		final byte DAYLIMIT=30;
		if (dayBirthday > DAYLIMIT) {
			System.out.println("please enter a valid value for the day");
			startSystem();
		}else {
			startSystem();
		}
	}

	public static void validetionTwentyNine(byte dayBirthday) {
		final byte DAYLIMIT=29;
		if (dayBirthday > DAYLIMIT) {
			System.out.println("please enter a valid value for the day");
			startSystem();
		}else {
			startSystem();
		}
	}

}
