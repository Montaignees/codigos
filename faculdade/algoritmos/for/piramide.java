
import java.util.Scanner;
public class piramide {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tamanho da pirâmide: ");

        int g = leitor.nextInt();
        int s = 0;

        for (int i = 1; i <= g; i++) {
            s = 0;

            for (s = 0; s < g - i; s++) {
                System.out.print(" ");
            }
            for (s = i - 1; s > 0; s--) {
                System.out.print(s);
            }
            for (s = 2; s < i; s++) {
                System.out.print(s);
            }
            System.out.println("");
            leitor.close();
        }

    }

}
