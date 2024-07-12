package catalogoLivros;

public class Livro {
	private String titulo;
	private int ano;
	private String autor;
	
	public Livro(String titulo, int ano, String autor) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAno() {
		return ano;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Livro [getTitulo()=" + getTitulo() + ", getAno()=" + getAno() + ", getAutor()=" + getAutor() + "]";
	}
	
	
	
	
	
	
}
