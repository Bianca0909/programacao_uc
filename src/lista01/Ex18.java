package lista01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua idade em anos: ");
		Integer anos = sc.nextInt();
		
		System.out.println("Em meses");
		Integer meses = sc.nextInt();
		
		System.out.println("E em dias");
		Integer dias = sc.nextInt();
		
		Integer resultadoAnosConvertidosEmDias = anos * 365;
		
		Integer resultadoMesesConvertidosEmDias = meses * 30;
		
		Integer resultado = dias + resultadoMesesConvertidosEmDias + resultadoAnosConvertidosEmDias;
		
		System.out.println("Você tem " + resultado + " dias de idade");
	}


}
