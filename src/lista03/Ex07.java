package lista03;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<>();
		Double nota = 0.0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite sua nota");
			nota = sc.nextDouble();
			notas.add(nota);
		}

		DoubleSummaryStatistics summary = notas.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
		double menor = summary.getMin();
		notas.remove(menor);
		
		System.out.println(notas);

	}

}
