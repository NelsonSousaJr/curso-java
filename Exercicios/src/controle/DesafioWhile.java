package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota = 0.0;
		double contadorNota = 0.0;
		double soma = 0.0;
		do {
			System.out.println("digite a nota");
			nota = entrada.nextDouble();
			if (nota >= 0.0 && nota <= 10.0) {
				soma = nota + soma;
				contadorNota++;
			}else {
				if(nota != -1.0) {
				System.out.println("Nota Inv�lida");
				}else {
					System.out.println("A m�dia das notas � de: " + (soma / contadorNota));
				}
			}
		} while (nota != -1.0);

		entrada.close();
	}
}
