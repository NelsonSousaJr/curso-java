package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
		} else {
			System.out.println("Nota registrada");
			if (nota >= 8) {
				System.out.println("Nota Conceito A");
			}else if(nota >= 7.0 && nota < 8.0) {
				System.out.println("Nota conceito B");
			}else if(nota < 7.0) {
				System.out.println("Nota conceito C");
			}
		}
		entrada.close();
	}

}
