package conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<PalavrasUnicas> palavrasSet;
	
	public ConjuntoPalavrasUnicas() {
		this.palavrasSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		this.palavrasSet.add(new PalavrasUnicas(palavra));
	}
	
	public void removerPalavra(String palavra) {
		PalavrasUnicas palavraParaRemover = null;
		for(PalavrasUnicas p : this.palavrasSet){
			if(p.getPalavra().equalsIgnoreCase(palavra)) {
				palavraParaRemover = p;
				break;
			}
		}
		this.palavrasSet.remove(palavraParaRemover);
	}
	
	public PalavrasUnicas verificarPalavra(String palavra) {
		PalavrasUnicas palavraParaVerificar= null;
		for(PalavrasUnicas p : this.palavrasSet){
			if(p.getPalavra().equalsIgnoreCase(palavra)) {
				palavraParaVerificar = p;
				break;
			}
		}
		return palavraParaVerificar;
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavrasSet);
	}
}
