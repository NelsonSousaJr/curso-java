package arrays;

import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas você quer informar?");
		int n = entrada.nextInt();
		double[] notas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("informe a nota " + (i + 1));
			notas[i] = entrada.nextDouble();
		}
		double somaNotas = 0.0;
		for (double d : notas) {
			somaNotas += d;
		}
		System.out.println("Média: " + (somaNotas / n));

		entrada.close();
	}
}
