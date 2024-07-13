package agendaContatos;

public class Main {

	public static void main(String[] args) {
		AgendaContatos a = new AgendaContatos();
		
		a.adicionarContato("Samuel", 1);
		a.adicionarContato("Samuel abreu", 2);
		a.adicionarContato("jao", 3);
		a.adicionarContato("gustavo", 4);
		a.adicionarContato("lucas", 5);
		a.exibirContatos();
		System.out.println(a.pesquisarPorNome("Samuel"));
		a.atualizarNumeroContato("samuel", 10);
		a.exibirContatos();

	}

}
