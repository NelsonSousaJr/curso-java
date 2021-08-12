package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	void comer(Comida comida) {//aqui eu trouxe o objeto Comida para dentro de Pessoa
							   //e agora consigo acessar as variáveis de instancia e classe de comida
	
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
		
}
