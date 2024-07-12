package carrinhoCompras;

public class Main {

	public static void main(String[] args) {
		CarrinhoCompras c = new CarrinhoCompras();
		
		c.adicionarItem(1, 20.0, "chocotino");
		c.adicionarItem(3, 5, "social club");
		c.adicionarItem(3, 2, "halls");
		c.removerItem("halls");
		c.removerItem("social Club");
		c.removerItem("chocotino");
		c.removerItem("halls");
		c.removerItem("halls");
		System.out.println(c.calcularValorTotal());
		c.exibirItens();
		
		

	}

}
