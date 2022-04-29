package br.com.entra21.operadoresRelacionais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operadores relacionais: ");
		
		System.out.println("Menor   <    ");
		System.out.println("Maior   >    ");
		byte idadeA = 25, idadeB= 122;
		
		boolean result= idadeA < idadeB;
		
		System.out.println("idadeA é menos que idadeB ? "+result);
		
		System.out.println("idadeA é menos que idadeB ? " + (idadeA < idadeB ));
		
		
		
		result = idadeA <= idadeB;
		
		System.out.println("idade a é menor ou igual a b"+result);
		
		System.out.println("MAior > )");
		
		
	}

}
