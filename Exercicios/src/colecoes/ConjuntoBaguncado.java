package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//NO CONJUNTO ELE TRANSFORMA AUTOMATICAMENTE OS TIPOS PRIMITIVOS
		//EM OBJETOS, JÁ QUE CONJUNTO N RECEBE PRIMITIVO
		
		//adicionando informações ao conjunto
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); 
		conjunto.add(1); //int -> Integer
		conjunto.add('X'); //char -> Character
		
		System.out.println("Tamanho é " + conjunto.size());//no conjunto ao inves de length utilizamos size
		
		conjunto.add('X'); //Conjunto n recebe repetição

		System.out.println("Tamanho é " + conjunto.size());//por isso não aumenta o tamanho
		
		System.out.println(conjunto.remove("teste"));//false pq n temos esse valor no conjunto
		System.out.println(conjunto.remove("Teste"));//true
		System.out.println(conjunto.remove('X'));//true
		
		System.out.println("Tamanho é " + conjunto.size());	
		
		System.out.println(conjunto.contains('X'));//esse valor ja foi removido do conjunto
		System.out.println(conjunto.contains(true));		
		
		Set nums = new HashSet(); 
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);//adicionando todos os valores de nums que não tem ainda em conjunto
		System.out.println(conjunto);//isso vai alterar conjunto
		System.out.println(nums);//mas n vai alterar nums
		
		conjunto.retainAll(nums);//ele vai reter todos os valores que contém nos dois conjuntos(que são 1, 2 e 3)
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
