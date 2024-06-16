package operadores;
/**
 * 
 * Autor @alanabarbosadev - Desenvolvedora Front End Jr
 *Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * 
 */
public class OperadoresLogicos {
    public static void main(String args[]) {
        boolean condicao1=true;
        boolean condicao2=false;        

        System.out.println(condicao1 && condicao2);
        System.out.println("O operador AND precisa que os dois valores sejam verdadeiros\n");
        
        System.out.println(condicao1 || condicao2);
        System.out.println("O operador OU precisa que pelo menos um seja verdadeiro\n");
               
        System.out.println(condicao1 ^ condicao2);
        System.out.println("O operador XOR precisa que os valores sejam diferentes\n");
        
        System.out.println(!condicao1);
        System.out.println("O operador NOT nega o valor");
        
    }
}
