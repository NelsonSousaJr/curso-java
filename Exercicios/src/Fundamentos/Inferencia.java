package Fundamentos;

public class Inferencia 
{
	//O main é o ponto de partida do programa
	public static void main(String[] args) 
	{
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;			/*Utilizando a inferencia (var) o código irá utilizar o
		 						 *tipo da variavel referente à informação setada a ele
								 *nesse caso como foi um numero com casa decimal o tipo
								 *será double e não poderá receber valor que double nao receba.
								 */
		System.out.println(b);
		
		var c = "Texto"; //mais uma inferencia utilizada, variável dessa vez recebeu o tipo string.
		System.out.println(c);
		
		c = "Outro texto"; //Nesse caso o código aceitou a alteração pq o valor recebido tb foi do tipo string.
		System.out.println(c);
	}
}
