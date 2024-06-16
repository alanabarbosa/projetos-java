package operadores;
/**
 * 
 * @author @alanabarbosadev - Desenvolvedora Front End Jr
 *	Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * @since 16/06/2024
 * 
 */
public class OperadoresAritimeticosDesafio {
	public static void main(String[] args) {
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;		
		System.out.println("O resultado é: " + resultado);		
	}
}
