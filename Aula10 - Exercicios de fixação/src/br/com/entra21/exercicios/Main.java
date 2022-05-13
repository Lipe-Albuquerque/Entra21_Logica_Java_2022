package br.com.entra21.exercicios;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {

		String option;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"\nDigite qual programa deseja utilizar: \n 0- Sair \n 1- Calculadora a Soma \n 2- Repetir 20 vezes quebrando linha \n"
							+ " 3- Entre 20 pessoas exibir a soma das idades \n 4- Entre 20 pessoas quantos são maiores de idade \n"
							+ " 5- Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova \n"
							+ " 9- Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares");
			option = input.nextLine();

			switch (option.toLowerCase()) {
			case "0", "sair":
				break;
			case "1", "calculadora a soma", "calculadora":
				calculator();
				break;
			case "2", "repetir":
				repetidor20();
				break;
			case "3":
				sumAge();
				break;
			case "4":
				maiorDeIdade();
				break;
			case "5":
				exibirMaisNovo();
				break;
			case "9":
				mediaAlunos();
				break;
			default:
				System.out.println("Digite uma opção valida");
				break;
			}

		} while (option.equals("0") == false); // ou colocar ! antes do option = !option....
		System.out.println("Obripado por usar o programa Lista de Exercicios!");
	}

	private static void calculator() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);
		}

	}

	private static void repetidor20() {

		for (byte i = 1; i < 20; i++) {
			System.out.print("Eu gosto de algoritomos " + (i % 5 == 0 ? "\n" : ""));
//			if (i % 5 == 0) {
//				System.out.println("\n");
//			}
		}

	}

	private static void maiorDeIdade() {

		System.out.println("Exibir apenas os maiors de idade");
		byte maiores = 0;
		byte idade, i;
		for (i = 1; i <= 20; i++) {
			Scanner input = new Scanner(System.in);

			System.out.println("informe a idade da pessoa " + i);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior");
			}
		}
		System.out.println("Entre " + (i - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	}

	private static void sumAge() {
		Scanner input = new Scanner(System.in);
		int sumAge = 0;
		byte age;

		for (byte i = 0; i <= 20; i++) {
			System.out.println("No momento a soma está em: " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;

		}
		System.out.println("A soma total das idades foi " + sumAge);
	}

	// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "valor";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 5; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Após isso tudo o mais novo é: " + youngerName + " " + ageMinimal);

	}
	
	
	private static void mediaAlunos() {
        Scanner input = new Scanner(System.in);
        byte qtd, contador = 0;
        float nota, soma = 0f;
        System.out.println("Quantas notas vc quer capturar?");
        qtd = input.nextByte();
        String resposta;
 
        do {
            contador++;
            System.out.println("Informe uma nota");
            nota = input.nextFloat();
            if (contador >= qtd) {
                System.out.println("Quer capturar mais alguma nota?");
                resposta = input.next();
                if (resposta.equals("sim")) {
                    contador--;
                }
            }
 
            soma = soma + nota;
        } while (contador <= qtd);
        System.out.println("Soma =" + soma);
    }
	

}
