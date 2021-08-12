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
		this(1, 1, 1970);//this () tb chama instancia
	}
	Data(int dia, int mes, int ano){//vari�veis da classe
		this.dia = dia;//aqui diferenciamos a instancia das vari�veis da classe com o this.
		this.mes = mes;
		this.ano = ano;
	}
	String dataFormatada() {//fun��o da instancia
		return String.format("%d/%d/%d", this.dia, mes, ano);//aqui ele puxa atributos da instancia n faz diferen�a se colocar o this.
	}

}
