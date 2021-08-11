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
		
		System.out.println(++a == b--);//como o ++ está antes do a, a comparação é feita após o incremento
									   //e a redução no b é feita após a comparação, por isso esse resultado
									   //vai dar true
		System.out.println(a == b); //agora vai dar falso pq as alterações ja foram feitas
		System.out.println(a);
		System.out.println(b);
		
		//UMA DAS MAIORES VIRTUDES DE UM PROGRAMADOR É ESCREVER UM CÓDIGO DE FÁCIL COMPREENSÃO!!!
		
	}
}
