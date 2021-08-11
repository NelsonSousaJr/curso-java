package Fundamentos.Operadores;

public class Aritimeticos 
{
	public static void main(String[] args) 
	{
		System.out.println(2 + 3);
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + (double) b);
		System.out.println(a - (double) b);
		System.out.println(a * (double) b);
		System.out.println(a / (double) b);//dessa forma nós transformamos o valor de int para double
	}
}
