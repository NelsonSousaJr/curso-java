package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite o dia da semana");
		entrada = entrada.toUpperCase();
		System.out.println(entrada);
		if (entrada.equals("DOMINGO")) {
			System.out.println("Dia 1 da semana");
		} else if (entrada.equals("SEGUNDA")) {
			System.out.println("Dia 2 da semana");
		} else if (entrada.equals("TERÇA")) {
			System.out.println("Dia 3 da semana");
		} else if (entrada.equals("QUARTA")) {
			System.out.println("Dia 4 da semana");
		} else if (entrada.equals("QUINTA")) {
			System.out.println("Dia 5 da semana");
		} else if (entrada.equals("SEXTA")) {
			System.out.println("Dia 6 da semana");
		} else if (entrada.equals("SÁBADO")) {
			System.out.println("Dia 7 da semana");
		} else
			System.out.println("Dia inválido");
	}
}
