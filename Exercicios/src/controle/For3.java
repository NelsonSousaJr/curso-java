package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {//As variáveis declaradas dentro de um método, existem apenas dentro dos métodos
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
