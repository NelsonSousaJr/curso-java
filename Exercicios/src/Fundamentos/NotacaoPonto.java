package Fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		String s = "Bom dia x";			//a declaração de uma String sempre deverá começar com a letra maiúscula
		s = s.replace("x", "nelson");	//para uma notação dar certo, precisa antes setar o objeto (com o =) que receberá a alteração
		s = s.toUpperCase();			//e a cada declaração colocar o ;
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Ana".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"			//também pode quebrar o código da notação no ponto
				.replace("X", "Lucia")  //para ficar mais organizado e menos extenso
				.toUpperCase()			//quantas funções quiser
				.concat("!!!");			//mas sempre na ultima colocar o ;
		
		//Tipos primitivos não têm o operador "."
	}
}
