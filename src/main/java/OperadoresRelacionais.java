/*
 * 
 * Autor @alanabarbosadev - Desenvolvedora Front End Jr
 *Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * 
 */
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int number1 = 40;
        int number2 = 55;
        
        if (number1 > number2) {
            System.out.println(number1 + " é maior que " + number2);
        } else {
            System.out.println(number1 + " não é maior que " + number2);
        }
        
        if (number1 < number2) {
            System.out.println(number1 + " é menor que " + number2);
        } else {
            System.out.println(number1 + " não é menor que " + number2);
        }

        if (number1 >= number2) {
            System.out.println(number1 + " é maior ou igual que " + number2);
        } else {
            System.out.println(number1 + " não é maior ou igual que " + number2);
        }
        
        if (number1 <= number2) {
            System.out.println(number1 + " é menor ou igual que " + number2);
        } else {
            System.out.println(number1 + " não é menor ou igual que " + number2);
        }  
        
        if (number1 != number2) {
            System.out.println(number1 + " é diferente de " + number2);
        } else {
            System.out.println(number1 + " não é diferente de " + number2);
        }         
    }
}
