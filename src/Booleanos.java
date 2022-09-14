
public class Booleanos {

	//main + barra espaço
	public static void main(String[] args) {
		
		int numero = 10;
		
		boolean teste1 = numero > 5;
		boolean teste2 = numero < 5;
		boolean teste3 = numero >= 10;
		boolean teste4 = numero <= 5;
		boolean teste5 = numero == 5;
		boolean teste6 = numero != 10;
		
		boolean teste7 = numero > 1 && numero < 11;
		boolean teste8 = numero > 1 || numero < 11;
		
		//boolean teste9 = numero > 1 || numero > 11;
		boolean teste9 = numero > 1 || numero > 11;		
		
		
		System.out.println("Teste 1: " + teste1 );
		System.out.println("Teste 2: " + teste2 );
		System.out.println("Teste 3: " + teste3 );
		System.out.println("Teste 4: " + teste4 );
		System.out.println("Teste 5: " + teste5 );
		System.out.println("Teste 6: " + teste6 );
		System.out.println("Teste 7: " + teste7 );
		System.out.println("Teste 8: " + teste8 );
		System.out.println("Teste 9: " + teste9 );
		
	}
	
}
