package numero;

public class Main {

	public static void main(String[] args) {
		OrdenacaoNumeros n = new OrdenacaoNumeros();
		
		n.adicionarNumero(4);
		n.adicionarNumero(2);
		n.adicionarNumero(1);
		n.adicionarNumero(5);
		n.adicionarNumero(3);
		
		n.exibirNumeros();
		System.out.println(n.ordenarAscendente());
		System.out.println(n.ordenarDescendente());

	}

}
