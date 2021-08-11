package classe;

public class ProdutoTeste 
{
	public static void main(String[] args) 
	{
//		Produto p1 = new Produto ();//criação de tipo personalizada, os atributos desse tipo foram criados na classe Produto.java
//		p1.nome = "Notebook";//não precisam ser importados pois pertencem ao mesmo pacote "classe"
//		p1.preco = 4356.89;
//		p1.desconto = 0.25;
		Produto p1 = new Produto("Notebook", 4356.8);//porque criei o construtor, agora consigo criar um objeto do tipo produto com apenas uma linha de código
		
		
		var p2 = new Produto();//também podemos declarar como var desde que declaremos o tipo produto.
		p2.nome = "Caneta Preta";
		p2.preco = 10.00;
//		p2.desconto = 0.29;
		
		System.out.println(p1.nome + ": R$" + p1.preco);
		System.out.println(p2.nome + ": R$" + p2.preco);
		double subTotal = p1.preco + p2.preco;
		System.out.printf("Subtotal: R$%.2f\n", subTotal);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double total = precoFinal1 + precoFinal2;
		
		double valorDesconto1 = p1.preco - precoFinal1;
		double valorDesconto2 = p2.preco - precoFinal2;
		double totalDesconto = valorDesconto1 + valorDesconto2;
		System.out.printf("Desconto: - R$%.2f\n", totalDesconto);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho: R$%.2f\n", mediaCarrinho);
		System.out.printf("Total: R$%.2f", total);
	}
}
