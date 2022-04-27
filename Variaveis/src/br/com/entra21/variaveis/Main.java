package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Scanner input;
		input = new Scanner(System.in);
		String name;
		byte myYears;
		float myHeight, wage;

//		System.out.println("=========================================================================================================");
//		
//		System.out.println("Bem vindo ao nosso programa de inteligência artificial, porfavor Digite enter para iniciar as perguntas.");
//		
//		System.out.println("=========================================================================================================");
//		
//		input.nextLine();
//		System.out.println("=========================================================================================================");
//
//		System.out.println("Digite seu nome: ");
//		
//		name = input.next();
//		System.out.println("=========================================================================================================");
//
//		System.out.println("Digite seu salario: ");
//		
//		wage = input.nextFloat();
//				
//		System.out.println("=========================================================================================================");
//
//		System.out.println("Digite sua altura: ");
//		
//		myHeight = input.nextFloat();
//		
//		System.out.println("=========================================================================================================");
//
//		System.out.println("Entao pelas pesquisas com dados que voce me informou seu nome eh: " + name + ", Seu salario eh: $" + wage + " e por fim sua altura eh " + myHeight + "cm, fiz um otimo trabalho nao acha humano ? rsrs");
//				

		name = JOptionPane.showInputDialog("informe seu nome completo");

		JOptionPane.showMessageDialog(null, "Legal agora eu sei seu nome ovo te hackiar " + name);

		myYears = Byte.parseByte(JOptionPane.showInputDialog(null, "Informe sua idade: "));

		wage = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salario: "));
		
		JOptionPane.showMessageDialog(null,""+ wage +"/"+ myYears);

	}

}
