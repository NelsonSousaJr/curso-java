package Fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		String s = "Bom dia x";			//a declara��o de uma String sempre dever� come�ar com a letra mai�scula
		s = s.replace("x", "nelson");	//para uma nota��o dar certo, precisa antes setar o objeto (com o =) que receber� a altera��o
		s = s.toUpperCase();			//e a cada declara��o colocar o ;
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Ana".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"			//tamb�m pode quebrar o c�digo da nota��o no ponto
				.replace("X", "Lucia")  //para ficar mais organizado e menos extenso
				.toUpperCase()			//quantas fun��es quiser
				.concat("!!!");			//mas sempre na ultima colocar o ;
		
		//Tipos primitivos n�o t�m o operador "."
	}
}
