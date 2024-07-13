package listaAlunos;

public class Main {

	public static void main(String[] args) {
		GerenciadorAlunos g = new GerenciadorAlunos();
		
		g.adicionarAluno("d", 1, 4.0);
		g.adicionarAluno("b", 2, 6.0);
		g.adicionarAluno("a", 3, 2.0);
		g.adicionarAluno("e", 4, 10.0);
		g.adicionarAluno("c", 5, 4.5);
		g.exibirAlunos();
		System.out.println(g.exibirAlunosPorNome());
		
		System.out.println(g.exibirAlunosPorNota());

	}

}
