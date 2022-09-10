package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salário: ");
		Double salario = sc.nextDouble();
		
		System.out.println("Informe o número de dependentes: ");
		Integer numeroDependentes = sc.nextInt();
		
		Integer abono;
		
		if (numeroDependentes > 2) {
			abono = (100 * numeroDependentes);
		} else {
			abono = 150;
		}
		
		Double valorAReceber = abono + salario;
		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);
		
		System.out.println("Valor a receber: " + currency.format(valorAReceber));
	}

}
