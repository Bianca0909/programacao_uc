package lista01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor: ");
		String nome = sc.nextLine();

		System.out.println("Digite o produto: ");
		String produto = sc.nextLine();

		System.out.println("Digite as unidades: ");
		Integer quantidade = sc.nextInt();
		
		System.out.println("Digite o preço: ");
		Double preco = sc.nextDouble();
		
		Double resultado = quantidade * preco;

		System.out.println("Vendedor: " + nome + " |Produto: " + produto + " |Total vendido: R$ " + resultado);
	}

}
