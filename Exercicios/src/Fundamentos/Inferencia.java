package Fundamentos;

public class Inferencia 
{
	//O main � o ponto de partida do programa
	public static void main(String[] args) 
	{
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;			/*Utilizando a inferencia (var) o c�digo ir� utilizar o
		 						 *tipo da variavel referente � informa��o setada a ele
								 *nesse caso como foi um numero com casa decimal o tipo
								 *ser� double e n�o poder� receber valor que double nao receba.
								 */
		System.out.println(b);
		
		var c = "Texto"; //mais uma inferencia utilizada, vari�vel dessa vez recebeu o tipo string.
		System.out.println(c);
		
		c = "Outro texto"; //Nesse caso o c�digo aceitou a altera��o pq o valor recebido tb foi do tipo string.
		System.out.println(c);
	}
}
