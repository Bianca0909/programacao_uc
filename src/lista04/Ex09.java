package lista04;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		ArrayList<Double> numerosReais = new ArrayList();
		Double numero;
		Integer continuar;

		do {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
			numerosReais.add(numero);

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while (continuar == 0);

		System.out.println(Collections.min(numerosReais));

	}

}
