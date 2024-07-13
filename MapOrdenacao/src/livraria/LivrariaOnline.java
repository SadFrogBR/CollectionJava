package livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LivrariaOnline {
	private Map<String, Livro> livroMap;
	
	public LivrariaOnline() {
		this.livroMap = new HashMap<>();
	}
	
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		this.livroMap.put(link, new Livro(titulo, autor, preco));
	}
	
	public void removerLivro(String titulo) {
		String removido = null;
		for(Map.Entry<String, Livro> e : this.livroMap.entrySet()) {
			if(e.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				removido = e.getKey();
				break;
			}
		}
		this.livroMap.remove(removido);
		
	}
	
	public void exibir() {
		System.out.println(this.livroMap);
	}
	
	public void exibirLivrosOrdenadosPorPreco() {
		List<Livro> livrosOrdem = new ArrayList<>(this.livroMap.values());
		Collections.sort(livrosOrdem);
		System.out.println(livrosOrdem);
	}
	
	public List<Livro> pesquisarLivrosPorAutor(String autor) {
		List<Livro> livrosAutor = new ArrayList<>();
		
		for(Map.Entry<String, Livro> e : this.livroMap.entrySet()) {
			if(e.getValue().getAutor().equalsIgnoreCase(autor)) {
				livrosAutor.add(e.getValue());
			}
		}
		
		return livrosAutor;
	}
	
	public Livro obterLivroMaisCaro() {
		Livro maisCaro = null;
		
		for(Map.Entry<String, Livro> e : this.livroMap.entrySet()) {
			if(maisCaro == null ||e.getValue().getPreco() > maisCaro.getPreco()) {
				maisCaro = e.getValue();
			}
		}
		
		return maisCaro;
	}
	
	public Livro obterLivroMaisBarato() {
		Livro maisBarato = obterLivroMaisCaro();
		
		for(Map.Entry<String, Livro> e : this.livroMap.entrySet()) {
			if(e.getValue().getPreco() < maisBarato.getPreco()) {
				maisBarato = e.getValue();
			}
		}
		
		return maisBarato;
	}
	
	
}
