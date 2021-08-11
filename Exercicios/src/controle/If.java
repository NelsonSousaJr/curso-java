package controle;

import java.util.Scanner;

public class If 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0 && media <= 10.0) //O IF EXECUTA A PROXIMA LINHA DE CODIGO CASO VERDADEIRO
		{//PARA EXECUTAR MAIS DE UMA LINHA DE CODIGO CASO VERDADEIRO PRECISA COLOCAR AS {} FORMANDO UM BLOCO DE CODIGO
			System.out.println("APROVADO");
			System.out.println("PARABÉNS");
		}
		
		if (media < 7 && media >= 4.5) 
		{
			System.out.println("RECUPERAÇÃO");
		}
		
		if (media < 4.5 && media >= 0) 
		{
			System.out.println("REPROVADO");
		}
		
		entrada.close();
	}
}
