import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

	public static void main(String[] args) {

		Random r = new Random();
		
		int sorteado = r.nextInt(10);
		
					
		boolean naoacertou = false;
		
		while(!naoacertou) {
		
				
			System.out.println("Sortetado: "+sorteado);
			
			Scanner scanner = new Scanner (System.in);
			
			System.out.println("Informe o seu numero: ");
			int escolha = scanner.nextInt();  
			
			if(escolha > sorteado) {
				System.out.println("MAIOR");
				naoacertou= false;
			} else if (escolha < sorteado){
				System.out.println("MENOR");
				naoacertou= false;
			} else {
				System.out.println("Acertou:"+sorteado);
				naoacertou= true;
			}
		
			scanner.close();

		}
	
	//Random rnd = new Random(); //Inicia Aleatório
	//int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
	//1. Faça um laço de repetição que solicite ao usuário digitar um número; 
	//2. O laço encerra quando o usuário acertar o número; 
	//3. Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.

	}
	
}
