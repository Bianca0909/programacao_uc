package lista03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();
		
		if (numero % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}
