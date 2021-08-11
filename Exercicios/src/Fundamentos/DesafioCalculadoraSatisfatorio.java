package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraSatisfatorio 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		double num1 = entrada.nextDouble();
		String op = entrada.next().trim();
		double num2 = entrada.nextDouble();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}
}
