package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer soma = 0;
        Integer numSorteado;

        do {
            numSorteado = ThreadLocalRandom.current().nextInt(0,11);
            soma += numSorteado;
        } while (numSorteado != 0);

        System.out.println("A soma dos números é " + soma);
    }
}





