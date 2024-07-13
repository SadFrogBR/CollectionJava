package agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contatos> contatosSet;
	
	public AgendaContatos() {
		this.contatosSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		this.contatosSet.add(new Contatos(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatosSet);
	}
	
	public Set<Contatos> pesquisarPorNome(String nome) {
		Set<Contatos> nomesPesquisados = new HashSet<>();
		for(Contatos c : this.contatosSet) {
			if(c.getNome().startsWith(nome)) {
				nomesPesquisados.add(c);
			}
		}
		return nomesPesquisados;
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for(Contatos c : this.contatosSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				break;
			}
		}
	}
	
	
	
}
