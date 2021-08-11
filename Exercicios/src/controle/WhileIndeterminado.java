package controle;

import javax.swing.JOptionPane;

public class WhileIndeterminado {
	public static void main(String[] args) {
		String entrada = "";
		
		while(!entrada.equalsIgnoreCase("sair")) {
			entrada = JOptionPane.showInputDialog("Digite algo");
			System.out.println("Você diz: " + entrada);
		}
	}
}
