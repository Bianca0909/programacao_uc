package lista03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();
		
		if (numero == 0) {
			System.out.println("ZERO");
		} if (numero > 0) {
			System.out.println("1");
		} if (numero < 0) {
			System.out.println("-1");
		}

	}

}
