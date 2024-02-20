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
        
        if (condicao1 && condicao2) 
               System.out.println("False");
               System.out.println("Os dois valores precisam ser verdadeiros!!!");
        
        if (condicao1 || condicao2)
               System.out.println("Verdadeiro");
               System.out.println("Um dos valores precisa ser verdadeiro!!!");
    }
}
