package lista01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de anos fumando: ");
		Integer anos = sc.nextInt();

		System.out.println("Digite o número de cigarros fumados por dia: ");
		Integer quantidade = sc.nextInt();

		System.out.println("Digite o preço de uma carteira de cigarro: ");
		Double preco = sc.nextDouble();

		Integer cigarrosFumados = quantidade * (anos * 365);

		Integer cartelas = cigarrosFumados / 20;
		Double resultado = cartelas * preco;
		
		System.out.println("Dinheiro gasto em " + anos + ": R$ " + resultado);
	}

}
