package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2.00;
		double b = a; //atribuição por valor porque é tipo primitivo
		
		a++;//os valores são individuais
		b--;
		System.out.println(a + "\n" + b);
		
		Data d1 = new Data(2, 10, 1989);
		Data d2 = d1;//aqui foi uma referencia porque se trata de objeto
		
		d1.mes = 12;//como foi feita uma referencia, ambas alterações irão influenciar nos 2 objetos
		d2.dia = 5;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d1.dataFormatada());//ele vai repetir os valores porque mais uma vez, eles estão apontando
		System.out.println(d2.dataFormatada());//o mesmo lugar na memória, ou seja a informação de ambos será alterada!!!
	}
	//um metodo static só consegue acessar outro método static
	//um método estático não consegue acessar um método de instancia(variavel)
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
