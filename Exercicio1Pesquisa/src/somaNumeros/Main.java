package somaNumeros;

public class Main {

	public static void main(String[] args) {
		ListaNumeros l = new ListaNumeros();
		
		l.adicionarNumero(5);
		l.adicionarNumero(2);
		l.adicionarNumero(10);
		l.adicionarNumero(1);
		l.adicionarNumero(3);
		
		System.out.println(l.exibirNumeros());
		System.out.println(l.encontrarMaiorNumero());
		System.out.println(l.encontrarMenorNumero());
		System.out.println(l.calcularSoma());
		

	}

}
