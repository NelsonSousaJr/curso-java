package classe;

public class Produto 
{
	String nome;
	double preco;
	static final double DESCONTO = 0.25;//quando criamos uma constante por padrão colocamos em caixa alta
	
	//OBRIGATORIAMENTE CONSTRUTOR NAO PODE TER RETORNO E NEM TER TIPO DECLARADO
	
	Produto (){//Agora eu criei um contrutor, que serve para criar os objetos sem precisar cria-los manualmente, basta eu informar os parametros do construtor
		//O construtor padrão já vem implicito caso vc n crie um construtor, mas caso crie um, vc precisa declarar tb um construtor padrão caso ainda queira usa-lo
	}
	Produto (String nomeInnicial, double precoInicial){//o construtor tb é um método porém sem retorno.
	//n se deve declarar o tipo do construtor, caso vc declare ele se torna um metodo comum
		nome = nomeInnicial;//aqui estamos apenas declarando os valores das variáveis no construtor
		preco = precoInicial;//ou seja, as informações colocadas no construtor serão passadas para as variáveis automaticamente
//		DESCONTO = descontoInicial;//após criar um construtor é necessario salvar o arquivo para que ele passe a informação para a outra classe
	}
	double precoComDesconto() {//criação do método para calcular desconto, como a classe produto ja tem preco e desconto, não precisamos colocar no método.
		return preco * (1 - DESCONTO);
	}
	double precoComDesconto(double descontoGerente) {//criação método alternativo, para adicionar mais desconto
		return preco * (1 - (DESCONTO + descontoGerente));
	}
}
