package tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	
	
	private List<Tarefa> tarefaList;
	
	
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<Tarefa>();
	}



	public void adicionarTarefa(String descricao){
		this.tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerItem(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t: this.tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		this.tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return this.tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(this.tarefaList);
	}
	
	
	
}
