package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Informe o nome: ");
        String nome = sc.next();
        
        System.out.println("Informe a categoria: ");
        String categoria = sc.next();
        
        System.out.println("Informe o salário: ");
        Double salario = sc.nextDouble();
        
        Double salarioAReceber;
        
        if (categoria.equalsIgnoreCase("A")) {
        	salarioAReceber = salario + (salario * 0.1);
        } else if(categoria.equalsIgnoreCase("B")) {
        	salarioAReceber = salario + (salario * 0.15);
        } else if(categoria.equalsIgnoreCase("C")) {
        	salarioAReceber = salario + (salario * 0.25);
        } else if(categoria.equalsIgnoreCase("D")) {
        	salarioAReceber = salario + (salario * 0.35);
        } else {
        	salarioAReceber = salario + (salario * 0.5);
        }
     
    	Locale brazil = new Locale("pt", "BR");
		NumberFormat currency = NumberFormat.getCurrencyInstance(brazil);
		
        System.out.println("Nome: " + nome + " |Categoria: " + categoria + " |Salário a receber: " + currency.format(salarioAReceber));
	}
}
