package lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double[] medias = new Double[2];

		for (int i = 0; i < medias.length; i++) {
			
			System.out.println("Digite seu nome: ");
			String nome = sc.next();

			System.out.println("Digite a nota 1: ");
			Double nota1 = sc.nextDouble();

			System.out.println("Digite a nota 2: ");
			Double nota2 = sc.nextDouble();

			System.out.println("Digite a nota 3: ");
			Double nota3 = sc.nextDouble();

			Double media = (nota1 + nota2 + nota3) / 3;
			
			medias[i] = media;
			
		}
		if (medias[0] > medias[1]) {
			System.out.println("Maior média: " + medias[0]);
		} else {
			System.out.println("Maior média: " + medias[1]);
		} 

	}

}
