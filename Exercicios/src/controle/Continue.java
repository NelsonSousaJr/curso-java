package controle;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;//Diferente do break, o continue n�o interrompe o la�o inteiro
						 //ele interrompe apenas a intera��o na qual ele est� inserido
						 //e segue para a pr�xima intera��o do la�o
			}
			System.out.println(i);
		}
	}
}
