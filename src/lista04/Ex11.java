package lista04;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList();
		String nome;
		ArrayList<Double> medias = new ArrayList();
		Double media;
		Integer continuar;
		
		do {
			nome = JOptionPane.showInputDialog("Informe seu nome: ");
			media = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade: "));
			
			nomes.add(nome);
			medias.add(media);
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			
		} while (continuar == 0);
		
	// Pegar o nome que tem o mesmo index do menor/maior número do array
	
        System.out.println("Nome: "   + " Idade: " + Collections.max(medias));
       

	}

}
