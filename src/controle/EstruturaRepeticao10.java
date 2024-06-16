package controle;

public class EstruturaRepeticao10 {
    public static void main(String[] args) {
        String valor = "*****";
        String valor2 = "*";
        String cerquilha = "#";
        
        for(valor2.length(); valor2.length() <= valor.length(); valor2 += "*") {
            System.out.println(cerquilha);
            cerquilha += "#";
        }
    }
}
