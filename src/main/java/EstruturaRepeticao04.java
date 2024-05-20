import java.util.Scanner;

/**
 * Estrutura de Repetição 
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaRepeticao04 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        
        int entry = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Qual tabuada você quer? (+ - / *)");
        
        String operador = scanner.nextLine();
        
        for (int count = 1; count <= 10; count++) {
            int result = 0;

            switch (operador) {
                case "+":
                    result = entry + count;
                    break;
                case "-":
                    result = entry - count;
                    break;
                case "*":
                    result = entry * count;
                    break;
                case "/":
                    if (count != 0) {
                        result = entry / count;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    return;
            }

            System.out.println(entry + " " + operador + " " + count + " = " + result);
        }
        
        scanner.close();
    }
}
