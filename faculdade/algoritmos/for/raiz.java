
import java.util.Scanner;

public class raiz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = leitor.nextInt();

        int soma;
        int digito;

        for (; numero >= 10;) {
            soma = 0;
            for (; numero > 0; numero /= 10) {
                digito = numero % 10;
                soma += digito;
            }
            numero = soma;
        }

        System.out.println("A raiz digital é: " + numero);

        leitor.close();
    }
}
