package lista01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor em horas: ");
		double horas = sc.nextDouble();

		System.out.println("Digite o valor em minutos: ");
		double min = sc.nextDouble();

		System.out.println("Digite o valor em segundos: ");
		double seg = sc.nextDouble();

		double resultado = (horas * 3600) + (min * 60) + seg;
		
		System.out.println("Quantidade de segundo: " + resultado + "s");

	}
}
