package school.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Escolha um número entre 1 e 100 para o sorteio");
        Integer numeroEscolhido = numero.nextInt();
        Integer numeroSorteado;

        Integer pares = 0;
        Integer impares = 0;
        Integer primeiroAcerto = 0;

        for(Integer i = 1; i <= 200; i++) {
           numeroSorteado = ThreadLocalRandom.current().nextInt(1,101);

           if (numeroSorteado % 2 == 0) {
               pares++;
           } else{
               impares++;
           }

           if (numeroSorteado == numeroEscolhido && primeiroAcerto == 0) {
               primeiroAcerto++;
               System.out.println("O número escolhido foi sorteado pela primeira vez na " + i + "ª tentativa.");
           }
        }
        String fraseFinal = String.format("Em 200 sorteios, %d números pares foram sorteados e %d números ímpares foram sorteados", pares, impares);
        System.out.println(fraseFinal);
    }
}
