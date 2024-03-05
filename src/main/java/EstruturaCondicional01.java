
/**
 * Estrutura Concidiconal
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaCondicional01 {
    public static void main(String[] args) {
        int nota = 6;
        
        if (nota >= 7)
            System.out.println("Aluno aprovado!");
        else if (nota >= 5 && nota < 7)
            System.out.println("Aluno de recuperação!");                    
        else
            System.out.println("Aluno reprovado!");
    }
}
