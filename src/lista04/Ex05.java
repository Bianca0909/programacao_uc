package lista04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		String nome = "";
		Integer idade;
		ArrayList<Integer> listaIdade = new ArrayList<>();

		do {
			nome = JOptionPane.showInputDialog("Informe o nome: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

			nomes.add(nome);
			listaIdade.add(idade);
//			System.out.println(ListaIdade);
		} while (!idade.equals(0));

		Integer soma = listaIdade.stream().reduce(0, Integer::sum);

		double media = (double) soma / (nomes.size() - 1);
		System.out.println("Soma: " + soma + " Média: " + media);
	}

}
