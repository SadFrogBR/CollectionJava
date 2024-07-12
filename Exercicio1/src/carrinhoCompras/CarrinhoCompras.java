package carrinhoCompras;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompras {
	private List<Item> carrinhoCompras;
	
	public CarrinhoCompras() {
		this.carrinhoCompras = new ArrayList<Item>();
	}
	
	public void adicionarItem(int quantidade, double preco, String nome) {
		this.carrinhoCompras.add(new Item(quantidade, preco, nome));
	}
	
	public void removerItem(String nome) {
		for(Item t: this.carrinhoCompras) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				if(t.getQuantidade() == 1) {
					this.carrinhoCompras.remove(t);
					break;
				}else{
					t.setQuantidade(t.getQuantidade()-1);
				}
			}
		}
	}
	
	public double calcularValorTotal() {
		double total = 0;
		for(Item t: this.carrinhoCompras) {
			total += t.getPreco() * t.getQuantidade();
		}
		
		return total;
	}
	
	public void exibirItens() {
		System.out.println(this.carrinhoCompras);
	}
}
