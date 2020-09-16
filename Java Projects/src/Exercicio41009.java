import java.util.Scanner;

public class Exercicio41009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, sexo, temperamento;
		int individuos = 0, mulhernervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
		
		while (individuos < 3) {
			System.out.println("Idade do[a]  individuo[a]:");
			idade = sc.nextInt();
			System.out.println("Sexo: \n1 - Masculino \n2 - Feminino: ");
			sexo = sc.nextInt();
			System.out.println("Temperamento: n1 - Calmo[a] \n2 - Nervoso[a] \n - Agressivo[a] :");
			temperamento = sc.nextInt();
			if(temperamento == 1) {
				calma++;
				if (idade<18) {
					pessoaCalma++;
				}
			
		}
		
			else if (sexo ==1 && temperamento ==3) {
				homemAgressivo++;
			}
			else if (idade > 40 && temperamento ==2) {
				pessoaNervosa++;
				if (sexo==2) {
					mulhernervosa++;
					
					
				}
			}
		
				individuos++;
				
		}
				System.out.printf("\nNumero de pessoas calmas: %d", calma);
				System.out.printf("\nMulheres nervosas: %d", mulhernervosa);
				System.out.printf("\nHomens agressivos: %d", homemAgressivo);
				System.out.printf("\nPessoas nervosas com mais de 40 anos: %d", pessoaNervosa);
				System.out.printf("\nPessoas calmas menores de 18 anos: %d", pessoaCalma);

		sc.close();
		

	}

}
