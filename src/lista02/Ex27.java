package lista02;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a nota da avaliação 01: ");
		Double notaAv01 = sc.nextDouble();

		
		System.out.println("Informe a nota da avaliação 01: ");
		Double notaAv02 = sc.nextDouble();

		System.out.println("Informe a nota da avaliação 01: ");
		Double notaAv03 = sc.nextDouble();
		
		Double mediaSimles = (notaAv01 + notaAv02 + notaAv03)/3;
		
		Double media = (notaAv01 + notaAv02*2 + notaAv03*3 + mediaSimles)/7;
		
		String conceito = "";
		if (media > 9 && media <=10) {
			conceito = "A";
		} if (media >= 7.5 && media <=9) {
			conceito = "B";
		} if (media >= 6 && media < 7.5) {
			conceito = "C";
		} if (media > 4 && media <6) {
			conceito = "D";
		}if (media < 4) {
			conceito = "E";
		}

		if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
			System.out.println("Aprovado");
		} else { 
			System.out.println("Reprovado");
		}
	}
	

}
