package lista02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		Double numero1 = sc.nextDouble();

		System.out.println("Digite outro número: ");
		Double numero2 = sc.nextDouble();

		Double soma = numero1 + numero2;
		Double subtracao = 0.0;
		if (numero1 > numero2) {
			subtracao = numero1 - numero2;
		}
		if (numero2 > numero1) {
			subtracao = numero2 - numero1;
		}
		Double multiplicacao = numero1 * numero2;
		Double divisao = numero1 / numero2;

		System.out.println("Soma: " + soma + " |Subtração: " + subtracao + " |Multiplicação: " + multiplicacao
				+ " |Divisão: " + divisao);
	}

}
