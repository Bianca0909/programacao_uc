package aula;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {

		int fumante = JOptionPane.showConfirmDialog(null, "Fumante?");

		int praticaExercicios = JOptionPane.showConfirmDialog(null, "Pratica exercícios?");

		int consomeBebidasAlcoolicas = JOptionPane.showConfirmDialog(null, "Consome bebidas alcóolicas?");

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");

		String apelido = JOptionPane.showInputDialog("Digite seu apelido: ");

		Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

		Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));

		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

		Double imc = peso / (altura * altura);
		String situacao = "";

		if (imc < 17) {
			situacao = "Muito abaixo do peso";
		}
		if (imc > 17 && imc < 18.49) {
			situacao = "Abaixo do peso";
		}
		if (imc > 18.45 && imc < 24.99) {
			situacao = "Peso normal";
		}
		if (imc > 25 && imc < 29.99) {
			situacao = "Acima do peso";
		}
		if (imc > 30 && imc < 34.99) {
			situacao = "Acima do peso";
		}
		if (imc > 35 && imc < 39.99) {
			situacao = "Acima do peso";
		}

		String praticaDeExercicios = "";
		String consumoCigarro = "";
		String consumoBebidas = "";

		if (praticaExercicios == 0) {
			praticaDeExercicios = "Sim";
		}
		if (praticaExercicios == 1) {
			praticaDeExercicios = "Não";
		}
		if (fumante == 0) {
			consumoCigarro = "Sim";
		}
		if (fumante == 1) {
			consumoCigarro = " Não";
		}
		if (consomeBebidasAlcoolicas == 0) {
			consumoBebidas = "Sim";
		}
		if (consomeBebidasAlcoolicas == 1) {
			consumoBebidas = "Não";
		}
		System.out.println("|Nome: " + nome + " \n|Apelido: " + apelido + " \n|Idade: " + idade + " \n|Peso: " + peso
				+ " \n|Altura: " + altura + " \n|Situação: " + situacao + " \n|É fumante? " + consumoCigarro
				+ " \n|Pratica exercícios? " + praticaDeExercicios + " \n|Consome bebidas alcóolicas? "
				+ consumoBebidas);

	}

}
