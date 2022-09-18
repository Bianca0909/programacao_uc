package lista03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		Double numero2 = sc.nextDouble();
		
		if (numero > numero2) {
			System.out.println(numero);
		} else {
			System.out.println(numero2);
		}
	}

}
