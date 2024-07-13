package livraria;

public class Main {

	public static void main(String[] args) {
		LivrariaOnline l = new LivrariaOnline();
		l.adicionarLivro("a", "a", "a", 15.0);
		l.adicionarLivro("b", "b", "b", 20.0);
		l.adicionarLivro("e", "e", "b", 2.0);
		l.adicionarLivro("d", "d", "d", 12.0);
		l.adicionarLivro("c", "c", "c", 11.0);
		l.exibirLivrosOrdenadosPorPreco();
		System.out.println(l.pesquisarLivrosPorAutor("b"));
		System.out.println(l.obterLivroMaisCaro());
		System.out.println(l.obterLivroMaisBarato());
	}

}
