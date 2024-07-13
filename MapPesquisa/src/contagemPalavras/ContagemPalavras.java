package contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private Map<String, Integer> palavraMap;
	
	public ContagemPalavras() {
		this.palavraMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		this.palavraMap.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		this.palavraMap.remove(palavra);
	}
	
	public void exibirPalavras() {
		System.out.println(this.palavraMap);
	}
	
	public String encontrarPalavrasMaisFrequente() {
	    String linguagemMaisFrequente = null;
	    int maiorContagem = 0;
	    for (Map.Entry<String, Integer> e : palavraMap.entrySet()) {
	      if (e.getValue() > maiorContagem) {
	        maiorContagem = e.getValue();
	        linguagemMaisFrequente = e.getKey();
	      }
	    }
	    return linguagemMaisFrequente + " Contagem: " + maiorContagem;
	  }
}
