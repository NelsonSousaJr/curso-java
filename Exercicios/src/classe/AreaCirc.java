package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;//associando pi � classe e tonandoe em uma constante, por isso deve ser colocado em caixa alta.
	
	AreaCirc (double raioInicial){//cria��o do m�todo construtor
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
