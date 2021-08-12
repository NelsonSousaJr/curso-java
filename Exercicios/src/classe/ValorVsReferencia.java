package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2.00;
		double b = a; //atribui��o por valor porque � tipo primitivo
		
		a++;//os valores s�o individuais
		b--;
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(2, 10, 1989);
		Data d2 = d1;//aqui foi uma referencia porque se trata de objeto
		
		d1.mes = 12;//como foi feita uma referencia, ambas altera��es ir�o influenciar nos 2 objetos
		d2.dia = 5;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d1.dataFormatada());//ele vai repetir os valores porque mais uma vez, eles est�o apontando
		System.out.println(d2.dataFormatada());//o mesmo lugar na mem�ria, ou seja a informa��o de ambos ser� alterada!!!
	}
	//um metodo static s� consegue acessar outro m�todo static
	//um m�todo est�tico n�o consegue acessar um m�todo de instancia(variavel)
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
