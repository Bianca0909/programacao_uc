package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o saldo médio anual: ");
		Double saldoCliente = sc.nextDouble();

		Double percentualCredito = 0.00;
		if (saldoCliente <= 1000) {
			percentualCredito = 0.00;
		} else if (saldoCliente <= 2000) {
			percentualCredito = 20.0;
		} else if (saldoCliente <= 3000) {
			percentualCredito = 30.0;
		} else if (saldoCliente > 3000) {
			percentualCredito = 40.0;
		}

		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);

		System.out.println("Valor de crédito: " + currency.format(percentualCredito));

	}

}
