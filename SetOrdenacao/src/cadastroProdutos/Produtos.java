package cadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
	private String nome;
	private long cod;
	private double preco;
	private int quantidade;
	
	public Produtos(String nome, long cod, double preco, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public long getCod() {
		return cod;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public int compareTo(Produtos p) {
		return this.nome.compareToIgnoreCase(p.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Produtos))
			return false;
		Produtos other = (Produtos) obj;
		return cod == other.cod;
	}

	@Override
	public String toString() {
		return "{getNome()=" + getNome() + ", getCod()=" + getCod() + ", getPreco()=" + getPreco()
				+ ", getQuantidade()=" + getQuantidade() + "} ";
	}


}

class ComparatorPorPreco implements Comparator<Produtos>{

	@Override
	public int compare(Produtos p1, Produtos p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
