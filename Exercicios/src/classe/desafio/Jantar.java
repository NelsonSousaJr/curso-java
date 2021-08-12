package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Nelson", 100.00);
		Comida c1 = new Comida("Feijão", 0.3);
		Comida c2 = new Comida("Arroz", 0.2);
		
		System.out.println("O peso de " + p.nome + " antes do jantar é " + p.peso + "Kg");
		
		p.comer(c1);
		p.comer(c2);
		
		System.out.println("O peso de " + p.nome + " após o jantar é " + p.peso + "Kg");
		
	}

}
