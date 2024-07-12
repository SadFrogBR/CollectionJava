package numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	List<Numero> numeroList;
	
	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<Numero>();
	}
	
	public void adicionarNumero(int numero) {
		this.numeroList.add(new Numero(numero));
	}
	
	public List<Numero> ordenarAscendente(){
		List<Numero> numerosAscendente = new ArrayList<>(this.numeroList);
		Collections.sort(numerosAscendente);
		return numerosAscendente;
	}
	
	public List<Numero> ordenarDescendente(){
		List<Numero> numerosDescendente = new ArrayList<>(this.numeroList);
		numerosDescendente.sort(Collections.reverseOrder());
		return numerosDescendente;
	}
	
	public void exibirNumeros() {
		System.out.println(this.numeroList);
	}
}
