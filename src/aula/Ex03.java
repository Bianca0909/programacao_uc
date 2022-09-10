package aula;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		Fazer um programa para ler o nome do aluno, 4 notas, faltas, imprimir o nome, imprimir as notas e a média, imprimir as faltas.
//		obs: Média >=7 e faltas <=5
//		O sistema só deve parar quando a nota1 for igual -3

		Scanner sc = new Scanner(System.in);

		double nota1;
		do {

			System.out.println("Digite o nome do aluno: ");
			String nome = sc.next();

			System.out.println("Digite a nota 1: ");
			nota1 = sc.nextDouble();

			if (nota1 == -3) {
				System.exit(0);
			}

			System.out.println("Digite a nota 2: ");
			double nota2 = sc.nextDouble();

			System.out.println("Digite a nota 3: ");
			double nota3 = sc.nextDouble();

			System.out.println("Digite a nota 4: ");
			double nota4 = sc.nextDouble();

			System.out.println("Digite as faltas do aluno: ");
			Integer faltas = sc.nextInt();

			double media = (nota1 + nota2 + nota3 + nota4) / 4;

			if (media >= 7 && faltas <= 5) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		} while (nota1 != -3);
	}

}
