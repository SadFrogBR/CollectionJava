package conjuntoPalavrasUnicas;

public class Main {

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();
		c.adicionarPalavra("a");
		c.adicionarPalavra("b");
		c.adicionarPalavra("c");
		c.adicionarPalavra("d");
		c.adicionarPalavra("e");
		c.exibirPalavrasUnicas();
		System.out.println(c.verificarPalavra("b"));
		c.removerPalavra("d");
		c.exibirPalavrasUnicas();

	}

}
