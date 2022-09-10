package lista02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// Dado um número inteiro positivo, mostre uma mensagem no vídeo informando se ele é par ou ímpar.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();
		
		if(numero > 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativos");
		}
	}

}
