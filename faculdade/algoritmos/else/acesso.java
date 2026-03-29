
import java.util.Scanner;

public class acesso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int adm;
        int chave;

        System.out.println("1 - Biometria");
        System.out.println("2 - Cartão");
        System.out.println("3 - ambos");
        System.out.println("4 - nenhum");
        System.out.println("qual dessas chaves de segurança você possui? ");
        chave = entrada.nextInt();

        if (chave == 4) {
            System.out.println("Acesso negado");
        } else if (chave == 3) {
            System.out.print("Acesso de Nível A liberado");
        } else if (chave == 1 || chave == 2) {
            System.out.println("1 - Sou admnistrador");
            System.out.println("2 - Não sou admnistrador");

            System.out.print("Você é admnistrador?");
            adm = entrada.nextInt();

            if (adm == 1) {
                System.out.println("acesso de nível B liberado");
            }
        }
        entrada.close();
    }

}