package catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livrolist;
	
	public CatalogoLivros() {
		this.livrolist = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, int ano, String autor) {
		this.livrolist.add(new Livro(titulo, ano, autor));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> autorList = new ArrayList<Livro>();
		if(!livrolist.isEmpty()) {
			for(Livro l : this.livrolist) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					autorList.add(l);
				}
			}
		
		}else {
			System.out.println("Lista vazia");
		}
		
		return autorList;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> anoList = new ArrayList<Livro>();
		if(!livrolist.isEmpty()) {
			for(Livro l : this.livrolist) {
				if(l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
					anoList.add(l);
				}
			}
		
		}else {
			System.out.println("Lista vazia");
		}
		
		return anoList;
	}
	
	public Livro pesquisarPorTitulo(String titulo){
		if(!livrolist.isEmpty()) {
			for(Livro l : this.livrolist) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					return l;
				}
			}

		}
		return null;
		
	}
	
}
