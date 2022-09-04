package lista01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu sexo: ");
		String sexo = sc.nextLine();
		
		System.out.println("Digite seu telefone: ");
		String telefone = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu peso (em kg): ");
		double peso = sc.nextDouble();
		
		System.out.println("Nome: " + nome + " |Sexo: " + sexo + " |Telefone: " + telefone + " |Idade: " + idade + " |Peso: " + peso + "kg");
	}

}
