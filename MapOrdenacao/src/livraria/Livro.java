package livraria;

public class Livro implements Comparable<Livro>{
	private String titulo;
	private String autor;
	private double preco;
	
	public Livro(String titulo, String autor, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}
	
	@Override
	public int compareTo(Livro b) {
		return Double.compare(this.preco, b.getPreco());
	}

	@Override
	public String toString() {
		return "{getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getPreco()=" + getPreco() + "}";
	}

	
}


