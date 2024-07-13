package dicionario;

public class Main {

	public static void main(String[] args) {
		Dicionario d = new Dicionario();
		
		d.adicionarPalavra("e", "e");
		d.adicionarPalavra("c", "jojo");
		d.adicionarPalavra("b", "b");
		d.adicionarPalavra("a", "a");
		d.adicionarPalavra("d", "d");
		d.removerPalavra("a");
		d.exibirPalavras();
		System.out.println(d.pesquisarPorPalavra("c"));
	}

}
