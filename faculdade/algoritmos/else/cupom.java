
import java.util.Scanner;

public class cupom {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valor;
        int vip;
        int liquidacao;

        System.out.print("Digite o valor da compra: ");
        valor = entrada.nextInt();

        System.out.print("você é um cliente VIP?");
        vip = entrada.nextInt();

        System.out.println("1 - Sim sou um cliente VIP");
        System.out.println("2 - Não sou um cliente VIP");

        System.out.print("o produto está marcado como liquidação? ");
        liquidacao = entrada.nextInt();

        System.out.println("1 - Sim, está marcado");
        System.out.println("2 - Não está marcado");

        if (liquidacao == 1) {
            System.out.print("desconto não é aplicavel ao produto");
        } else if (valor > 200 || vip == 1) {
            System.out.print("desconto aceito. o valor a ser pago é" + valor * 0.85 + "R$");
        } else
            System.out.print("desconto não é aplicavel ao produto");

        entrada.close();
    }

}
