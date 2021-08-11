package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;

	Data(){//como criei um construtor, precisei criar o construtor padrão para poder utilizá-lo
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
