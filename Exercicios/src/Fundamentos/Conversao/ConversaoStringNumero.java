package Fundamentos.Conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero 
{
	public static void main(String[] args) 
	{
		String valor1 = JOptionPane.//apenas para lembrar, podemos quebrar a linha do c�digo
				showInputDialog("Digite o Primeiro N�mero: ");//caso ela fique muito longa para nos ajudar
									//por�m o . � um dos  locais que podemos utilizar para essa quebra de linha sem prejudicar o c�digo
		String valor2 = JOptionPane.
				showInputDialog("Digite o Segundo N�mero: ");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		System.out.println(num1 + num2);
				
	}
}
