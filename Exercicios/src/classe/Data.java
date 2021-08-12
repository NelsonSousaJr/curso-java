package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	//THIS() PUXA TODOS OS ATRIBUTOS DA INSTANCIA
	//THIS. PUXA UMA POR VEZ
	Data(){//como criei um construtor, precisei criar o construtor padr�o para poder utiliz�-lo
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);//this () tb chama instancia, isso � um construtor
	}

//	VALORES PADR�ES DE VARI�VEIS DE INSTANCIA QUANDO N INFORMAMOS(S�O INCIALIZADAS AUTOMATICAMENTE)
//	VARI�VEIS LOCAIS N�O S�O INICIALIZADAS
//	CONSTANTES DEVEM SER INICIALIZADAS DE QUALQUER MANEIRA (NEM QUE ELA RECEBA O VALOR DENTRO DO M�TODO)	
//byte, short, int, long --> 0	
//float, double --> 0.0	
//boolean --> false
//char -->  '\u0000'(primeiro caracter da tabela unicode)
//Objetos --> null (n�o apontam para nenhum endere�o da mem�ria)
	
	Data(int dia, int mes, int ano){//OS ATRIBUTOS CRIADOS NOS M�TODOS SER�O VIS�VEIS APENAS NOS M�TODOS QUE FORAM CRIADOS E FORA DELES SER�O DESCARTADOS
		this.dia = dia;//aqui diferenciamos as vari�veis de instancia das vari�veis da classe com o "this."
		this.mes = mes;
		this.ano = ano;
	}
	String dataFormatada() {//fun��o da instancia
		final String formato = "%d/%d/%d";//vari�vel criada dentro de um m�todo se torna uma vari�vel local, ou seja, ela s� poder� ser usada dentro do m�todo que foi criada
		return String.format(formato, this.dia, mes, ano);//aqui ele puxa atributos da instancia n faz diferen�a se colocar o this.
	}
	
	//final String formato = "%d/%d/%d"; se ela tivesse sido criada fora do m�todo seria de instancia e poderia ser acessada em qualquer m�todo
	void imprimirDataFormatada() {
		
		System.out.println(this.dataFormatada());
	}

}
