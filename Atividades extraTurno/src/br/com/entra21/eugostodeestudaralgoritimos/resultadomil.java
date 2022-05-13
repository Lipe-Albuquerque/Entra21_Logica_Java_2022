package br.com.entra21.eugostodeestudaralgoritimos;

import java.util.Scanner;

public class resultadomil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		int resultado;
		System.out.println("Digite um numero: ");
		n1 = input.nextInt();
		
		System.out.println("Digite outro numero: ");
		n2 = input.nextInt();
		
		resultado = calculo(n1,n2);
		
		while(resultado <= 1000) {
			resultado= resultado * n2;
			System.out.println(resultado++);
			
		}
		
		
	}
	
	public static int calculo(int n1,int n2) {
		
		int resultado = n1 * n2;
		
		
		return resultado;
		
		
		
	}

}
