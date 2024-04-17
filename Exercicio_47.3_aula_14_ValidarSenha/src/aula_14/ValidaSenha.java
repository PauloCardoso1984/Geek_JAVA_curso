package aula_14;

import java.util.Scanner;

public class ValidaSenha {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia uma senha para validar um acesso. A senha será fornecida pelo usuário (APENAS NÚMERO).");
		System.out.println();

		System.out.print("Cadastre a senha: ");
        // Defina a senha correta
        int senha = sc.nextInt();
        
       
        // Repetição até que a senha seja fornecida corretamente
        while (true) {
            System.out.print("Confirme a senha: ");
            int senhaDigitada = sc.nextInt();

            if (senhaDigitada == senha) {
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