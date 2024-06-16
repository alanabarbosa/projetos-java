package fundamentos;

import java.util.Locale;

/**
 * 
 * Autor @alanabarbosadev - Desenvolvedora Front End Jr
 * Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * 
 */
public class Idioma {
    public static void main(String args[]) {
        try {
            Locale loc = Locale.getDefault();
            System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
        } catch (SecurityException e) {
            System.err.println("Erro ao acessar o idioma do sistema: " + e.getMessage());
        }
    }
}
