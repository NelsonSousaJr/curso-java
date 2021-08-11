package Fundamentos.Exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double tempF = entrada.nextDouble();
		
		System.out.printf("A Temperatura em Celsius é de %.2f°C", (tempF - 32) * 5 / 9);
		
		entrada.close();
	}
}
