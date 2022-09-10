package lista02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("ìmpar");
		}
	}

}
