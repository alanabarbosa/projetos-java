import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * EstruturasExcepcionais02
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 09/01/2024 
 */
public class EstruturasExcepcionais02 {
       public static void main(String[] args) throws IOException {
           Path path = Paths.get("/home/alanabarbosa/Documents/testando.txt");           
           
           try {
               readFile(path);
           } catch (IOException e) {
              System.out.println("Erro: " + e.getMessage());
           }       
       }
       public static boolean readFile(Path path) throws IOException {
           if(Files.exists(path)) {
               Files.lines(path).forEach(System.out::println);
               return true;
           }
           else {
                throw new IOException("O arquivo " + path + " não existe");  
           }
       }
}
