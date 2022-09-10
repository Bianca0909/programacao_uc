package lista02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do produto: ");
		String nome = sc.next();

		System.out.println("Digite o preço do produto: ");
		Double precoProduto = sc.nextDouble();

		System.out.println("Digite a categoria do produto: ");
		String categoria = sc.next();

		Double precoComDesconto = 0.0;

		if (categoria.equalsIgnoreCase("A") && precoProduto >= 100) {
			precoComDesconto = precoProduto - (precoProduto * 0.05);
		} else if (categoria.equalsIgnoreCase("A") && precoProduto <= 100) {
			precoComDesconto = precoProduto - (precoProduto * 0.08);

		} else if (categoria.equalsIgnoreCase("B") && precoProduto >= 50) {
			precoComDesconto = precoProduto - (precoProduto * 0.10);
		} else if (categoria.equalsIgnoreCase("B") && precoProduto <= 50) {
			precoComDesconto = precoProduto - (precoProduto * 0.12);
		}

		System.out.println("Produto: " + nome + " |Total a pagar: " + precoComDesconto);
	}

}
