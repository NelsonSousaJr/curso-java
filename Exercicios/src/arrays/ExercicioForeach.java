package arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		String[] fraseA = {"eu ", "estou ", "muito ", "feliz","!"};
		
		String fraseCompleta = "";
		for (String frase : fraseA) {
			fraseCompleta = fraseCompleta.concat(frase);
		}
		System.out.println(fraseCompleta);
	}

}
