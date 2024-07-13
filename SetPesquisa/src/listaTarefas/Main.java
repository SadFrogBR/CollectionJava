package listaTarefas;

public class Main {

	public static void main(String[] args) {
		
		ListaTarefas l = new ListaTarefas();
		
		l.adicionarTarefa("Jogar lol");
		l.adicionarTarefa("jogar elden");
		l.adicionarTarefa("estudar ingles");
		l.adicionarTarefa("estudar java");
		l.adicionarTarefa("assistir anime");
		
		System.out.println(l.contarTarefas());
		l.exibirTarefas();
		l.marcarTarefaConcluida("estudar java");
		l.marcarTarefaConcluida("jogar elden");
		l.marcarTarefaPendente("jogar elden");
		System.out.println(l.obterTarefasPendentes());
		System.out.println(l.obterTarefasConcluidas());
		l.limparListaTarefas();
		l.exibirTarefas();

	}

}
