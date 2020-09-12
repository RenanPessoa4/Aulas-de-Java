import java.util.Scanner;
import java.util.Random;
public class testematriz {

	public static void main(String[] args) {
		Random random = new Random();
		final int LINHA=3;
		final int COLUNA=3; //linha e colunas constantes
		int[][] matriz=new int[LINHA][COLUNA];
		int l,c, valorDigitado = 0, soma = 0, total = 0;
		Scanner kb= new Scanner(System.in);
		
		for(l=0; l<LINHA; l++)
		{
			System.out.println(" | ");
			for(c=0; c<COLUNA; c++)
			{
				valorDigitado = random.nextInt(9);
				matriz[l][c] = kb.nextInt();
				// escreva("Matriz [",l,"][",c,"] :", matriz[l][c])
			
				System.out.println(matriz[l][c]);
				System.out.println(" | ");
				//somatorio
				total = total + matriz[l][c];
								//calcula a diagonal
				if (l==c)
				{
					soma = soma + matriz[l][c];
				}
				
			}
			System.out.printf("\n");
		}
		System.out.printf("Soma da diagonal principal é : ", soma);

	}

}

