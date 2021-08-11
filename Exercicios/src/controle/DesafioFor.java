package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		for (; !valor.equalsIgnoreCase("######"); valor += "#") {
			System.out.println(valor);
		}

	}

}
