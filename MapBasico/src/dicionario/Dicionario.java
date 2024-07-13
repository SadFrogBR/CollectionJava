package dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionarioMap;
	
	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		this.dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!this.dicionarioMap.isEmpty()) {
			this.dicionarioMap.remove(palavra);
		}else {
			System.out.println("Nao encontrado");
		}
	}
	
	public void exibirPalavras() {
		if(!this.dicionarioMap.isEmpty()) {
			System.out.println(this.dicionarioMap);
		}else {
			System.out.println("Lista vazia");
		}
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pala = null;
		if(!this.dicionarioMap.isEmpty()) {
			pala = this.dicionarioMap.get(palavra);
		}else {
			System.out.println("Palavra não encontrada");
		}
		return pala;
	}
}
