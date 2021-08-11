package Fundamentos;

public class TiposPrimitivos 
{
	//main � o in�cio de todo programa.
	public static void main(String[] args) 
	{
		//informa��es do funcion�rio
		
		//tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_233L;//quando um n�mero inteiro passa a capacidade do int (que � de 2.147.483.647)
											   //precisamos informar ao c�digo com um L no final do n�mero, para ele entender
											   //que aquele valor se trata de um long e nao de um int.
		//tipos numericos reais (com casas decimais)
		float salario = 11_445.44F;//como esse literal representa um double, precisamos colocar a letra F ao final dele para 
								   //dizer ao c�digo que o valor � do tipo float, j� que o float cabe no double
		
		double vendasAcumuladas = 2_991_797_103.01; //para melhorar a leitura de um numero muito extenso, podemos separar 
												  //por um _ a cada 3 numeros inteiros no valor total e o . no lugar da virgula que separa da casa decimal.
		
		//Tipo booleano
		boolean ferias = true;//O tipo boolean recebe apenas verdadeiro (true) ou falso (false).
		
		//Tipo Caractere
		char status = 'A';//o tipo caractere recebe apenas um caractere entre aspas simples ('')podendo ser letra, n�mero ou s�mbolo.
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("F�rias? " + ferias);
		
		System.out.println("Status: " + status);
	}

}
