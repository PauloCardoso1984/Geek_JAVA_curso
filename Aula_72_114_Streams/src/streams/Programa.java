package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* STREAMS + THEAD
=> Útil para quando trabalhar com milhões/bilhoes de dados
 * */
public class Programa {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("HTML", 100));
		cursos.add(new Curso("JAVA", 1100));
		cursos.add(new Curso("POWER_BI", 2700));
		cursos.add(new Curso("PYTHON", 700));
		cursos.add(new Curso("BANCO DE DADOS", 2700));
		cursos.add(new Curso("WHATSSAP", 1000));
		cursos.add(new Curso("ALGORITMO", 898));
		cursos.add(new Curso("GIT_HUB", 10120));
		cursos.add(new Curso("REACT", 84));

		System.out.println(cursos);
		System.out.println();

		// LISTA FILTRADA POR QUANTIDADE DE ALUNO
		// FORMA 2 - LISTA FILTRADA POR QUANTIDADE DE ALUNO
				cursos.parallelStream()
				.filter(c -> c.getAluno() > 1200)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAluno()))
				.forEach((nome, aluno) -> System.out.println (nome + " tem " + aluno + " alunos"));
	
	}
}