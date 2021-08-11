package Fundamentos.Operadores;

public class Ternario 
{
	public static void main(String[] args) 
	{
		double media = 5.0;
		String resultado = media >= 7.0 ? "Aprovado" : "em recuperação";//aqui ele testa a variável e coloca duas possíveis situações
																		//a primeira vai retornar se for verdadeiro, e a segunda se for falso
																		//nesse caso o teste que ele está fazendo é se a nota é maior ou igual a 7
																		//para informar se o aluno foi aprovado ou está em recuperação.
		System.out.println("O aluno está " + resultado);
	}
}
