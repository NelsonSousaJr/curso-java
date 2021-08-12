package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	//THIS() PUXA TODOS OS ATRIBUTOS DA INSTANCIA
	//THIS. PUXA UMA POR VEZ
	Data(){//como criei um construtor, precisei criar o construtor padrão para poder utilizá-lo
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//this () tb chama instancia, isso é um construtor
	}

//	VALORES PADRÕES DE VARIÁVEIS DE INSTANCIA QUANDO N INFORMAMOS(SÃO INCIALIZADAS AUTOMATICAMENTE)
//	VARIÁVEIS LOCAIS NÃO SÃO INICIALIZADAS
//	CONSTANTES DEVEM SER INICIALIZADAS DE QUALQUER MANEIRA (NEM QUE ELA RECEBA O VALOR DENTRO DO MÉTODO)	
//byte, short, int, long --> 0	
//float, double --> 0.0	
//boolean --> false
//char -->  '\u0000'(primeiro caracter da tabela unicode)
//Objetos --> null (não apontam para nenhum endereço da memória)
	
	Data(int dia, int mes, int ano){//OS ATRIBUTOS CRIADOS NOS MÉTODOS SERÃO VISÍVEIS APENAS NOS MÉTODOS QUE FORAM CRIADOS E FORA DELES SERÃO DESCARTADOS
		this.dia = dia;//aqui diferenciamos as variáveis de instancia das variáveis da classe com o "this."
		this.mes = mes;
		this.ano = ano;
	}
	String dataFormatada() {//função da instancia
		final String formato = "%d/%d/%d";//variável criada dentro de um método se torna uma variável local, ou seja, ela só poderá ser usada dentro do método que foi criada
		return String.format(formato, this.dia, mes, ano);//aqui ele puxa atributos da instancia n faz diferença se colocar o this.
	}
	
	//final String formato = "%d/%d/%d"; se ela tivesse sido criada fora do método seria de instancia e poderia ser acessada em qualquer método
	void imprimirDataFormatada() {
		
		System.out.println(this.dataFormatada());
	}

}
