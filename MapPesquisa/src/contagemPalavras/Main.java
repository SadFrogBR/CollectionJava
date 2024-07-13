package contagemPalavras;

public class Main {

	public static void main(String[] args) {
		ContagemPalavras c = new ContagemPalavras();
		
		c.adicionarPalavra("samuel", 2);
		c.adicionarPalavra("jose", 6);
		c.adicionarPalavra("leo", 9);
		c.adicionarPalavra("samanta", 4);
		
		c.exibirPalavras();
		System.out.println(c.encontrarPalavrasMaisFrequente());

	}

}
