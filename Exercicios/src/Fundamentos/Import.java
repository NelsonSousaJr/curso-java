package Fundamentos;

import java.util.Date;		//Os imports ficam fora do class e servem para utilizar o que n�o est� no java.lang

import javax.swing.JButton;	//Os imports tamb�m servem para fazer as classes interagirem entre si.

public class Import 
{
	public static void main(String[] args) 
	{
		String s = "Bom dia!";
		java.lang.System.out.println(s); //esse � o endere�o completo para as fun��es do java.lang por�m nao s�o necess�rias
		
		Date d = new Date();
		System.out.println(d);
		
		JButton botao = new JButton();		
		
		//Tudo o que n�o est� no java.lang dever� ser importado para ser utilizado no c�digo
	}

}
