package br.com.entra21.operadores.logico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("operadores logicos");
		
		System.out.println("e  -  and -  &&  = operações restritivas");
		
		byte idade=19;
		float altura=1.8f;
		boolean resultado;
		
		resultado = idade <18;
		
		resultado = (idade<18)  && (altura>=2.0f);
		
		
		idade=15;
		altura=1.9f;
		resultado = (idade<18)  &&  (altura>=2.0f);
		
		
		
		
		
		
	}

}
