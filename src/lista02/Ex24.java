package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Long codigo;
		Integer quantidade;
		Double valorAPagar = 0.00;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Informe o código");
			codigo = sc.nextLong();
			System.out.println("Informe a quantidade");
			 quantidade = sc.nextInt();

		if (codigo == 100) {
			valorAPagar = 1.2 * quantidade;
		} else if (codigo == 101) {
			valorAPagar = 1.3 * quantidade;
		} else if (codigo == 102) {
			valorAPagar = 1.5 * quantidade;
		} else if (codigo == 103) {
			valorAPagar = 1.2 * quantidade;
		} else if (codigo == 104) {
			valorAPagar = 1.3 * quantidade;
		} else if (codigo == 105) {
			valorAPagar = 1.0 * quantidade;
		}

		
		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);

		System.out.println(currency.format(valorAPagar));

	}

}
