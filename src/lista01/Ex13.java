package lista01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();

		System.out.println("Digite o salário bruto do funcionário: ");
		Double salarioBruto = sc.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		Double percentualAcrescimo = sc.nextDouble();

		Double salarioLiquido = salarioBruto + (salarioBruto * (percentualAcrescimo / 100));

		System.out.println("Nome: " + nome + " |Salário bruto: " + salarioBruto + " |Salário líquido: " + salarioLiquido);

	}

}
