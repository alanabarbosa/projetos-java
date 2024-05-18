import java.util.Scanner;
/**
 * Estrutura de Repetição
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaRepeticao02 {
    public static void main(String[] args) {
        String alunos[] = { "Pedro", "Jonas", "Maria", "Carlos", "Lucas", "Betania", "Paula", "Julia" };
        
        for(int index=0; index<alunos.length ; index ++) {
            System.out.println(index + " - " + alunos[index]);
        }
    }
}
