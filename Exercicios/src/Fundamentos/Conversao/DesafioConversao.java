package Fundamentos.Conversao;

import java.util.Scanner;

public class DesafioConversao 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o valor 1: ");
		String valor1 = entrada.nextLine();
		valor1 = valor1.replaceAll(",", ".");//Função de String replaceAll substitui o primeiro valor pelo segundo na função
											 //nesse caso pedi que substituisse todas as , por .
											 //evitando um erro na hora de transformar de String para double
		
		System.out.print("Informe o valor 2: ");
		String valor2 = entrada.nextLine();
		valor2 = valor2.replaceAll(",", ".");
		
		System.out.print("Informe o valor 3: ");
		String valor3 = entrada.nextLine();
		valor3 = valor3.replaceAll(",", ".");
		
		double num1 = Double.parseDouble(valor1);//aqui utilizei função do Double, que é Wrapper de double.
		double num2 = Double.parseDouble(valor2);
		double num3 = Double.parseDouble(valor3);
		
		entrada.close();
				
		System.out.println("As somas dos valores é: " + (num1 + num2 + num3));
		System.out.println("A média dos valores é de: " + (num1 + num2 + num3) / 3);
	}
}
