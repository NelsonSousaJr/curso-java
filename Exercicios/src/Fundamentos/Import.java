package Fundamentos;

import java.util.Date;		//Os imports ficam fora do class e servem para utilizar o que não está no java.lang

import javax.swing.JButton;	//Os imports também servem para fazer as classes interagirem entre si.

public class Import 
{
	public static void main(String[] args) 
	{
		String s = "Bom dia!";
		java.lang.System.out.println(s); //esse é o endereço completo para as funções do java.lang porém nao são necessárias
		
		Date d = new Date();
		System.out.println(d);
		
		JButton botao = new JButton();		
		
		//Tudo o que não está no java.lang deverá ser importado para ser utilizado no código
	}

}
