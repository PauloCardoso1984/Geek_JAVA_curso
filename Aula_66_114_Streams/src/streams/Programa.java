package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* STREAMS
 * => 
 * */
public class Programa {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("HTML", 100));
		cursos.add(new Curso("JAVA", 11900));
		cursos.add(new Curso("POWER_BI", 2700));
		cursos.add(new Curso("PYTHON", 700));
		cursos.add(new Curso("BANCO DE DADOS", 2700));
		cursos.add(new Curso("WHATSSAP", 2500));
		cursos.add(new Curso("ALGORITMO", 898));
		cursos.add(new Curso("GIT_HUB", 10120));
		cursos.add(new Curso("REACT", 84));

		System.out.println(cursos);
		System.out.println();

		// ORDENANDO A LISTA - QUANTIDADE DE ALUNOS
		System.out.println("ORDENANDO A LISTA - QUANTIDADE DE ALUNOS");
		cursos.sort(Comparator.comparing(c -> c.getAluno()));
		System.out.println(cursos);
		System.out.println();

		// ORDENANDO A LISTA - QUANTIDADE DE ALUNO / PEGANDO SOMENTE O CURSO Lambda
		System.out.println("ORDENANDO A LISTA - QUANTIDADE DE ALUNO / PEGANDO SOMENTE O CURSO - Lambda");
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println();
		
		// ORDENANDO A LISTA - QUANTIDADE DE ALUNOS - Method Reference 1
		System.out.println("ORDENANDO A LISTA - QUANTIDADE DE ALUNOS - Method Reference 1 ");
		cursos.sort(Comparator.comparing(Curso :: getAluno));
		System.out.println(cursos);
		System.out.println();
		
		// ORDENANDO A LISTA - QUANTIDADE DE ALUNOS - Method Reference 2
		System.out.println("ORDENANDO A LISTA - QUANTIDADE DE ALUNOS - Method Reference 2");
		cursos.forEach(System.out::println);
	}
}