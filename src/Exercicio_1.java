import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner (System.in);
			
	System.out.println("Informe a sua velocidade: ");
	int minhaVelocidade = scanner.nextInt();  //80
			
	System.out.println("Informe a velocidade máxima para a via: ");
	int velocidadeVia = scanner.nextInt();
		
	int resultado = minhaVelocidade - velocidadeVia ;
	boolean testeLogico = resultado > 0;

	//Operadores
	// == Igual
	// != Diferente 
			
	if (testeLogico) {
		
		if (resultado <= 10) {		
			System.out.println("Excedido em: " + resultado + ".  Você foi multado em R$ 10.00!");
		} else if(resultado >= 11 && resultado <=30) {
			System.out.println("Excedido em: " + resultado + ".  Você foi multado em R$ 100.00!");
		} else {
			System.out.println("Excedido em: " + resultado + ".  Você foi multado em R$ 300.00!");
		}
		
	} else {	
		System.out.println("Velocidade de " + minhaVelocidade + " está OK!" );	
	}
	
	scanner.close();
	
	}
			

}





//Crie um programa java que leia a velocidade de um carro e a velocidade máxima para a via:
//1. Informe 50 reais se estiver até 10km/h acima;
//2. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
//3. Informe 300 reais se estiver acima de 31km/h acima.