package lista04;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {

		String nome;
		Double media;
		String situacao = "";
		Integer continuar;

		do {
			nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			media = Double.parseDouble(JOptionPane.showInputDialog("Informe a média do aluno: "));

			if (media >= 7) {
				situacao = "Aprovado";
			}
			if (media >= 2 && media < 7) {
				situacao = "Em recuperação";
			}
			if (media < 2) {
				situacao = "Reprovado";
			}
			System.out.println("Nome: " + nome + " Situação: " + situacao);
			continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar a situação de outro aluno?");
		} while (continuar == 0);

	}

}
