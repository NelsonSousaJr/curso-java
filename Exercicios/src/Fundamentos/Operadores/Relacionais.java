package Fundamentos.Operadores;

public class Relacionais 
{
	public static void main(String[] args) 
	{
		int a = 97;
		int b = 'a'; //'a' representa o numero 97 na tabela unicode.
		
		System.out.println(a == b);//opera��o de compara��o
		System.out.println(30 != 7); //diferente que
		System.out.println(3 > 4); //maior que
		System.out.println(3 >= 3); // maior ou igual que
		System.out.println(3 < 7); //menor que
		System.out.println(30 <= 7); //menor ou igual que
		
		double nota = 7.5;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temPresente = bomComportamento && passouPorMedia;
		
		System.out.println("Vai ganhar presente? " + temPresente);
	}
}
