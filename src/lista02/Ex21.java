package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.next();

		System.out.println("Digite o sexo desejado: ");
		String sexo = sc.next();

		System.out.println("Digite a idade desejada: ");
		Integer idade = sc.nextInt();

		Double valorCobrado = 0.0;
		if (sexo.equalsIgnoreCase("M") && idade >= 18 && idade <= 21) {
			valorCobrado = 300.0;
		} else if (sexo.equalsIgnoreCase("M") && idade >= 22 && idade <= 25) {
			valorCobrado = 700.0;
		} else if (sexo.equalsIgnoreCase("M") && idade >= 26 && idade <= 30
				|| sexo.equalsIgnoreCase("F") && idade >= 26 && idade <= 30) {
			valorCobrado = 1000.0;
		} else if (sexo.equalsIgnoreCase("M") && idade >= 31 && idade <= 40
				|| sexo.equalsIgnoreCase("F") && idade >= 18 && idade <= 21) {
			valorCobrado = 3500.0;
		} else if (sexo.equalsIgnoreCase("M") && idade > 41) {
			valorCobrado = 500.0;
		} else if (sexo.equalsIgnoreCase("F") && idade >= 22 && idade <= 25) {
			valorCobrado = 2500.0;
		} else if (sexo.equalsIgnoreCase("F") && idade >= 31 && idade <= 40) {
			valorCobrado = 100.0;
		} else if (sexo.equalsIgnoreCase("F") && idade > 41) {
			valorCobrado = 50.0;
		}

		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);

		System.out.println("Valor total: " + currency.format(valorCobrado));
	}

}
