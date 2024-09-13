package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer numeroSorteado;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        String ganhador;

        for (Integer i = 1; i <= 10; i++) {
            numeroSorteado = ThreadLocalRandom.current().nextInt(1,4);

            if (numeroSorteado == 1) {
                mussarela++;
            } else if (numeroSorteado == 2) {
                calabresa++;
            } else {
                quatroQueijos++;
            }
        }

        if (mussarela > calabresa && mussarela > quatroQueijos) {
           ganhador = "A pizza de mussarela é a favorita";
        }
        else if (calabresa > mussarela && calabresa > quatroQueijos) {
            ganhador = "A pizza de calabresa é a favorita";
        } else {
            ganhador = "A pizza de quatro queijos é a favorita";
        }
        System.out.println(ganhador);

        String mostrarVotos = String.format("Mussarela teve %d votos, calabresa teve %d votos e quatro queijos teve %d votos", mussarela, calabresa, quatroQueijos);
        System.out.println(mostrarVotos);
    }
}
