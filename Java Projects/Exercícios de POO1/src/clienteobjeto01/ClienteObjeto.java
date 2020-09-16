package clienteobjeto01;

import java.util.Scanner;

import metodocliente.metodocliente;

public class ClienteObjeto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		metodocliente cliente0 = new metodocliente();
		cliente0.nome = "xxxxx";
		cliente0.endereco = "Rua XX";

		System.out.println(cliente0.nome);		
		System.out.println(cliente0.endereco);		


		
		metodocliente cliente1 = new metodocliente();
		System.out.println("");
		cliente1.nome = "yyy";
		cliente1.endereco = "Rua yy";

		System.out.println(cliente1.nome);		
		System.out.println(cliente1.endereco);		

		

		
		
		
		
	}

	
}