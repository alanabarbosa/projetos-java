package fundamentos;

import java.util.Scanner;

/**
 * Recebendo entrada do usuário com Scanner
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024
 */
public class EntradaUsuario {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        
        Scanner scanner = new Scanner(System.in);        
        
        String entry = scanner.nextLine();
        
        System.out.println("Seja bem vindo(a) " + entry);
        
        scanner.close();        
    }
}
