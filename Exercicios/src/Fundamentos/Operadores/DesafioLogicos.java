package Fundamentos.Operadores;

public class DesafioLogicos 
{
	public static void main(String[] args) 
	{
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		//se os dois trabalhos derem certos premio maximo
		//se apenas um trabalho der certo premio medio
		//se ou premio maximo ou premio medio recebe bonus
		
		boolean trabalho1 = true; 
		boolean trabalho2 = true;
		
		boolean premioMaximo = trabalho1 && trabalho2; 
		System.out.println(Boolean.toString(premioMaximo).replaceAll("true", "Parabéns, ganhou o prêmio Máximo!!!"));
		System.out.println(Boolean.toString(premioMaximo).replaceAll("false", "Que pena, mas ainda tem chance de ganhar algo!"));
		
		boolean premioMedio;
		premioMedio = (trabalho1 ^ trabalho2 && trabalho2);
		System.out.println(Boolean.toString(premioMedio).replaceAll("true", "Parabéns, ganhou o prêmio Médio!!!"));
		
		premioMedio = (trabalho1 ^ trabalho2 && trabalho1);
		System.out.println(Boolean.toString(premioMedio).replaceAll("true", "Parabéns, ganhou o prêmio Médio!!!"));
		
		boolean verificacao = (trabalho1 || trabalho2);
		System.out.println(Boolean.toString(verificacao).replaceAll("false", "Que pena, não foi dessa vez, se esforce mais da próxima vez"));
		
		boolean bonus = premioMaximo || premioMedio;
		System.out.println(Boolean.toString(bonus).replaceAll("true", "Oba! hoje tem bônus!!! :)")); 
		
	}
}
