package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 6.9;

		System.out.println(Arrays.toString(notasAlunoA));//função para imprimir todos os valores do array
		System.out.println(notasAlunoA[0]);//para imprimir apenas um valor, basta chamar sua posição dentro dos []
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);//a função .length é igual ao numero de espaços que possui o array
																	   //no caso de notasAlunoA o legth é 4 pq sao 4 posições porém as posições
																	   //começam a ser contadas a partir da posição 0, ou seja um Array de 4 posições
																	   //vai da posição 0 até a 3 por isso o -1 na impressao.
	
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length ; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double totalAlunoB = 0.0;
		double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
		
	}
}
