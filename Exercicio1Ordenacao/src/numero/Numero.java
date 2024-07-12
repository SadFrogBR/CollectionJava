package numero;

public class Numero implements Comparable<Numero>{
	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Numero [getNumero()=" + getNumero() + "]";
	}

	@Override
	public int compareTo(Numero n) {
		// TODO Auto-generated method stub
		return Integer.compare(this.numero, n.getNumero());
	}
	
	
}
