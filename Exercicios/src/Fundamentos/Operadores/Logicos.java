package Fundamentos.Operadores;

public class Logicos 
{
	public static void main(String[] args) 
	{
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);//para o E dar verdadeiro as duas vari�veis precisam dar verdadeiro
		System.out.println(condicao1 || condicao2);//para o OU dar verdadeiro apenas uma precisa ser verdadeiro
		System.out.println(condicao1 ^ condicao2);//no OU EXCLUSIVO � necessario que uma seja verdadeira e outra falsa para retornar verdadeiro
		System.out.println(!condicao1);//e na NEGA��O ele inverte o valor da vari�vel seja ela qual for
		System.out.println(!!condicao1);//dupla NEGA��O nega duas vezes voltando a vari�vel para seu valor inicial
		
		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade OU (OR)"); 
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NEGA��O (NOT)");
		System.out.println(!true);
		System.out.println(!false);
	}
}
