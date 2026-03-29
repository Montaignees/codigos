package For;
public class numerosAmigaveis {
    public static void main(String[] args) {

        int digito;
        int numero;
        int soma;

        for (int i = 100; i <= 999; i++) {
            numero = i;
            soma = 0;

            for (int save = i; save > 0; save /= 10) {
                digito = save % 10;
                soma += digito * digito * digito;
            }
            if (soma == numero) {
                System.out.print(numero + ", ");
            }
        }
    }
}
