package fundamentos;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * 
 * Autor @alanabarbosadev - Desenvolvedora Front End Jr
 * Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * 
 */
public class ScreenSize {
    public static void main(String args[]) {
        Dimension tk = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int) tk.getWidth();
        int height = (int) tk.getHeight();
        
        System.out.println("Largura:" + width);
        System.out.println("Altura:" + height);
    }
}
