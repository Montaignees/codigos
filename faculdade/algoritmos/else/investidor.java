
import java.util.Scanner;

public class investidor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int riscos;
        int retornos;

        System.out.println("Você aceita altos riscos de perda?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        System.out.print("Escolha o perfil que mais se adeque a você: ");
        riscos = entrada.nextInt();


        System.out.println("\nVocê busca qual tipo de retorno?");
        System.out.println("1 - Retornos elevados");
        System.out.println("2 - Retornos acima da inflação");

        System.out.print("Escolha o perfil que mais se adeque a você: ");
        retornos = entrada.nextInt();


        if (riscos == 1 && retornos == 1) {
            System.out.println("Seu perfil é Arrojado");
        } else if (riscos == 2 && retornos == 2) {
            System.out.println("Seu perfil é Moderado");
        } else {
            System.out.println("Seu perfil é Conservador");
        }

        entrada.close();
    }
}