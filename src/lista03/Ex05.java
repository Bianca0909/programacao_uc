package lista03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
	List<Double> lista = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double numero = sc.nextDouble();
		
		System.out.println("Digite outro número: ");
		Double numero2 = sc.nextDouble();

		System.out.println("Digite outro número: ");
		Double numero3 = sc.nextDouble();
		
		lista.add(numero);
		lista.add(numero2);
		lista.add(numero3);
		
		Collections.sort(lista);
		System.out.println(lista);

	}

}
