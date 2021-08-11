package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) // podemos tamb�m rotular nossos processos
		{
			interno: for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;// nesse caso o break est� sendo especificado para o la�o externo, por isso ele
								  // vai interromper o la�o por completo e n�o apenas o interno.
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
