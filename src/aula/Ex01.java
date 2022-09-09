package aula;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		// 1. Escreva um programa que, com base em uma temperatura em graus celsius, 
//		a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
//		seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

		Scanner sc = new Scanner(System.in);
       System.out.println("Digite a temperatura em graus celsius");
       Double celsius = sc.nextDouble();
       
       Double f = (celsius * 1.8) + 32;
       Double k = celsius + 273.5;
       Double re = celsius * 0.8;
       Double ra = (celsius * 1.8) + 32 + 459.67;
       
       
       DecimalFormat df = new DecimalFormat("#,###.00");
       
       System.out.println("Celsius: " + df.format(celsius) + " |Fahrenheit: " + df.format(f) + " |Kelvin: " + df.format(k) + " |Réaumur: " + df.format(re) + " | Rankine: " + df.format(ra));
       
	}

}
