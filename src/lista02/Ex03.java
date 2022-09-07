package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário do funcionário");
		Double salario = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("#,###.00");
		if (salario < 5000) {
			salario = salario + (salario * 30/100);
			System.out.println("Por se tratar de um salário menor que R$ 5.000, o salário do funcionário será aumentado para R$ " +df.format(salario));
		} else {
			System.out.println("Salário maior ou igual a R$ 5.000");
		}

	}

}
