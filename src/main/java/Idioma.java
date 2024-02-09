import java.util.Locale;
/**
 * 
 * Autor @alanabarbosadev - Desenvolvedora Front End Jr
 *Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * 
 */
public class Idioma {
    public static void main(String args[]) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
    }
}
