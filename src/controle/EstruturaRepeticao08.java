
package controle;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
/**
 * EstruturaRepeticao07
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 09/01/2024 
 */
public class EstruturaRepeticao08 {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        double salarioBase = 2000.0;
        
        int totalSelecionados = 0;
        
        int proximoCandidato = 0;
        
        while (totalSelecionados < 5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: " + candidato);
            System.out.println("Sálario pretendido: " + salarioPretendido);
            
            if (salarioPretendido > salarioBase)
                System.out.println("Candidato não foi selecionado\n");
            else
                System.out.println("Candidato foi selecionado\n");
                totalSelecionados++;            
        }
        System.out.println("Total de selecionados: " + totalSelecionados);
        System.out.println("Total de consultados: " + proximoCandidato);        
    }
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
