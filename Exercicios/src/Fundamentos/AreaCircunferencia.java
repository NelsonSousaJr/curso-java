package Fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//variável do tipo real que recebe o valor 3.4
		double raio = 3.4;
		final double PI = 3.14159; //o comando final torna a variável em uma constante, ou seja, não pode ser alterado.
									//A convenção de códigos diz que se utilize nomes de constantes em letra maiuscula.
		double area = PI * raio * raio;
		System.out.println("A área é de: " + area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("A área é de: " + area);
	}

}
