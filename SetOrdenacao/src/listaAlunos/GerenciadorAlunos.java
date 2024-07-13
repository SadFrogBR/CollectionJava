package listaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	Set<Aluno> alunosSet;
	
	public GerenciadorAlunos(){
		this.alunosSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, long matricula, double nota){
		this.alunosSet.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(Long matricula) {
		Aluno removerAluno = null;
		
		for(Aluno a : this.alunosSet) {
			if(a.getMatricula() == matricula) {
				removerAluno = a;
				break;
			}
		}
		
		this.alunosSet.remove(removerAluno);
	}
	
	public void exibirAlunos() {
		System.out.println(this.alunosSet);
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> AlunosPorNome = new TreeSet<>(this.alunosSet);
		return AlunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> AlunosPorNota = new TreeSet<>(new ComparatorPorNota());
		AlunosPorNota.addAll(this.alunosSet);
		return AlunosPorNota;
	}
}
