package listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefas> tarefasSet;
	
	public ListaTarefas() {
		this.tarefasSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		this.tarefasSet.add(new Tarefas(descricao));
	
	}
	
	public void removerTarefa(String descricao) {
		Tarefas tarefaRemover = null;
		
		for(Tarefas t : this.tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaRemover = t;
			}
		}
		if(tarefaRemover != null) {
			this.tarefasSet.remove(tarefaRemover);
		}else {
			System.out.println("Tarefa não existe");
		}
		
	}
	
	public void exibirTarefas() {
		if(!this.tarefasSet.isEmpty()) {
			System.out.println(this.tarefasSet);
		}else {
			System.out.println("Lista vazia");
		}
	}
	
	public int contarTarefas() {
		return this.tarefasSet.size();
	}
	
	public Set<Tarefas> obterTarefasConcluidas(){
		Set<Tarefas> tarefasConcluidas = new HashSet<>();
		for(Tarefas t : this.tarefasSet) {
			if(t.getStatusTarefa() == true) {
				tarefasConcluidas.add(t);
			}
		}
		
		return tarefasConcluidas;
	}
	
	public Set<Tarefas> obterTarefasPendentes(){
		Set<Tarefas> tarefasPendentes = new HashSet<>();
		for(Tarefas t : this.tarefasSet) {
			if(t.getStatusTarefa() == false) {
				tarefasPendentes.add(t);
			}
		}
		
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefas t : this.tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setStatusTarefa(true);
				break;
			}
		}
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		for(Tarefas t : this.tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setStatusTarefa(false);
				break;
			}
		}
		
	}
	
	public void limparListaTarefas() {
		this.tarefasSet.clear();
	}
	
	
}
