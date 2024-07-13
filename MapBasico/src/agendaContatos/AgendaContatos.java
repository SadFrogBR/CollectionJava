package agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone){
		this.agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!this.agendaContatoMap.isEmpty()) {
			this.agendaContatoMap.remove(nome);
		}else {
			System.out.println("Lista de exercicios");
		}
	}
	
	public void exibirContatos() {
		System.out.println(this.agendaContatoMap);
	}
	
	public Integer pesquisarContato(String nome) {
		Integer numero = null;
		if(!this.agendaContatoMap.isEmpty()) {
			numero = this.agendaContatoMap.get(nome);
		}else {
			System.out.println("Lista de exercicios");
		}
		return numero;
		
	}
}
