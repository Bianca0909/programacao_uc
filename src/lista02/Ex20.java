package lista02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Double> valores = new ArrayList<>();
		
		for(int i = 0; i <3; i++) {
			System.out.println("Digite um valor: ");
			Double valor = sc.nextDouble();
	
			valores.add(valor);
		}

		Collections.sort(valores, Collections.reverseOrder());
		System.out.println(valores);
	}

}
