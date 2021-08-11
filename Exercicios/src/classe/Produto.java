package classe;

public class Produto 
{
	String nome;
	double preco;
	static final double DESCONTO = 0.25;//quando criamos uma constante por padr�o colocamos em caixa alta
	
	//OBRIGATORIAMENTE CONSTRUTOR NAO PODE TER RETORNO E NEM TER TIPO DECLARADO
	
	Produto (){//Agora eu criei um contrutor, que serve para criar os objetos sem precisar cria-los manualmente, basta eu informar os parametros do construtor
		//O construtor padr�o j� vem implicito caso vc n crie um construtor, mas caso crie um, vc precisa declarar tb um construtor padr�o caso ainda queira usa-lo
	}
	Produto (String nomeInnicial, double precoInicial){//o construtor tb � um m�todo por�m sem retorno.
	//n se deve declarar o tipo do construtor, caso vc declare ele se torna um metodo comum
		nome = nomeInnicial;//aqui estamos apenas declarando os valores das vari�veis no construtor
		preco = precoInicial;//ou seja, as informa��es colocadas no construtor ser�o passadas para as vari�veis automaticamente
//		DESCONTO = descontoInicial;//ap�s criar um construtor � necessario salvar o arquivo para que ele passe a informa��o para a outra classe
	}
	double precoComDesconto() {//cria��o do m�todo para calcular desconto, como a classe produto ja tem preco e desconto, n�o precisamos colocar no m�todo.
		return preco * (1 - DESCONTO);
	}
	double precoComDesconto(double descontoGerente) {//cria��o m�todo alternativo, para adicionar mais desconto
		return preco * (1 - (DESCONTO + descontoGerente));
	}
}
