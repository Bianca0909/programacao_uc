package lista01;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua idade em dias: ");
		Integer dias = sc.nextInt();

		
		Integer resultadoDiasConvertidosEmAnos = dias / 365;
		Integer resto = dias % 365; 
		Integer resultadoDiasConvertidosEmMeses = resto / 30;
		Integer restoMeses = resto % 30;
		Integer resultadoDias = restoMeses;
		
		System.out.println("Você tem " + resultadoDiasConvertidosEmAnos + " ano(s) " + resultadoDiasConvertidosEmMeses + " mes(es) e " + resultadoDias + " dia(s)");
	}

}
