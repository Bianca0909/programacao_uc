package lista01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua primeira nota: ");
		double a1 = sc.nextDouble();

		System.out.println("Digite sua segunda nota: ");
		double a2 = sc.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double a3 = sc.nextDouble();
		double peso1 = 1;
		double peso2 = 2;
		double peso3 = 3;
		
		double media = ((a1*peso1) + (a2*peso2) + (a3*peso3))/(peso1 + peso2 + peso3);
		
		System.out.println("Média: " + media);

	}

}
