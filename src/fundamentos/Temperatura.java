package fundamentos;
/**
 * 
 * @author @alanabarbosadev - Desenvolvedora Front End Jr
 * Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * @since 15/06/2024
 * 
 */
public class Temperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(celsius + " ºC");
	}
}
