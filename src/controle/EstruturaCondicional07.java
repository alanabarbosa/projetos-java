package controle;
import java.util.Scanner;
/**
 * EstruturaRepeticao06
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 16/06/2024
 */
public class EstruturaCondicional07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana");
        String diasSemana = entrada.nextLine();       
        
        
        if (diasSemana.equalsIgnoreCase("domingo")) {
        	System.out.println("Esse é o dia 1 da semana");
        } else if (diasSemana.equalsIgnoreCase("segunda")) {
        	System.out.println("Esse é o dia 2 da semana");
        } else if (diasSemana.equalsIgnoreCase("terça")) {
        	System.out.println("Esse é o dia 3 da semana");
        } else if (diasSemana.equalsIgnoreCase("quarta")) {
        	System.out.println("Esse é o dia 4 da semana");
        } else if (diasSemana.equalsIgnoreCase("quinta")) {
        	System.out.println("Esse é o dia 5 da semana");
        } else if (diasSemana.equalsIgnoreCase("sexta")) {
        	System.out.println("Esse é o dia 6 da semana");
        } else if (diasSemana.equalsIgnoreCase("sábado")) {
        	System.out.println("Esse é o dia 7 da semana");
        }
        
        entrada.close();
    }
}
