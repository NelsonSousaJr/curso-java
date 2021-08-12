package classe;

public class DesafioPrimeiroTrauma {
		int a = 3;//para acessar esse valor é preciso
		static int b = 5;//ou especifico que a variável pertence à classe (static)
	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();//criar uma instancia, nesse caso p
		System.out.println(p.a);//a é um atributo da instancia e p é uma variável da instancia
		System.out.println(b);//nesse caso basta 
		
	}
}
