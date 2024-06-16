package controle;
import java.util.Scanner;
/**
 * Estrutura Concidiconal - Calculadora simples
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaCondicional05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1 - Javascript");
        System.out.println("2 - Java");
        System.out.println("3 - PHP");
        System.out.println("4 - Python");
        System.out.println("5 - C#");
        System.out.println("Escolha de 1 a 5 :");
        
        int choice = Integer.parseInt(scanner.nextLine());
        
        switch (choice) {
            case 1:
                System.out.println("JavaScript é uma linguagem de script amplamente utilizada no desenvolvimento web. Executada nos navegadores, torna as páginas interativas. Orientada a objetos e assíncrona, trabalha em conjunto com HTML e CSS.");
                break;
           case 2:
                System.out.println("Java é uma linguagem de programação de propósito geral, conhecida por sua portabilidade. Amplamente usada em aplicações empresariais e móveis (Android), destaca-se pela robustez e suporte à concorrência.");
                break;
           case 3:
                System.out.println("PHP é uma linguagem de script do lado do servidor, especialmente projetada para desenvolvimento web. Facilita a integração com HTML e é comumente usada para processamento de páginas PHP em servidores web.");    
                break;
           case 4:
                System.out.println("Python é uma linguagem versátil, aplicável em diversas áreas como desenvolvimento web, automação, ciência de dados e aprendizado de máquina. Sua sintaxe clara e vasta biblioteca padrão a tornam popular.");   
                break;                
           case 5:
                System.out.println("C# é uma linguagem de programação geral, associada ao desenvolvimento na plataforma Microsoft. Usada para criar aplicações desktop, web e jogos (Unity), é orientada a objetos e parte do ecossistema .NET."); 
           default:
                System.out.println("Número inválido");                 
                
        }
        
        
    }
}
