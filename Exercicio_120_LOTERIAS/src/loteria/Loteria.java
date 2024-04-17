package loteria;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Loteria {

	public static void main(String[] args) {

		HashSet<Integer> numerosLotomania = new HashSet<>();
		Set<Integer> numerosMegaSena =  new TreeSet<>();
		Set<Integer> numerosDuplaSena =  new TreeSet<>();
		
		Random random = new Random();

		System.out.print("LOTOMANIA - ");
		while (numerosLotomania.size() < 50) {
			int numeroLotomania = random.nextInt(100);
			numerosLotomania.add(numeroLotomania);
		}
		for (int numero : numerosLotomania) {
			System.out.print(numero + " - ");
		}
		System.out.println();
		System.out.println("-----------------------------------");

		System.out.print("MEGA-SENA - ");
		while (numerosMegaSena.size() < 6) {
			int numeroMegaSena = random.nextInt(60);
			numerosMegaSena.add(numeroMegaSena);
		}
		for (int numero : numerosMegaSena) {
			System.out.print(numero + " - ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
	
		System.out.print("DUPLA-SENA - ");
		while (numerosDuplaSena.size() < 15) {
			int numeroDuplaSena = random.nextInt(50);
			numerosDuplaSena.add(numeroDuplaSena);
		}
		for (int numero : numerosDuplaSena) {
			System.out.print(numero + " - ");
		}
	}
}