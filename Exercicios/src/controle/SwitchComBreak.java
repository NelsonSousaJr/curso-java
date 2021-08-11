package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a nota:");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9://no switch n�o conseguimos colocar intervalos de valores, temos que colocar todas as op��es que queremos que validem o case.
			conceito = "A";
			break;
		case 8://tanto faz colocar os cases na mesma linha ou  
		case 7://um abaixo do outro, o resultado ser� o mesmo
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "F";
			break;
			default:
				conceito = "Conceito n�o informado!";
				break;//caso o default possua um break, ele n precisa estar no final do m�todo
		}			  //mas por padr�o deixamos ele sempre no final do m�todo
					  //mas como ele est� no final o break n�o � necess�rio
		System.out.println("O conceito � " + conceito);

		entrada.close();

	}
}
