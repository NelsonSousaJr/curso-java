package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		//if (boolean)
		//while(boolean)
		//for(boolean)
		String faixa = "preta";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei preta");
		case "marrom":
			System.out.println("sei marrom");
		case "roxa":
			System.out.println("sei roxa");
		case "verde":
			System.out.println("sei verde");
		case "laranja":
			System.out.println("sei laranja");
		case "vermelha":
			System.out.println("sei vermelha");
		case "amarela":
			System.out.println("sei amarela");
			break;
			default:
				System.out.println("comecei agora");
		}
		
	}
}
