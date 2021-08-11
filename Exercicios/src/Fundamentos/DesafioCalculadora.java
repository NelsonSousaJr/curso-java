package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora 
{
	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double resultadoSom;
		double resultadoSub;
		double resultadoMult;
		double resultadoDiv;
				
		String operacao = new String(" ");
		
		Scanner entrada = new Scanner(System.in);//fase de digitação da operação
		num1 = entrada.nextDouble();
		operacao = entrada.next().trim();
		num2 = entrada.nextDouble();
		entrada.close();
		
		resultadoSom = num1 + num2;
		String soma = Double.toString(resultadoSom);//aqui o resultado das operações é convertido para string
		
		resultadoSub = num1 - num2;
		String subtracao = Double.toString(resultadoSub);
		
		resultadoMult = num1 * num2;
		String multiplicacao = Double.toString(resultadoMult);
		
		resultadoDiv = num1 / num2;
		String divisao = Double.toString(resultadoDiv);
		
		boolean som = "+".equals(operacao);//aqui eu crio booleans para testar qual operação foi escolhida.
		boolean sub = "-".equals(operacao);
		boolean mult = "*".equals(operacao);
		boolean div = "/".equals(operacao);
		
		System.out.println("=");
				
		System.out.println(Boolean.toString(som).replaceAll("true", soma));//a operação escolhida irá imprimir o resultado.
		System.out.println(Boolean.toString(sub).replaceAll("true", subtracao));
		System.out.println(Boolean.toString(mult).replaceAll("true", multiplicacao));
		System.out.println(Boolean.toString(div).replaceAll("true", divisao));
				
	}
}
