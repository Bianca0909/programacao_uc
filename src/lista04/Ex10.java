package lista04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList();
		String nome;
		ArrayList<Integer> idades = new ArrayList();
		Integer idade;
		Integer continuar;

		do {
			nome = JOptionPane.showInputDialog("Informe seu nome: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

			nomes.add(nome);
			idades.add(idade);

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

		} while (continuar == 0);

		// Pegar o nome que tem o mesmo index do menor/maior número do array

		System.out.println("Nome: " + " Idade: " + Collections.max(idades));
		System.out.println("Nome: " + " Idade: " + Collections.min(idades));

	}

}
