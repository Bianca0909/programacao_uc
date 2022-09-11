package lista02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da conta: ");
		Long numeroConta = sc.nextLong();
		
		System.out.println("Informe o saldo atual: ");
		Double saldo = sc.nextDouble();
		
		System.out.println("Informe o tipo de operação (D para depósito e R para retirada: ");
		String tipoOperacao = sc.next();

		System.out.println("Informe o valor da operação: ");
		Double valorOperacao = sc.nextDouble();
		
		if (valorOperacao > 0 && tipoOperacao.equalsIgnoreCase("D")) {
			saldo = saldo + valorOperacao;
		} else if (valorOperacao > 0 && tipoOperacao.equalsIgnoreCase("R") && saldo >= valorOperacao) {
			saldo = saldo - valorOperacao;
		} else if (valorOperacao > 0 && tipoOperacao.equalsIgnoreCase("R") && saldo < valorOperacao) {
			System.out.println("Conta estourada");
		} else if (valorOperacao < 0 ) {
			System.out.println("Valor negativo");
		}
		
	}

}
