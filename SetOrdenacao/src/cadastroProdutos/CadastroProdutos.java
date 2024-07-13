package cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	Set<Produtos> produtosSet;
	
	public CadastroProdutos() {
		this.produtosSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		this.produtosSet.add(new Produtos(nome, cod, preco, quantidade));
	}
	
	public Set<Produtos> exibirProdutosPorNome() {
		Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
		return produtosPorNome;
	}
	
	public Set<Produtos> exibirProdutosPorPreco() {
		Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	}
}
