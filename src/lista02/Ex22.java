package lista02;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do time");
		String time1 = sc.next();

		System.out.println("Digite o nome do outro time");
		String time2 = sc.next();

		System.out.println("Informe a pontuação do time " + time1);
		Double pontuacao1 = sc.nextDouble();

		System.out.println("Informe a pontuação do time " + time2);
		Double pontuacao2 = sc.nextDouble();

		if (pontuacao1 > pontuacao2) {
			System.out.println("Time vencedor: " + time1);
		}
		if (pontuacao2 > pontuacao1) {
			System.out.println("Time vencedor: " + time2);
		}
		 if (pontuacao1.equals(pontuacao2)) {
			System.out.println("Informe o resultado do pênalti: ");
			String resultadoPenalti = sc.next();

			 if (resultadoPenalti.equals(time1)) {
				System.out.println("Time vencedor: " + time1);
			} else if (resultadoPenalti.equals(time2)) {
				System.out.println("Time vencedor: " + time2);
			}
		}
	}

}
