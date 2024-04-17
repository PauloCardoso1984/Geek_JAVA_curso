package aula_14;

import java.util.Scanner;

public class UmNumeroPorLinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia uma senha para validar um acesso. Senha VALIDA é 1234.");
		System.out.println();

        // Defina a senha correta
        String senhaCorreta = "1234";

        // Repetição até que a senha seja fornecida corretamente
        while (true) {
            System.out.print("Digite a senha: ");
            String senhaDigitada = sc.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta. Acesso liberado!");
                break; // Encerra o loop quando a senha estiver correta
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
                System.out.println();
            }
        }
		sc.close();
    }
}