package Fundamentos.Exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double tempC = entrada.nextDouble();
		
		System.out.printf("A Temperatura em Fahrenheit é de %.2f°F", (tempC * 9 / 5) + 32);
		
		entrada.close();
	}
}
