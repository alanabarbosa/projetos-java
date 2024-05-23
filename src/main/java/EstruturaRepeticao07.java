import java.util.Random;
import java.util.Scanner;
/**
 * EstruturaRepeticao07
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 09/01/2024 
 */
public class EstruturaRepeticao07 {
    public static void main(String[] args) {  
        
        Scanner scanner = new Scanner(System.in); 
        int numberUser;
        
        do {            
            System.out.println("\nAdivinhe um número: ");            
            numberUser = Integer.parseInt(scanner.nextLine());            
                       
        } while(!gerando(numberUser));
        
        System.out.println("Parabéns, você acertou o número\n");
    }
    
    public static boolean gerando(int numberUser) {
        Random random = new Random();
        int numberRandom = random.nextInt(100);
        System.out.println("\nNúmero aletatorio: " + numberRandom + "\n");
        if (numberUser != numberRandom) {
            System.out.println("Você errou, tente novamente\n");
            return false;
        }
        return true;
    }
}