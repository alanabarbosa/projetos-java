package controle;
import java.util.Scanner;
/**
 * EstruturasExcepcionais01
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 09/01/2024 
 */
public class EstruturasExcepcionais01 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numerador: ");
        int numerator = scanner.nextInt();
        
        System.out.println("Digite um denominador: ");
        int denominator = scanner.nextInt();
        
        try {
            int result = divide(numerator, denominator);
            System.out.println("Resultado da divisão: " + result);                    
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }    
    } 
    
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("A divisão não pode ser feita por zero");
        }
        return numerator / denominator;
    }
}