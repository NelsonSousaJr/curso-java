package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {//As vari�veis declaradas dentro de um m�todo, existem apenas dentro dos m�todos
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
