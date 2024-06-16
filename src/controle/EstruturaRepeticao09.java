package controle;
import java.util.Random;
/**
 * EstruturaRepeticao07
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 09/01/2024 
 */
public class EstruturaRepeticao09 {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};        
        
       
        for (String candidato : candidatos) {
            case3(candidato);
        }
    }
    public static void case3(String candidato) {
        
        int tentativas = 1;
        boolean atendeu = false;
        boolean tentarNovamente = true;
        
        do {
            System.out.println("\nLigando...\n");
            atendeu=atender();
            tentarNovamente = !atendeu;
            
            if (tentarNovamente)
                tentativas ++;
            else
                System.out.println("Contato realizado com sucesdo!");
            
        } while(tentarNovamente && tentativas < 3);
        
        if (atendeu) 
             System.out.println("Conseguimos contato com o " + candidato + ", após " + tentativas + " tentativas\n");
        else
             System.out.println("Não conseguimos contato com o " + candidato + ", após " + tentativas + " tentativas\n");
    }
    public static boolean atender() {
        return new Random().nextInt(3)==1;     
    }
}
