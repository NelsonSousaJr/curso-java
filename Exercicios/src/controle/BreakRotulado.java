package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) // podemos também rotular nossos processos
		{
			interno: for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;// nesse caso o break está sendo especificado para o laço externo, por isso ele
								  // vai interromper o laço por completo e não apenas o interno.
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
