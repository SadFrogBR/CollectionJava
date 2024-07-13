package estoqueProdutos;

public class Main {

	public static void main(String[] args) {
		EstoqueProdutos e = new EstoqueProdutos();
		e.adicionarProduto(1, "sabao", 1, 16.0);
		e.adicionarProduto(2, "nescau", 1, 23.0);
		e.adicionarProduto(3, "coxa", 3, 10.0);
		e.adicionarProduto(4, "tody", 20, 20.0);
		e.adicionarProduto(5, "cereal", 20, 6);
		e.exibirProdutos();
		System.out.println(e.obterProdutoMaisCaro());
		System.out.println(e.calcularValorTotalEstoque());
		System.out.println(e.obterProdutoMaisBarato());
		System.out.println(e.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
	}

}
