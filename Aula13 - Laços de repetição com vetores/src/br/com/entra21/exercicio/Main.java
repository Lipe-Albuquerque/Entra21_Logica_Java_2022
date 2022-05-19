package br.com.entra21.exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;
		do {
			escreverMenu();
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Obrigado por usar nosso programa");
				break;
			case 1:
				exibirTamanhoVetores();
				break;
			case 2:
				exibirTamanhoVetoresInicializado();
				break;
			case 3:
				vetorCom5ParaInicializar();
				break;
			case 4:
				definirTamanhoVetorParaInicializar();
				break;
			case 5:
				exibirVetorInteirosNaoInicializado();
				break;
			case 6:
				percorrerVetorInicializadoCrescenteDecrescente();
				break;
			}
		} while (option == 0);

	}

	private static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializado() {
		byte vetorBytes[] = { 5, 7, 9, 10 };
		short vetorShorts[] = { 250, 952, 94, 1260 };
		int vetorInts[] = { 312312, 9531212, 93314, 122310 };
		long vetorLongs[] = { 25131230, 9523123, 931314, 1263130 };
		float vetorFloats[] = { 25230f, 95123f, 9365314f, 12623130f };
		char vetorChars[] = { 'n', 'f', 'k' };
		boolean vetorBooleans[] = { true, false, true, true, false };
		System.out.println("vetorBytes tamanho = " + vetorBytes.length);
		System.out.println("vetorShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);
	}

	private static void vetorCom5ParaInicializar() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte vetorBytes[] = new byte[5];

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Inicializando a posição " + (count + 1) + " no indice " + count);
			vetorBytes[count] = input.nextByte();
		}
	}
	
	
	public static void definirTamanhoVetorParaInicializar() {

		Scanner entrada = new Scanner(System.in);

		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor");
		tamanho = entrada.nextByte();

		vetorBytes = new byte[tamanho];

		for (byte contador = 0; contador < vetorBytes.length; contador ++) {

		System.out.println("Informe o valor para o item " + (contador + 1 ) + " no índice [" + contador + "]");
		vetorBytes[contador] = entrada.nextByte();



		}


		}
	private static void percorrerVetorInicializadoCrescenteDecrescente() {
		byte vetorInt[] = { 12, 28, 37, 59, 6 };
		for (byte count = 0; count < vetorInt.length; count++) {
		System.out.println(vetorInt[count]);



		}
		System.out.println("----");
		for (byte count = (byte) (vetorInt.length - 1); count >= 0; count--) {
		// começando com o tamanho -1, pq o indice sempre tem um valor a menos
		// condição de permanencia, enquanto meu contado for maior que 0, comcei com
		// valor alto e pretendo para ao chegar no zero
		// como uma repetição decrescente utilizo o dcremento no contador
		System.out.println(vetorInt[count]);
		}
		}
	public static void exibirVetorInteirosNaoInicializado() {
		 
        byte vetorBytes[] = new byte[10];
        Scanner entrada = new Scanner(System.in);
        String resposta;
        byte index = 0;
 
        do {
            System.out.println("Informe um valor para o indice [" + index + "]");
            vetorBytes[index] = entrada.nextByte();
 
            System.out.println("Gostaria de inicializar outro indice?");
            resposta = entrada.next();
 
            if (resposta.equalsIgnoreCase("sim")) {
                do {
                    System.out.println("Informe um indice válido entre 0 e " + (vetorBytes.length - 1));
                    index = entrada.nextByte();// Se o usuario digitar um valor valido esse index sera usado no meu DO
                                                // principal, onde a logica se repete
 
                } while (index < 0 || index >= vetorBytes.length);// A posicao escolhida nao pode ser menor do que 0 nem
                                                                    // o tamanho do vetor ou superior
                // Exemplo: O range valido é de 0 a 9, qualquer numero alem disso fica preso
                // nesse loop
 
            }
 
        } while (resposta.equalsIgnoreCase("sim"));
 
        for (byte contador = 0; contador < vetorBytes.length; contador++) {
 
            System.out.println("vetorBytes[" + contador + "] = " + vetorBytes[contador]);
 
        }
 
    }
	
	public static String escreverMenu() {
        String menu = "Escolha uma opção do menu de Práticas\n";
        menu += "0 - Sair\n";
        menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
        menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
        menu += "3 - Criar um vetor de 5 posições, para que o usuário alimente esses valores\n";
        menu += "4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
        menu += "5 - Criar um vetor de inteiros inicializado , para percorrer: Do inicio ao fim, Do fim ao inicio, Para exibir os valores\n";
        menu += "6 - Criar um vetor de inteiros não inicializado\n";
        menu += "---------------------------------------------";
 
        return menu;
 
    }

}
