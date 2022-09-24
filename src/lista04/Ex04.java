package lista04;

public class Ex04 {

	public static void main(String[] args) {
		int soma = 0;
		Integer somaX[] = new Integer[100];
		
		for (int i = 0; i <= 100; i++) {
			soma += i;
			if (i == 100) {
			System.out.println(soma);
			}
		}

	}

}
