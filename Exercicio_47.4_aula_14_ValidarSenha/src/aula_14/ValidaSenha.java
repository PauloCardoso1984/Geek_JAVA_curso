package aula_14;

import java.util.Scanner;

public class ValidaSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Faça um programa que leia uma senha para validar um acesso. \n"
				+ "A senha será fornecida pelo usuário (LETRAS E NÚMERO).");
		System.out.println();

        String senhaDigitada;
        System.out.print("Cadastre uma Senha: ");
        String senhaCorreta = sc.nextLine();

        System.out.print("Confirme a senha: ");
        senhaDigitada = sc.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta. Tente novamente.");
            System.out.println();
            System.out.print("Confirme a senha: ");
            senhaDigitada = sc.nextLine();
        }

        System.out.print("Acesso permitido!");
        sc.close();
    }
}