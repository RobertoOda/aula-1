import java.util.Scanner;

public class Se {
	
	public static void main(String[] args) {
		
		byte  a = 127;
		short b = 10;
		short result = (short) (a + b);
		
		System.out.println("Resultado: " + result );
		
		
		
		
		Scanner scanner = new Scanner (System.in);
				
		System.out.println("Informe seu nome: ");
		String nome = scanner.nextLine();
				
		System.out.println("Informe o ano que vc nasceu: ");
		int anonasc = scanner.nextInt();
				
		System.out.println("Nome: " + nome + "  Idade: " + anonasc);
				
		int resultado = 2022 - anonasc;
		boolean testeLogico = resultado >= 18;
		
		
		//Operadores
		// == Igual
		// != Diferente 
				
		if (testeLogico) {
			System.out.println("Nome: " + nome + "  Idade: " + resultado + "   Vc pode dirigir");
		} else if(resultado > 16) {
			System.out.println("Nome: " + nome + "  Idade: " + resultado + "   Vc pode Votar");

		} else {
			System.out.println("Nome: " + nome + "  Idade: " + resultado + "   Vc Não pode dirigir");
		}
		
		scanner.close();
		
	}

}
