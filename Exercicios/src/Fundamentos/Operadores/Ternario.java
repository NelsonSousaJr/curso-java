package Fundamentos.Operadores;

public class Ternario 
{
	public static void main(String[] args) 
	{
		double media = 5.0;
		String resultado = media >= 7.0 ? "Aprovado" : "em recupera��o";//aqui ele testa a vari�vel e coloca duas poss�veis situa��es
																		//a primeira vai retornar se for verdadeiro, e a segunda se for falso
																		//nesse caso o teste que ele est� fazendo � se a nota � maior ou igual a 7
																		//para informar se o aluno foi aprovado ou est� em recupera��o.
		System.out.println("O aluno est� " + resultado);
	}
}
