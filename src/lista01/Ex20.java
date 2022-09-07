package lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o total a pagar: ");
		Double total = sc.nextDouble();
		
		Double valorComDesconto = total  - (total * 10/100);
		Double valorParcelado= total / 3 ;
		Double comissaoAVista = valorComDesconto + (total*5/100);
		Double  commisaoPrazo = total + (total * 5/100);
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Total R$ " + df.format(total) + " |Valor parcelado 3x de R$ " + df.format(valorParcelado) + " |Comissão a vista: R$ " + df.format(comissaoAVista) + " |Comissão a prazo: R$ " + df.format(commisaoPrazo));

	}

}
