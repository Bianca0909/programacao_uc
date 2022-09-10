package lista02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer[] inteiros = new Integer[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número inteiro: ");
			Integer numeros = sc.nextInt();
			inteiros[i] = numeros;

		}
		if (inteiros[0] < inteiros[1] || inteiros[0] < inteiros[2] || inteiros[0] == inteiros[1]) {
			System.out.println("Menor número: " + inteiros[0]);
		}
		else if (inteiros[1] < inteiros[0] || inteiros[1] < inteiros[2] || inteiros[1] == inteiros[2]) {
			System.out.println("Menor número: " + inteiros[1]);
		}
		else if (inteiros[1] > inteiros[2] || inteiros[0] > inteiros[2]) {
			System.out.println("Menor número: " + inteiros[2]);
		}

	}

}
