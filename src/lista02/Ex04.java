package lista02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Digite a nota 1: ");
   Double nota1 = sc.nextDouble();
   
   System.out.println("Digite a nota 2: ");
   Double nota2 = sc.nextDouble();
   
   System.out.println("Digite a nota 3: ");
   Double nota3 = sc.nextDouble();
	
   Double media = (nota1 + nota2 + nota3)/3;
   
   String situacao;
   if (media < 7) {
	   situacao = "Reprovado";
   } else {
	   situacao = "Aprovado";
   }
   System.out.println("Média : " + media + " |Situação : " + situacao);
	
	}

}
