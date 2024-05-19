import java.util.Scanner;
/**
 * Estrutura de Repetição
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaRepeticao03 {
     public static void main(String[] args) {
        String alunos[] = { "Pedro", "Jonas", "Maria", "Carlos", "Lucas", "Betania", "Paula", "Julia", "Carlos", "Alana", "Emily", "Bryan", "Carlos", "Carlos" };
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nome de um aluno: ");
        
        String name = scanner.nextLine();
        
        int count = 0;
        
        for(int index=0; index<alunos.length ; index ++) {
            if (alunos[index].equals(name)) {
                count +=1;           
            }            
        }
        
        if (count > 0) {
            System.out.println("Existe " + count + " aluno com esse nome");
        } else {
            System.out.println("Não existe um aluno com esse nome");
        }        
    }   
}
