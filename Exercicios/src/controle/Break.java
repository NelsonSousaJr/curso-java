package controle;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;//o break interrompe o fluxo e faz o c�digo prosseguir para fora do la�o
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
