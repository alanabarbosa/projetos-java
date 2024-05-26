import java.util.Scanner;
/**
 * EstruturaCondicional06
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 09/01/2024 
 */
public class EstruturaCondicional06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int salarioBase = 2000;        
        
        System.out.println("Qual salário você seja receber? ");
        
        int salarioPretendido = Integer.parseInt(scanner.nextLine());     
        
        case1(salarioBase, salarioPretendido);
        
    }
    public void case1(int salarioBase, int salarioPretendido) {
        if (salarioBase > salarioPretendido) 
            System.out.println("Ligar para o canditado");
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o canditado, com contra proposta");
        else
            System.out.println("Aguardando resultado dos demais canditados");    
    }
}
