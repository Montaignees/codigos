
import java.util.Scanner;

public class inverter {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = leitor.nextInt();

        int inverso = 0;

        for (; numero > 0; numero /= 10) { 
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            
        }

        System.out.println("O inverso do numero é: " + inverso);

        leitor.close();
    }
}