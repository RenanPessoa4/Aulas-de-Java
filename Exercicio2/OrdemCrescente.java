import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int n1, n2, n3, aux;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = scan.nextInt();
		System.out.print("Digite o terceiro numero: ");
		n3 = scan.nextInt();
		
		if(n1 > n2) {
			aux = n1;
			n1 = n2;
			n2 = aux;
			
		}
		if (n1 > n3) {
		aux = n1;
		n1 = n3;
		n3 = aux;
		
		}
		
		if (n2>n3) {
			aux = n2;
			n2 = n3;
			n3 = aux;
			
		}
		System.out.printf ("Numero 1 : %d - numero 2 : %d - numero 3 : %d ", n1, n2, n3);
		
		
		scan.close();
	}
	

}
