package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do funcionário: ");
		String nome = sc.next();

		System.out.println("Informe o valor pago por hora: ");
		Double valorHora = sc.nextDouble();

		System.out.println("Informe o número de horas trabalhadas: ");
		Double horas = sc.nextDouble();

		System.out.println("Informe o tempo de serviço: ");
		Double anos = sc.nextDouble();

		Double salario = valorHora * horas;
		Double salarioLiquido = 0.0;
		if (anos < 5) {
			salarioLiquido = salario + (salario* 0.05);
		} else if (anos >= 5 && anos <= 10) {
			salarioLiquido = salario + (salario * 0.10);
		} else if (anos > 10) {
			salarioLiquido = salario + (salario * 0.15);
		}
		
		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);
		
		System.out.println("Nome: " + nome + " |Salário bruto: " + currency.format(salario) + " |Tempo de serviço: " + anos + " |Salário líquido: " + currency.format(salarioLiquido));
	}

}
