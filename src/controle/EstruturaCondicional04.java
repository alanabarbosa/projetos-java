package controle;
import java.util.Scanner;

/**
 * Estrutura Condicional - Calculadora IMC simples
 * 
 * @author Alana Barbosa - Desenvolvedora Front End
 * @since 07/01/2024 
 */
public class EstruturaCondicional04 {
    public static void main(String[] args) {
        System.out.println("Qual seu nome? ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Qual sua altura? ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println("Qual seu peso? Em kilos?");
        double weight = Double.parseDouble(scanner.nextLine());

        double calcIMC = weight / (height * height);

        if (calcIMC < 18.5) {
            System.out.printf("Seu IMC é de: %.2f%n", calcIMC);
            System.out.println("Atenção!! " + name + " Seu peso está abaixo do normal!!!");
            System.out.println("Procure um médico. Algumas pessoas têm um baixo "
                    + "peso por características do seu organismo e tudo bem. "
                    + "Outras podem estar enfrentando problemas, como desnutrição. "
                    + "É preciso saber qual é o caso");
        } else if (calcIMC >= 18.5 && calcIMC <= 24.9) {
            System.out.printf("Seu IMC é de: %.2f%n", calcIMC);
            System.out.println("Parabéns!! " + name + " Seu peso está normal!!!");
            System.out.println("Que bom que você está com o peso normal! E o melhor "
                    + "jeito de continuar assim é mantendo um estilo de "
                    + "vida ativo e uma alimentação equilibrada.");
        } else if (calcIMC >= 25.0 && calcIMC <= 29.9) {
            System.out.printf("Seu IMC é de: %.2f%n", calcIMC);
            System.out.println("Cuidado!! " + name + " Você está sobrepeso!!!");
            System.out.println("Ele é, na verdade, uma pré-obesidade e muitas pessoas "
                    + "nessa faixa já apresentam doenças associadas, como diabetes e "
                    + "hipertensão. Importante rever hábitos e buscar ajuda antes de, "
                    + "por uma série de fatores, entrar na faixa da obesidade pra valer.");
        } else if (calcIMC >= 30.0 && calcIMC <= 34.9) {
            System.out.printf("Seu IMC é de: %.2f%n", calcIMC);
            System.out.println("Tenha muita atenção!! " + name + " Você está com Obesidade grau I!!!");
            System.out.println("Sinal de alerta! Chegou a hora de se cuidar, mesmo que seus exames "
                    + "estejam normais. Vamos dar início a mudanças hoje! Cuide de sua alimentação. "
                    + "Você precisa iniciar um acompanhamento com nutricionista e/ou endocrinologista.");
        } else if (calcIMC >= 35.0 && calcIMC <= 39.9) {
            System.out.printf("Seu IMC é de: %.2f%n", calcIMC);
            System.out.println("Tenha muita atenção!! " + name + " Você está com Obesidade grau II!!!");
            System.out.println("Mesmo que seus exames aparentem estar normais, é hora de se cuidar, "
                    + "iniciando mudanças no estilo de vida com o acompanhamento próximo de "
                    + "profissionais de saúde.");
        } else if (calcIMC >= 40) {
            System.out.printf("Seu IMC é de: %.2f%n", calcIMC);
            System.out.println("Sua saúde está em perigo!! " + name + " Você está com Obesidade grau III!!!");
            System.out.println("Aqui o sinal é vermelho, com forte probabilidade de já existirem doenças muito graves "
                    + "associadas. O tratamento deve ser ainda mais urgente.");
        }
        
        scanner.close();
    }
}
