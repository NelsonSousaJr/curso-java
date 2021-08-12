package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		//String s2;//tentar compilar um código com uma variável n inicializada, vai dar erro de compilação
		//String s2 = null;//aqui ela foi inicializada
		//System.out.println(s2.concat("????"));//porém o erro agora acontecerá na linha de código que ela está sendo utilizada, ja que o valor dela é nulo e nulo(null) é diferente de vazio("")
		//não podemos acessar nem atributo nem método de valor nulo
		//ou ela deverá ter um valor, ou deverá apontar para um endereço de memória

		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}
}
