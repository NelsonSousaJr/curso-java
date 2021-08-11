package Fundamentos.Exercicios;

import java.util.Scanner;

public class CalculoIMC 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2)); 
		
		System.out.println("IMC = " + imc);
		
		entrada.close();
	}
}
