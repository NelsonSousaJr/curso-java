package Fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		double tempf = 120;
		final int A = 32; 	 /*Segundo a conven��o de c�digos
							  *	todas as constantes dever�o ser
							  *representadas por letras mai�sculas
							  */
		
		final double B = 5.0/9.0;  /*Dividir numeros inteiros se
									*o resultado n�o for um numero inteiro
									*vai dar zero, por isso a necessidade
									*de colocar as casas decimais 
									*/
		
		double tempc = (tempf - A) * B;
		System.out.println("A temperatura � de: " + tempc + "�C");
		
	}

}
