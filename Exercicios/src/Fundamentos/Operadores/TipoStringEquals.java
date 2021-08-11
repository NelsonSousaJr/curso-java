package Fundamentos.Operadores;

import java.util.Scanner;

public class TipoStringEquals 
{
	public static void main(String[] args) 
	{
		System.out.println("2" == "2");//true
		
		String s1 = new String ("2");
		System.out.println("2" == s1);//false, pq ele não está comparando apenas o conteúdo e sim todos os parâmetros
		System.out.println("2".equals(s1));//para comparar strings devemos utilizar sempre o .equals, aí sim ele compara apenas o conteúdo
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim());//Nesse caso mesmo com o .trim ele vai dar errado porque utilizamos o == para comparar Strings
		System.out.println("2".equals(s2.trim()));//o .trim serve para remover os espaçoes vazios da String
		
		entrada.close();
	}
}
