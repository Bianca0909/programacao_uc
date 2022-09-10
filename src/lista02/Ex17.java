package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de dias: ");
		Integer dias = sc.nextInt();

		Double diaria = 100.0;
		Double taxaServico = 0.0;

		if (dias > 15) {
			taxaServico = 5.0;
		} else if (dias >= 10 && dias >= 14) {
			taxaServico = 6.0;
		} else if (dias < 10) {
			taxaServico = 8.0;
		}

		Double total = diaria * dias + taxaServico;

		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);

		System.out.println("Total a pagar: " + currency.format(total));

	}

}
