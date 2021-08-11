package Fundamentos.Conversao;

public class ConversaoNumeroString 
{
	public static void main(String[] args) 
	{
		Integer num1 = 10000;//Integer é uma classe
		System.out.println(num1.toString().length());/*e podemos interagir com as classes, nesse caso transformamos uma 
													  *variavel Integer em String e em seguida conseguimos utilizar uma funcção
													  *exclusiva de String que é medir a quantidade de caracteres que a variável possui
													  */
		
		int num2 = 100000;//Int NÂO é uma classe, é um objeto primitivo e objetos primitivos não possuem funções para interagir com a variável
		
		System.out.println(Integer.toString(num2).length());/*Mas ainda assim podemos converter uma variável utilizando a função de uma classe
															 *nesse caso declaramos uma variável primitiva int e a transformamos em uma variável
															 *String utilizando a função de Integer ja que Integer é uma Wrapper de int
															 *conseguindo assim utilizar a mesma função que mede o tamanho de uma String
															 */
		System.out.println(("" + num2).length());//outra forma de converter para string é concatenar a variável com uma String vazia
		
		System.out.println(("" + num1).length()); 
		
		/*
		 * BASICAMENTE PODEMOS TRANSFORMAR QUALQUER VARIÁVEL NUMÉRICA EM STRING UTILIZANDO AS FUNÇÕES DAS WRAPPERS DE SUAS RESPECTIVAS VARIÁVEIS
		 * SEJA Double, Long, Short, Integer ou Float UTILIZANDO QUALQUER UMA DAS FORMAS ACIMA!!!!
		 */
	}
}
