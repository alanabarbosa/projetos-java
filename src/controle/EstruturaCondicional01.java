package controle;

import java.util.Scanner;

/**
 * Estrutura Condicional
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaCondicional01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno:");
        double nota = entrada.nextDouble();
        
        if (nota >= 7.0)
            System.out.println("Aluno aprovado!");
        else if (nota >= 5.0 && nota < 7.0)
            System.out.println("Aluno de recuperação!");
        else
            System.out.println("Aluno reprovado!");
        
        entrada.close();
    }
}
