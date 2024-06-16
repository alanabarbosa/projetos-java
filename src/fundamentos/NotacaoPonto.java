package fundamentos;
/**
 * 
 * @author @alanabarbosadev - Desenvolvedora Front End Jr
 * Programação Orientada a Objetos
 * Curso Engenharia de Software 3º semestre.
 * @since 15/06/2024
 * 
 */
public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia";
        
        // Convertendo para maiúsculas
        System.out.println(s.toUpperCase());
        
        // Convertendo para minúsculas
        System.out.println(s.toLowerCase());
        
        // Substituindo caracteres
        System.out.println(s.replace("a", "u"));
        
        // Concatenando strings
        System.out.println(s.concat(" flor do dia"));
        
        // Comprimento da string
        System.out.println(s.length());
        
        // Verificando se a string começa com um prefixo
        System.out.println(s.startsWith("Bom"));
        
        // Verificando se a string termina com um sufixo
        System.out.println(s.endsWith("dia"));
        
        // Verificando se a string contém uma sequência de caracteres
        System.out.println(s.contains("noite"));
        
        // Obtendo um caractere específico
        System.out.println(s.charAt(4));
        
        // Obtendo o índice de um caractere ou substring
        System.out.println(s.indexOf("dia"));
        
        // Verificando se a string está vazia
        System.out.println(s.isEmpty());
        
        // Removendo espaços em branco nas extremidades
        String s2 = "  Bom dia  ";
        System.out.println(s2.trim());
        
        // Comparando strings
        String s3 = "Bom dia";
        System.out.println(s.equals(s3));
        
        // Comparando strings ignorando maiúsculas e minúsculas
        String s4 = "bom DIA";
        System.out.println(s.equalsIgnoreCase(s4));
        
        // Substring (obtendo parte da string)
        System.out.println(s.substring(4));
        System.out.println(s.substring(0, 3));
    }
}
