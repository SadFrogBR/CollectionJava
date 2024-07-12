package catalogoLivros;

public class Main {

	public static void main(String[] args) {
		CatalogoLivros c = new CatalogoLivros();
		
		c.adicionarLivro("capa", 2000, "jose");
		c.adicionarLivro("jomes", 2001, "josimar");
		c.adicionarLivro("capa2", 2003, "jose");
		c.adicionarLivro("caco", 2004, "caco");
		c.adicionarLivro("jomes2", 2004, "josimar");
		c.adicionarLivro("caco2", 2005, "caco");
		c.adicionarLivro("carrocel", 2012, "kokimoto");
		
		System.out.println(c.pesquisarPorAutor("kokimoto"));
		System.out.println(c.pesquisarPorIntervaloAnos(2003, 2004));
		System.out.println(c.pesquisarPorTitulo("jomes2"));

	}

}
