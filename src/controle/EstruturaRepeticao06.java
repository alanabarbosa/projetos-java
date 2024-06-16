package controle;

import java.util.Scanner;

/**
 * EstruturaRepeticao06
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaRepeticao06 {
    public static void main(String[] args) {
        System.out.println("Digite uma senha: ");
        Scanner scanner = new Scanner(System.in);

        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$";
        String password = scanner.nextLine();
        
        while (password.length() > 0) {
            if (password.matches(regex)) {
                System.out.println("A senha atende os requisitos");
                break;
            } else {
                System.out.println("A senha não atende os requisitos, tente novamente");  
                password = scanner.nextLine();            
            }
        }

        scanner.close();
    }
}