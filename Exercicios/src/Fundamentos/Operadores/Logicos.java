package Fundamentos.Operadores;

public class Logicos 
{
	public static void main(String[] args) 
	{
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);//para o E dar verdadeiro as duas variáveis precisam dar verdadeiro
		System.out.println(condicao1 || condicao2);//para o OU dar verdadeiro apenas uma precisa ser verdadeiro
		System.out.println(condicao1 ^ condicao2);//no OU EXCLUSIVO é necessario que uma seja verdadeira e outra falsa para retornar verdadeiro
		System.out.println(!condicao1);//e na NEGAÇÃO ele inverte o valor da variável seja ela qual for
		System.out.println(!!condicao1);//dupla NEGAÇÃO nega duas vezes voltando a variável para seu valor inicial
		
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
		
		System.out.println("\nTabela Verdade NEGAÇÃO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
	}
}
