package Fundamentos.Operadores;

import java.util.Scanner;

public class TipoStringEquals 
{
	public static void main(String[] args) 
	{
		System.out.println("2" == "2");//true
		
		String s1 = new String ("2");
		System.out.println("2" == s1);//false, pq ele n�o est� comparando apenas o conte�do e sim todos os par�metros
		System.out.println("2".equals(s1));//para comparar strings devemos utilizar sempre o .equals, a� sim ele compara apenas o conte�do
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim());//Nesse caso mesmo com o .trim ele vai dar errado porque utilizamos o == para comparar Strings
		System.out.println("2".equals(s2.trim()));//o .trim serve para remover os espa�oes vazios da String
		
		entrada.close();
	}
}
