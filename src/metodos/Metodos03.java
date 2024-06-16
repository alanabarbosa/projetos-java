package metodos;
/**
 * Metodos com parametro e com retorno
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class Metodos03 {
    public String welcome(String text) {
        return text;
    }
    
    public static void main(String[] args) {
        Metodos03 method = new Metodos03();
        String result = method.welcome("Olá, estou testando métodos com parâmetros e com retono usando Java!");
        System.out.println(result);
        
    }
}
