package controle;
import java.util.Scanner;
/**
 * Estrutura Concidiconal - Calculadora simples
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaCondicional02 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        
        double number1 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Digite outro número: ");
        
        double number2 = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Digte um operador: (+ - / * %) :");
        String operador = scanner.nextLine();


        double result = 0;
        
        if (operador.equals("+")) {
            result = number1 + number2;
        } else if (operador.equals("-")) {
            result = number1 - number2;
        } else if (operador.equals("/")) {
            result = number1 / number2;
        } else if (operador.equals("*")) {
            result = number1 * number2;
        } else {
            System.out.println("Operador inválido");
            return;
        }
        
        System.out.println("Resultado " + result);
        
        scanner.close();
    }
}
