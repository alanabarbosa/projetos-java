package controle;
import java.util.Scanner;
/**
 * EstruturaRepeticao06
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaRepeticao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String valor;
        String secrect = "entrar";
        
        do {            
            System.out.println("Qual a palavra secreta para entrar no sistema?");            
            valor = entrada.nextLine();            
        } while(!valor.equalsIgnoreCase(secrect));
        
        System.out.println("Bem vindo ao sistema");
        
        entrada.close();
    }
}