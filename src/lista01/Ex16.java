package lista01;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o total de vendas: ");
		Double totalVendas = sc.nextDouble();
		
		System.out.println("Digite a porcentagem de comissão: ");
		Double comissao = sc.nextDouble();
		
		Double valorRecebido = totalVendas + (totalVendas * comissao/100);
		
		System.out.println("Funcionário: " + nome + "Valor a receber: R$ " + valorRecebido);

	}

}
