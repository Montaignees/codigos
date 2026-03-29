
public class relogio {
    public static void main(String[] args) {
        int somaHora;
        int somaMin;

        for (int hora = 0; hora <= 23; hora++) {

            for (int min = 0; min <= 59; min++) {

                somaHora = (hora / 10) + (hora % 10);
                somaMin = (min / 10) + (min % 10);

                if (somaHora == somaMin) {
                    System.out.println(hora + ":" + min);
                }
            }
        }
    }
}
