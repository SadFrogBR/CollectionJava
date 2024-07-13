package listaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private long matricula;
	private double nota;
	
	public Aluno(String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	@Override
	public String toString() {
		return "{getNome()=" + getNome() + ", getMatricula()=" + getMatricula() + ", getNota()=" + getNota()
				+ "}";
	}

	@Override
	public int compareTo(Aluno p) {
		
		return this.nome.compareToIgnoreCase(p.getNome());
	}
	
}

class ComparatorPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}

