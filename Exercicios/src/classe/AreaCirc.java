package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;//associando pi à classe e tonandoe em uma constante, por isso deve ser colocado em caixa alta.
	
	AreaCirc (double raioInicial){//criação do método construtor
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
