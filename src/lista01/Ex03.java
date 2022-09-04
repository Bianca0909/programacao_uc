package lista01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		final double pi = 3.1415;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		double r = sc.nextDouble();
		
		double area = pi * (r*r);
		
		System.out.println(area);

	}

}
