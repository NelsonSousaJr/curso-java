package Fundamentos.Operadores;

public class Unarios 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);//como o ++ est� antes do a, a compara��o � feita ap�s o incremento
									   //e a redu��o no b � feita ap�s a compara��o, por isso esse resultado
									   //vai dar true
		System.out.println(a == b); //agora vai dar falso pq as altera��es ja foram feitas
		System.out.println(a);
		System.out.println(b);
		
		//UMA DAS MAIORES VIRTUDES DE UM PROGRAMADOR � ESCREVER UM C�DIGO DE F�CIL COMPREENS�O!!!
		
	}
}
