package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		do {
				System.out.println("Digite a senha: ");
				texto = entrada.nextLine();
				if (!texto.equalsIgnoreCase("antrax")) {
					System.out.println("Senha incorreta!");
				}else {
					System.out.println("Seja bem vindo!");
				}
		}while (!texto.equalsIgnoreCase("antrax"));
		entrada.close();
		
	}

}
