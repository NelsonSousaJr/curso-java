package Fundamentos;

public class PrimitivoVsObjeto 
{
	public static void main(String[] args) 
	{
		//tudo em java é objeto menos os tipos primitivos
		String a = "qualquer coisa";//String é um objeto
		a.toUpperCase();//e podemos interagir com os objetos no Java.
		
		//Wrappers são a versão objeto dos tipos primitivos
		int b = 1;
		System.out.println(b);
	}
}
