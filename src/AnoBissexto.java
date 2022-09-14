import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o ano: ");
		int ano = scanner.nextInt();  
		
		
		if ((ano % 4 == 0) && ano % 100 != 0)
		{
			 System.out.println(ano + " é Bissexto!");
	    }
	    else if ((ano % 4 == 0) && (ano % 100 == 0) && (ano % 400 == 0))
	    {
	       	System.out.println(ano + " é Bissexto!");
	    }
	    else
	    {
	       	System.out.println(ano + " não é Bissexto!");
	    }
						
		 scanner.close();
		
	}
	
	// Escrever se um ano informado pelo usuário é bissexto ou não. 
	// Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100).
	
}
