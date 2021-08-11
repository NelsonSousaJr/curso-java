package Fundamentos;

import java.util.Scanner;

public class Console 
{
	public static void main(String[] args)  
	{
		System.out.print("Bom");//funcao print não quebra a linha para o próximo comando
		System.out.print(" dia!");
		
		System.out.println("\nBom");
		System.out.println("dia!");
		
		System.out.printf("Megasena %d %d %d %d %d %d %n", 7, 9, 25, 32, 35, 64);
		System.out.printf("Salário: %.2f%n", 12345.6789);
		
		Scanner entrada = new Scanner(System.in);//Scanner é uma variável que busca informação
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();                                                                      
				
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite seu sexo(M/F): ");
		String sexo = entrada.nextLine();
		sexo = sexo.toUpperCase();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("\nNome: " + nome + " " + sobrenome + "\nIdade: " + idade + "\nSexo: " + sexo);
	}
}
