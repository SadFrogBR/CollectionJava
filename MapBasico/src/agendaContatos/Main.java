package agendaContatos;

public class Main {

	public static void main(String[] args) {
		AgendaContatos a = new AgendaContatos();
		
		a.adicionarContato("samuel", 10);
		a.adicionarContato("lucas", 2);
		a.adicionarContato("jao", 3);
		a.adicionarContato("sandro", 4);
		a.adicionarContato("seibonaro", 5);
		
		a.exibirContatos();
		a.removerContato("jao");
		a.exibirContatos();
		System.out.println(a.pesquisarContato("samuel"));

	}

}
