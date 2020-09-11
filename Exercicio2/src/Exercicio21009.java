import java.util.Scanner;

public class Exercicio21009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int impares=0;
		int numero;
		int pares=0;
			
		for(int i=0; i<10; i++) {
				System.out.printf("Digite o %d° número: ", i+1);
				numero = sc.nextInt();
				if(numero % 2== 0) {
					pares++;
				} else {
					impares++;
				}
			
				
		}
		
		
	
		sc.close();
		
		System.out.printf("\nOs Numeros pares são: %d ", pares);
		System.out.printf("\nOs numeros impares são: %d ", impares);
		
		
		
		
		
	}

}
