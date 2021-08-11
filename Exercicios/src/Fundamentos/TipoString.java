package Fundamentos;

public class TipoString 
{
	public static void main(String[] args) 
	{
		System.out.println("Ol� pessoal".charAt(0));//a fun��o charAt mostra o caract�re na posi��o selecionada a partir do 0, nesse caso � a letra O.
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));//concat adiciona algo � String selecionada
		System.out.println(s + "!!!");		//assim como essa fun��o de adicionar manualmente
		System.out.println(s.startsWith("Boa"));//essa fun��o verifica se a String come�a com esses caracteres.
		System.out.println(s.toLowerCase().startsWith("boa"));//aqui antes de verificarmos o in�cio da String, colocamos em lower case e depois verificamos
		System.out.println(s.toUpperCase().endsWith("TARDE"));//aqui utilizamos uper case e verificamos o final da String
		System.out.println(s.length());//o length serve para saber o tamanho da String
		System.out.println(s.toLowerCase().equals("boa tarde"));//aqui utilizamos lower case e verificamos a String por completo
		System.out.println(s.equalsIgnoreCase("BoA TaRdE"));//aqui ele verifica a String ignorando a case
		
		var nome = "nelson";//variavel do tipo String
		var sobrenome = "sousa";//variavel do tipo String
		var idade = 31;//vari�vel do tipo int
		var salario = 15500.00;//nesse caso ele cria uma vari�vel do tipo double, para criar uma vari�vel do tipo float seria necessario colocar o F no final do numero
		
		System.out.println("Nome: " + nome.toUpperCase() + "\nSobrenome: " + sobrenome.toUpperCase() + "\nIdade: " + idade + "\nSal�rio: " + salario);//contatena��o manual no println
		String outraFrase = "Nome: " + nome.toUpperCase() + "\nSobrenome: " + sobrenome.toUpperCase() + "\nIdade: " + idade + "\nSal�rio: " + salario;//a mesmas concatena��o por�m setando a uma vari�vel.
		System.out.println(outraFrase);
		
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);//concatena��o de uma frase apenas substituindo as vari�veis por comandos
																										/*
																										 * %s para posicionar uma String
																										 * %d p�ra posicionar um int
																										 * %2f para posicionar um double
																										 * %f para posicionar um float
																										 * %c para posicionar um char
																										 */
		String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);//essa � outra alternativa de criar uma frase, mas dessa vez setamos ela � uma vari�vel do tipo String
		System.out.println(frase);
		
	}
}
