package lista01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome da mercadoria: ");
		String nome = sc.nextLine();

		System.out.println("Digite o preço da mercadoria: ");
		Double precoInicial = sc.nextDouble();

		System.out.println("Digite o preço de venda da mercadoria: ");
		Double precoVenda = sc.nextDouble();

		Double lucro = precoVenda - precoInicial;
		System.out.println("Mercadoria: " + nome + " |Lucro: R$" + lucro);
	}

}
