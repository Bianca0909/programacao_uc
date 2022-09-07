package lista01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Double custoConsumidor;
		Double custoFabrica;
		Double percentagemDistribuidor;
		Double percentagemImpostos;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = sc.nextDouble();
		
		percentagemDistribuidor = 0.28;
		percentagemImpostos = 0.45;
		
		custoConsumidor = custoFabrica + (custoFabrica * percentagemDistribuidor) + (custoFabrica * percentagemImpostos);
		
		System.out.println("Custo do consumidor: R$ " + custoConsumidor);
		

	}

}
