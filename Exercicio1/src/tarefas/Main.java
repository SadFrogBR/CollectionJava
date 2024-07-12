package tarefas;

public class Main {

	public static void main(String[] args) {
		ListaTarefas l = new ListaTarefas();
		
		l.adicionarTarefa("jojo");
		
		l.adicionarTarefa("jose");
		
		l.obterDescricoesTarefas();
		
		System.out.println(l.obterNumeroTotalTarefas());
		l.removerItem("jose");
		System.out.println(l.obterNumeroTotalTarefas());
	}

}
