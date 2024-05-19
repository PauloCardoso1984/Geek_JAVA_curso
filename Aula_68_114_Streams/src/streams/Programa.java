package streams;

import java.util.ArrayList;
import java.util.List;

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
		
		// FILTRANDO A LISTA COM A QUANTIDADE DE ALUNOS
		System.out.println("FILTRANDO A LISTA COM A QUANTIDADE DE ALUNOS");
		cursos.stream()
		.filter(c -> c.getAluno() > 1000)
		.map(Curso::getAluno)		// => MAPEIA O TIPO DE DADO
		.forEach(System.out::println);
		
		System.out.println("\nFILTRANDO A LISTA COM A QUANTIDADE DE ALUNOS");
		cursos.stream()
		.filter(c -> c.getAluno() <= 1000)
		.map(Curso::getAluno)		// => MAPEIA O TIPO DE DADO
		.forEach(System.out::println);		
	}
}