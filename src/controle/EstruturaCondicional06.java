package controle;
import java.util.Scanner;

public class EstruturaCondicional06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int salarioBase = 2000;        
        
        System.out.println("Qual salário você deseja receber? ");
        
        int salarioPretendido = Integer.parseInt(scanner.nextLine());     
        
        case1(salarioBase, salarioPretendido);
    }
    
    public static void case1(int salarioBase, int salarioPretendido) {
        if (salarioBase > salarioPretendido) 
            System.out.println("Ligar para o candidato");
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato, com contra proposta");
        else
            System.out.println("Aguardando resultado dos demais candidatos");    
    }
}
