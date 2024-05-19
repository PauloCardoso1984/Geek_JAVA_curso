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
		
		// IMPRIMIR SOMENTE UM CURSO COM MAIS DE UM DETERMINADA QUANTIDADE DE ALUNOS Method Reference
		System.out.println("IMPRIMIR SOMENTE UM CURSO COM MAIS DE UM DETERMINADA QUANTIDADE DE ALUNOS 1");
		cursos.stream().filter(c -> c.getAluno() >= 1000).forEach(c -> System.out.println(c.getNome()));
		System.out.println("\nIMPRIMIR SOMENTE UM CURSO COM MAIS DE UM DETERMINADA QUANTIDADE DE ALUNOS 2");
		cursos.stream().filter(c -> c.getAluno() <= 1000).forEach(c -> System.out.println(c.getNome()));

		// IMPRIMIR SOMENTE UM CURSO COM MAIS DE UM DETERMINADA QUANTIDADE DE ALUNOS Lambda
		System.out.println("\nIMPRIMIR SOMENTE UM CURSO COM MAIS DE UM DETERMINADA QUANTIDADE DE ALUNOS 3");
		cursos.stream().filter(c -> c.getAluno() >= 1000).forEach(System.out::println);
	}
}