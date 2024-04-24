import java.util.Scanner;
/**
 * Estrutura Concidiconal - Calculadora simples
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaCondicional03 {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro:");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        if (number % 2 == 0) 
            System.out.println("O número é par");
        else
            System.out.println("O número é ímpar");       
        
        
        scanner.close();
    }
}
