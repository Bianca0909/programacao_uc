package lista01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a distância total percorrida em km: ");
		double distancia = sc.nextDouble();

		System.out.println("Digite a quantidade de litros: ");
		double litros = sc.nextDouble();

		double media = distancia / litros;
		
		System.out.println("Consumo médio do automóvel é: " + media + " km/l");
	}

}
