package fundamentos;

/**
 * 
 * Autor @alanabarbosadev - Desenvolvedora Front End Jr
 * Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * 
 */
public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos números inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 3768;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;		
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo Caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status do funcionário: "+status);
	}
}
