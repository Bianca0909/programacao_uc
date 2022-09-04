package lista01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base: ");
		double base = sc.nextDouble();

		System.out.println("Digite a base: ");
		double altura = sc.nextDouble();

		double area = (base * altura)/2;
		
		System.out.println("Àrea do triângulo: " + area);
	}

}
