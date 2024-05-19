package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* STREAMS
=> São fluxos de dados, ou fluxos de objetos. Utilizadoas para que possamos
 trabalhar com os dados mais crtiriosa.
- Quando trabalhamos com streams, os métodoas aplicado a este stream não
altera afeta a coleção original. 
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

		// FORMA 1 - LISTA FILTRADA POR QUANTIDADE DE ALUNO
		System.out.println("LISTA FILTRADA POR QUANTIDADE DE ALUNO");
		List<Curso> resultado = cursos.stream()
				.filter(c -> c.getAluno() > 1500)
				.collect(Collectors.toList());
		// FORMA 1 DE IMPRIMIR
		System.out.println(resultado);
		System.out.println();
		// FORMA 2 DE IMPRIMIR
		resultado.forEach(System.out::println);
		System.out.println();
		
		// FORMA 2 - LISTA FILTRADA POR QUANTIDADE DE ALUNO
		cursos.stream()
		.filter(c -> c.getAluno() > 1200)
		.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAluno()))
		.forEach((nome, aluno) -> System.out.println (nome + " tem " + aluno + " alunos"));
	}
}