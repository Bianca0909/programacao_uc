package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salário do vendedor: ");
		Double salario = sc.nextDouble();
		
		System.out.println("Informe o total de vendas: ");
		Double totalVendas = sc.nextDouble();
		
		Double valorAReceber;
	
		if (totalVendas > 200000) {
			valorAReceber = salario * (salario * 20/100); 
		} else {
			valorAReceber = salario * (salario * 10/100);
		}
       
		Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);
		System.out.println("Salário a receber: " + currency.format(valorAReceber));
	}

}
