package Fundamentos;

public class Temperatura 
{
	public static void main(String[] args) 
	{
		double tempf = 120;
		final int A = 32; 	 /*Segundo a convenção de códigos
							  *	todas as constantes deverão ser
							  *representadas por letras maiúsculas
							  */
		
		final double B = 5.0/9.0;  /*Dividir numeros inteiros se
									*o resultado não for um numero inteiro
									*vai dar zero, por isso a necessidade
									*de colocar as casas decimais 
									*/
		
		double tempc = (tempf - A) * B;
		System.out.println("A temperatura é de: " + tempc + "°C");
		
	}

}
