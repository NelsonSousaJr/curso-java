package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		//String s2;//tentar compilar um c�digo com uma vari�vel n inicializada, vai dar erro de compila��o
		//String s2 = null;//aqui ela foi inicializada
		//System.out.println(s2.concat("????"));//por�m o erro agora acontecer� na linha de c�digo que ela est� sendo utilizada, ja que o valor dela � nulo e nulo(null) � diferente de vazio("")
		//n�o podemos acessar nem atributo nem m�todo de valor nulo
		//ou ela dever� ter um valor, ou dever� apontar para um endere�o de mem�ria

		String s2 = Math.random() > 0.5 ? "Opa" : null;
		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}
}
