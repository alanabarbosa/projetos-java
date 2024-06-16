package controle;
import java.util.Scanner;
/**
 * Estrutura de Repetição
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaRepeticao01 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        
        int entry = Integer.parseInt(scanner.nextLine());
        
        for(int i = 0; i <= entry; i ++) {
            System.out.println(i);
        }
        
    }
}
