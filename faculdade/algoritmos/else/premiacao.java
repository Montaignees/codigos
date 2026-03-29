import java.util.Scanner;
public class premiacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double volume;
        int produtos;

        System.out.print("qual é o seu volume de vendas? ");
        volume = entrada.nextDouble();

        System.out.print("quantos produtos você vendeu? ");
        produtos = entrada.nextInt();

        if(volume > 100000){
            System.out.print("Você ganhou um bonus de 10% no seu salário.");
        } else if (volume <= 50000 && volume <= 100000 && produtos > 10 ){
            System.out.print("Você ganhou um bonus de 5% em suas vendas");
        } else if (volume <= 50000 && volume <= 100000 && produtos <= 10 ){
            System.out.print("Você ganhou um bonus de 2% em suas vendas");
        } else if (volume <50000){
            System.out.print("Você ganhou um bonus de 0% em suas vendas");
        }
    entrada.close();
    }
}
