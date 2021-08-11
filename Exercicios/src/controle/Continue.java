package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;//Diferente do break, o continue não interrompe o laço inteiro
						 //ele interrompe apenas a interação na qual ele está inserido
						 //e segue para a próxima interação do laço
			}
			System.out.println(i);
		}
	}
}
