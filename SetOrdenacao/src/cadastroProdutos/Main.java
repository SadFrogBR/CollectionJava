package cadastroProdutos;

public class Main {

	public static void main(String[] args) {
		CadastroProdutos c = new CadastroProdutos();
		c.adicionarProduto(1, "nescal", 120, 3);
		c.adicionarProduto(1, "nescal", 120, 3);
		c.adicionarProduto(2, "pexe", 50, 5);
		c.adicionarProduto(3, "bulacha", 2, 3);
		c.adicionarProduto(4, "vinho brabo", 200, 3);
		c.adicionarProduto(5, "cafe", 40, 3);
		System.out.println(c.exibirProdutosPorNome());
		System.out.println(c.exibirProdutosPorPreco());

	}

}
