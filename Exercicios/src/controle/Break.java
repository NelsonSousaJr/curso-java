package controle;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;//o break interrompe o fluxo e faz o código prosseguir para fora do laço
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
