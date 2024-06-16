package operadores;
/**
 * 
 *	@author @alanabarbosadev - Desenvolvedora Front End Jr
 *	Programação Orientada a Objetos
 *	Curso Engenharia de Software 3º semestre.
 *	@since 16/06/2024
 * 
 */
public class OperadoresLogicosDesafio {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = false;
        
        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean tomouSorvete = trabalho1 || trabalho2;
        boolean estaMaisSaudavel = !tomouSorvete;
        
        System.out.println("Comprou televisão de 50 polegadas: " + comprouTv50);
        System.out.println("Comprou televisão de 32 polegadas: " + comprouTv32);
        System.out.println("Tomou sorvete: " + tomouSorvete);
        System.out.println("Está mais saudável: " + estaMaisSaudavel);
    }
}
