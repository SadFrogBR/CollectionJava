package agendaContatos;

import java.util.Objects;

public class Contatos {
	private String nome;
	private int numero;
	
	public Contatos(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	 @Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Contatos contato)) return false;
	    return Objects.equals(getNome(), contato.getNome());
	  }
	 
	  @Override
	  public int hashCode() {
	    return Objects.hash(getNome());
	  }

	@Override
	public String toString() {
		return "Contatos [getNome()=" + getNome() + ", getNumero()=" + getNumero() + "]";
	}
	
	
	
	
}
