package Fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//vari�vel do tipo real que recebe o valor 3.4
		double raio = 3.4;
		final double PI = 3.14159; //o comando final torna a vari�vel em uma constante, ou seja, n�o pode ser alterado.
									//A conven��o de c�digos diz que se utilize nomes de constantes em letra maiuscula.
		double area = PI * raio * raio;
		System.out.println("A �rea � de: " + area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("A �rea � de: " + area);
	}

}
