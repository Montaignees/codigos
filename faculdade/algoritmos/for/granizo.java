
import java.util.Scanner;

public class granizo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1;

        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();

        System.out.print("A sequência de Collatz do número: " + n1 + " é: " + n1 + ", ");

        for (; n1 > 1;) {
            if (n1 % 2 == 0) {
                n1 /= 2;
                System.out.print(n1 + ", ");
            } else {
                n1 *= 3;
                n1++;
                System.out.print( + n1 + ", ");
            }
        }
        entrada.close();
    }

}
