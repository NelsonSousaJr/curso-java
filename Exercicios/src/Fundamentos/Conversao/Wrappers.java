package Fundamentos.Conversao;

public class Wrappers 
{
	public static void main(String[] args) 
	{
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;//int
		Long l = 100000000L;//para declarar um Long precisa colocar um L no final
		
		System.out.println(b.byteValue()); 
		System.out.println(s.shortValue());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123F; //quando declaramos um float precisamos colocar um F no final.
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());//aqui a variável Boolean foi transformada em string para depois utiizarmos upper case nela.
		
		Character c = '#';
		System.out.println(c + "...");
	}
}
