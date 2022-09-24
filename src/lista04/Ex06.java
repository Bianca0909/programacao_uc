package lista04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		Double saldo = 0.0;
		ArrayList<String> operacoes = new ArrayList<>();
		String operacao = "";
		Double valorOperacao = 0.0;
		int continuar = 0;

		while (continuar == 0) {
			saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo"));
			operacao = JOptionPane.showInputDialog("Informe a operação: ");
			operacoes.add(operacao);
			valorOperacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da operação: "));

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

		}

		if (operacao.equalsIgnoreCase("Saque")) {
			saldo = saldo - valorOperacao;
		}
		if (operacao.equalsIgnoreCase("Depósito")) {
			saldo = saldo + valorOperacao;
		}
		Integer numeroOperacoes = operacoes.size();
		System.out.println("Número de operações: " + numeroOperacoes + " Saldo: " + saldo);

	}

}
