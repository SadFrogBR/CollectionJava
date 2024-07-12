package somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
	List<Numero> numerosList;
	
	public ListaNumeros() {
		this.numerosList = new ArrayList<Numero>();
	}
	
	public void adicionarNumero(int numero) {
		this.numerosList.add(new Numero(numero));
	}
	
	public int calcularSoma() {
		int total = 0;
		for(Numero n : numerosList) {
			total += n.getNumero();
		}
		return total;
	}
	
	public int encontrarMaiorNumero(){
		int maior = 0;
		for(Numero n : numerosList) {
			if(n.getNumero() > maior) {
				maior = n.getNumero();
			}
		}
		return maior;
	}
	
	public int encontrarMenorNumero(){
		int menor = this.encontrarMaiorNumero();
		for(Numero n : numerosList) {
			if(n.getNumero() < menor) {
				menor = n.getNumero();
			}
		}
		return menor;
	}
	
	public List<Numero> exibirNumeros(){
		return numerosList;
	}
}
