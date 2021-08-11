package Fundamentos.Conversao;

public class ConversaoNumeroString 
{
	public static void main(String[] args) 
	{
		Integer num1 = 10000;//Integer � uma classe
		System.out.println(num1.toString().length());/*e podemos interagir com as classes, nesse caso transformamos uma 
													  *variavel Integer em String e em seguida conseguimos utilizar uma func��o
													  *exclusiva de String que � medir a quantidade de caracteres que a vari�vel possui
													  */
		
		int num2 = 100000;//Int N�O � uma classe, � um objeto primitivo e objetos primitivos n�o possuem fun��es para interagir com a vari�vel
		
		System.out.println(Integer.toString(num2).length());/*Mas ainda assim podemos converter uma vari�vel utilizando a fun��o de uma classe
															 *nesse caso declaramos uma vari�vel primitiva int e a transformamos em uma vari�vel
															 *String utilizando a fun��o de Integer ja que Integer � uma Wrapper de int
															 *conseguindo assim utilizar a mesma fun��o que mede o tamanho de uma String
															 */
		System.out.println(("" + num2).length());//outra forma de converter para string � concatenar a vari�vel com uma String vazia
		
		System.out.println(("" + num1).length()); 
		
		/*
		 * BASICAMENTE PODEMOS TRANSFORMAR QUALQUER VARI�VEL NUM�RICA EM STRING UTILIZANDO AS FUN��ES DAS WRAPPERS DE SUAS RESPECTIVAS VARI�VEIS
		 * SEJA Double, Long, Short, Integer ou Float UTILIZANDO QUALQUER UMA DAS FORMAS ACIMA!!!!
		 */
	}
}
