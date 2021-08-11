package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) // podemos também rotular nossos processos
		{
			interno: for (int j = 0; j < 3; j++) {
				if (i == 1) {
					continue externo;// nesse caso o continue está sendo especificado para o laço externo, por isso ele
								  	 // vai seguir para o laço externo.
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
