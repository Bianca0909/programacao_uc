package lista04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {

	String nome;

	ArrayList<String> sexos = new ArrayList<>();
	String sexo;
	Integer continuar;
		
		do {
			nome = JOptionPane.showInputDialog("Informe o nome");
			sexo = JOptionPane.showInputDialog("Informe o sexo");
			sexos.add(sexo);
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while (continuar == 0);
		
		
		System.out.println("Contagem de alunos do sexo feminino: " + sexos.stream().filter(s -> s.equalsIgnoreCase("Feminino")).count());
		System.out.println("Constagem de alunos do sexo masculino: " + sexos.stream().filter(s -> s.equalsIgnoreCase("Masculino")).count());

	}

}
