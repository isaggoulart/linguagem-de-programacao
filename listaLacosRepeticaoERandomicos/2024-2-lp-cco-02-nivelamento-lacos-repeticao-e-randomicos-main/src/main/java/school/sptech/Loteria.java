package school.sptech;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    System.out.println("Escolha um número entre 0 e 10:");
    Integer numeroEscolhido = numero.nextInt();

    Integer i;
    Integer tentativas = 0;
    do {
      i = ThreadLocalRandom.current().nextInt(0,11);
      tentativas++;
    } while (i != numeroEscolhido);

    if (tentativas <= 3) {
      System.out.println("Você é muito sortudo. Seu acerto aconteceu em: " + tentativas + " tentativas");
    } else if (tentativas <= 10) {
      System.out.println("Você é sortudo. Seu acerto aconteceu em: " + tentativas + " tentativas");
    } else {
      System.out.println("É melhor você parar de apostar e ir trabalhar. Seu acerto aconteceu em: "+ tentativas + " tentativas");
    }

  }
}