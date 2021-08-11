package classe;

import java.util.Scanner;

public class DataTeste {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		  
//		Data d1 = new Data();
//		System.out.println("Digite o dia da sua data de nascimento(dd):"); 
//		d1.dia = entrada.nextInt(); 
//		System.out.println("Digite o mês da sua data de nascimento(mm):");
//		d1.mes = entrada.nextInt();
//		System.out.println("Digite o ano da sua data de nascimento(aaaa):"); 
//		d1.ano = entrada.nextInt();
		
		Data d1 = new Data(2, 10, 1989);//utilizando o construtor
		
		Data d3 = new Data();//utilizando o construtor padrão
		System.out.println("|| testando data padrão: " + d3.dataFormatada() + " ||");//testando a data do construtor padrão e imprimindo utilizando o método de formatar a data.
		
		Data d2 = new Data();
		System.out.println("Digite o dia da data de hoje(dd):"); 
		d2.dia = entrada.nextInt(); 
		System.out.println("Digite o mês da data de hoje(mm):");
		d2.mes = entrada.nextInt();
		System.out.println("Digite o ano da data de hoje(aaaa):"); 
		d2.ano = entrada.nextInt();
		

		entrada.close();
		System.out.println("Data de nascimento: " + d1.dataFormatada());
		System.out.println("Data de de hoje: " +  d2.dataFormatada());

		int totalDias = ((d2.ano - d1.ano) * 365);
		if (d2.mes > d1.mes) {
			totalDias = (d2.mes - d1.mes) * 30;
		} else {
			totalDias = totalDias - ((d1.mes - d2.mes) * 30);
		}
		if (d2.dia > d1.dia) {
			totalDias = totalDias + (d2.dia - d1.dia);
		} else {
			totalDias = totalDias - (d1.dia - d2.dia);
		}
		System.out.println("O total de dias de vida é " + totalDias);

		int idadeAno = 0;
		int idadeMes = 0;
		int idadeDia = 0;

		for (; totalDias >= 365; idadeAno++) {
			totalDias = totalDias - 365;
		}
		for (; totalDias >= 30; idadeMes++) {
			totalDias = totalDias - 30;
		}
		idadeDia = totalDias;
		System.out.printf("Você tem %d ano(s), %d mes(es) e %d dia(s) de vida.", idadeAno, idadeMes, idadeDia);

	}
}
