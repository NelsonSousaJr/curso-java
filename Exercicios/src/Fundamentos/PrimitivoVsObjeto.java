package Fundamentos;

public class PrimitivoVsObjeto 
{
	public static void main(String[] args) 
	{
		//tudo em java � objeto menos os tipos primitivos
		String a = "qualquer coisa";//String � um objeto
		a.toUpperCase();//e podemos interagir com os objetos no Java.
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos
		int b = 1;
		System.out.println(b);
	}
}
