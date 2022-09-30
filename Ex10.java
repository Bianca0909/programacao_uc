import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {

		String nome, nomeMaisNova = "", nomeMaisIdosa = "";
		Integer idade = 0, idadeMaisNova = 120, idadeMaisIdosa = 0;
		Integer qtdFuncionarios;
		Integer continuar;
		qtdFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de funcionários"));

		for (int i = 0; i <= qtdFuncionarios; i++) {
			
			nome = JOptionPane.showInputDialog("Informe seu nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			
			if (idade > idadeMaisIdosa) {
				nomeMaisIdosa = nome;
				idadeMaisIdosa = idade;

			}
			if (idade < idadeMaisNova) {
				nomeMaisNova = nome;
				idadeMaisNova = idade;
			}

			System.out.println("Mais idosa: " + nomeMaisIdosa + " idade: " + idadeMaisIdosa);
			System.out.println("Mais nova: " + nomeMaisNova + " idade: " + idadeMaisNova);
		}

	}
}
