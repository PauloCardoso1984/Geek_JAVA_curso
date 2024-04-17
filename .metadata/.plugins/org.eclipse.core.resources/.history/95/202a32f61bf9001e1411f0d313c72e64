package calculo;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("A diferença entre a soma dos quadrados dos dez primeiros números naturais e o quadrado da soma.");
		System.out.println();
		
        int n = 10;
        
        // Calcula a soma dos quadrados dos dez primeiros números naturais
        int somaQuadrados = 0;
        for (int i = 1; i <= n; i++) {
            somaQuadrados += i * i;
            System.out.print(i + ", ");
            System.out.println(somaQuadrados + ", ");
        }
        
        // Calcula o quadrado da soma dos dez primeiros números naturais
        int soma = n * (n + 1) / 2;
        int quadradoSoma = soma * soma;
        
        // Calcula a diferença entre os dois valores
        int diferenca = quadradoSoma - somaQuadrados;
        
        System.out.println();
        System.out.println("Soma: " + somaQuadrados);
        System.out.println("Quadrado da soma: " + quadradoSoma);
        
        // Exibe o resultado
        System.out.println("A diferença entre a soma dos quadrados dos dez primeiros números naturais e o quadrado da soma é: " + diferenca);
    }
}
