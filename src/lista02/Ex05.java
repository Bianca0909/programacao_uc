package lista02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de mulheres: ");
		Integer numeroMulheres = sc.nextInt();

		System.out.println("Digite o número de homens: ");
		Integer numeroHomens = sc.nextInt();
		
		if (numeroHomens > numeroMulheres) {
			System.out.print("Homens");
		} if (numeroMulheres > numeroHomens) {
			System.out.println("Mulheres");
		} if (numeroHomens == numeroMulheres) {
			System.out.println("Número de homens é igual o de mulheres");
		}
		
	}

}
