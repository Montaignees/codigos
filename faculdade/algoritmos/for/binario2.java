
import java.util.Scanner;

public class binario2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int decimal = leitor.nextInt();

        int base = 1;

        
        for (; base <= decimal; base *= 2);

        
        base /= 2;

        
        for (; base > 0; base /= 2) {
            if (decimal >= base) {
                System.out.print(1);
                decimal -= base;
            } else {
                System.out.print(0);
            }
        }

        leitor.close();
    }
}