package estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produtos> EstoqueMap;
	
	public EstoqueProdutos() {
		this.EstoqueMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		this.EstoqueMap.put(cod, new Produtos(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(this.EstoqueMap);
	}
	
	public double calcularValorTotalEstoque() {
		double total = 0;
		for(Produtos p : this.EstoqueMap.values()) {
			total += p.getPreco() * p.getQuantidade();
		}
		return total;
		
	}
	
	public Produtos obterProdutoMaisCaro() {
		Produtos MaisCaro = null;
		for(Produtos p : this.EstoqueMap.values()) {
			if(MaisCaro == null || p.getPreco() > MaisCaro.getPreco()) {
				MaisCaro = p;
			}
		}
		return MaisCaro;
	}
	
	public Produtos obterProdutoMaisBarato() {
		Produtos MaisBarato = obterProdutoMaisCaro();
		//double maiorvalor = Double.MIN_VALUE;
		for(Produtos p : this.EstoqueMap.values()) {
			if(p.getPreco() < MaisBarato.getPreco()) {
				MaisBarato = p;
			}
		}
		return MaisBarato;
	}
	
	public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produtos MaisCaro = null;
		for(Produtos p : this.EstoqueMap.values()) {
			if(MaisCaro == null || (p.getPreco() * p.getQuantidade()) > (MaisCaro.getPreco() * MaisCaro.getQuantidade())) {
				MaisCaro = p;
			}
		}
		return MaisCaro;
	}
}
