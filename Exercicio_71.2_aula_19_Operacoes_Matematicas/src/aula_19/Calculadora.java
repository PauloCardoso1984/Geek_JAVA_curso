package aula_19;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1: // Soma
                    realizarOperacao("+");
                    break;
                case 2: // Subtração
                    realizarOperacao("-");
                    break;
                case 3: // Multiplicação
                    realizarOperacao("*");
                    break;
                case 4: // Divisão
                    realizarOperacao("/");
                    break;
                case 0: // Sair
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma das opções listadas.");
            }
            
        } while (opcao != 0);
        
        scanner.close();
    }
    
    public static void exibirMenu() {
    	System.out.println();
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
    }
    
    public static void realizarOperacao(String operador) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double resultado;
        
        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;
        }
    }
}
