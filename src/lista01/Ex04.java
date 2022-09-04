package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();

		double celsius = ((fahrenheit - 32) * 5) / 9;
		
		DecimalFormat df = new DecimalFormat("#,###.00");
	
		System.out.println("Temperatura em Celsius: " + df.format(celsius));
	}

}
