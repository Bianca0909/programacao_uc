package lista01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();

		System.out.println("Digite a quantidade de horas trabalhadas do funcionário: ");
		Integer horas = sc.nextInt();
		
		System.out.println("Digite o valor pago por horas trabalhadas do funcionário: ");
		Double valorHora = sc.nextDouble();
		
		System.out.println("Digite o percentual de desconto: ");
		Double percentualAcrescimo = sc.nextDouble();
		
		Double salarioBruto = valorHora * horas;
		Double valorDescontado = salarioBruto * (percentualAcrescimo / 100);
		Double salarioLiquido = salarioBruto - valorDescontado;
		
		System.out.println("Nome: " + nome + " |Salário bruto: " + salarioBruto + " |Salário líquido: " + salarioLiquido + " |Valor do desconto: " +  valorDescontado);
	}

}
