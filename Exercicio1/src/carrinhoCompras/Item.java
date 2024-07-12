package carrinhoCompras;

public class Item {
	private int quantidade;
	private double preco;
	private String nome;
	
	public Item(int quantidade, double preco, String nome) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Item [getQuantidade()=" + getQuantidade() + ", getPreco()=" + getPreco() + ", getNome()=" + getNome()
				+ "]";
	}
	
	
	
	
	
	
	
	
}
