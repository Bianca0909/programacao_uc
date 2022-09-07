package lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		Double n1;
		Double n2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite um número diferente: ");
		n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println( "O número " + n1 + " é maior que " + n2);
		} else {
			System.out.println("O número " + n2 + " é maior que " + n1);
		}

	}

}
