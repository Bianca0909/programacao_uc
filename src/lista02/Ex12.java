package lista02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.next();

		System.out.println("Digite a idade: ");
		Integer idade = sc.nextInt();
		
		System.out.println("Nome: " + nome + " |Idade: " + idade);
		
		if (idade <= 12) {
			System.out.println("Criança");
		} else if (idade > 12 && idade < 20) {
			System.out.println("Adolescente");
		} else {
			System.out.println("Adulto");
		}

	}

}
