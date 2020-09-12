import java.util.Scanner;
public class exercicio1109 {

	public static void main(String[] args) {
		int[] vetor= new int [6];
		int contpar=0, somapar=0, contimpar=0, somaimpar=0, i=0;
		
		
	Scanner kb = new Scanner(System.in);
	
	
	for (i=0; i<vetor.length; i++) {
		System.out.printf("Digite a posição %d do vetor de 6 posições: ", i);
		vetor[i]=kb.nextInt();		
	}
	
	System.out.printf("\n");
	
	for (i=0; i<vetor.length; i++) {
		
		if vetor[i]%2 == 0 && vetor[i]!=0 
				{
			
			contpar++;
			somapar+=vetor[i];
			System.out.printf("O numero %d é par. \n", vetor[i]);
		}
		else if(vetor[i]<=0)
		{
			System.out.println("Valor Inválido.");
		}
	
		else {
			contimpar++;
			somaimpar+=vetor[i];
			System.out.printf("O numero %d é impar. \n", vetor[i]);
			
		}
	}
	
	System.out.printf("\nA soma dos %d números pares digitados é de: %d. \nA soma dos %d numeros impares digitados é de: %d.",contpar, somapar, contimpar, somaimpar);
	
	
	kb.close();
	}

}
