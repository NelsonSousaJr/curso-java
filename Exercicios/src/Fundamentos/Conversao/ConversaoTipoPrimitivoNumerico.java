package Fundamentos.Conversao;

public class ConversaoTipoPrimitivoNumerico 
{
	public static void main(String[] args) 
	{
		double a = 1;//conversao implicita
		System.out.println(a);
		
		float b = (float) 1.0;//conversao explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;//conversao explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; //convers�o explicita (CAST)
		System.out.println(f);
	}
}
