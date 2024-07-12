package pessoa;

public class Main {

	public static void main(String[] args) {
		OrdenacaoPessoas p = new OrdenacaoPessoas();
		
		p.adicionarPessoa("Samuel", 21, 1.88);
		p.adicionarPessoa("Lucas", 25, 1.70);
		p.adicionarPessoa("Leonardo", 28, 1.71);
		p.adicionarPessoa("Jao", 22, 1.87);
		
		System.out.println(p.ordenarPorAltura());
		System.out.println(p.ordenarPorIdade());
		

	}

}
