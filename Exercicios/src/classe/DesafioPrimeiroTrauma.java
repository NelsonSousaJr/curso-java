package classe;

public class DesafioPrimeiroTrauma {
		int a = 3;//para acessar esse valor � preciso
		static int b = 5;//ou especifico que a vari�vel pertence � classe (static)
	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();//criar uma instancia, nesse caso p
		System.out.println(p.a);//a � um atributo da instancia e p � uma vari�vel da instancia
		System.out.println(b);//nesse caso basta 
		
	}
}
