package Fundamentos.Operadores;

public class DesafioAritimeticos 
{
	public static void main(String[] args) 
	{
		double a = 6 * (3 + 2);
		a = Math.pow(a, 2);
		a = a / (3 * 2);
		System.out.println(a);
		
		double b = ((1 - 5) * (2 - 7)) / 2;
		b = Math.pow(b, 2);
		System.out.println(b);
		
		double c = a - b;
		c = Math.pow(c, 3);
		System.out.println(c);
		
		double d = Math.pow(10, 3);
		
		double resultado = c / d;
		
		System.out.println("O resultado é: " + resultado);
	}
}
