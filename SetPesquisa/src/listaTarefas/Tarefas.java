package listaTarefas;

public class Tarefas {
	private String descricao;
	private Boolean statusTarefa;
	
	public Tarefas(String descricao) {
		this.descricao = descricao;
		this.statusTarefa = false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Boolean getStatusTarefa() {
		return statusTarefa;
	}
	
	public void setStatusTarefa(Boolean statusTarefa) {
		this.statusTarefa = statusTarefa;
	}

	@Override
	public String toString() {
		return "Tarefas [getDescricao()=" + getDescricao() + ", getStatusTarefa()=" + getStatusTarefa() + "]";
	}
	
	
}
