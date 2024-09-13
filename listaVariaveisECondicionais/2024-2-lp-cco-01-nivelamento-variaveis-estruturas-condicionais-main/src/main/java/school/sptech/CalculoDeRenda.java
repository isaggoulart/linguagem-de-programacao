package school.sptech;

import java.util.Scanner;

public class CalculoDeRenda {
  public static void main(String[] args) {
    Scanner filhos = new Scanner(System.in);

    System.out.println( "Informe a quantidade de filhos:");
    System.out.println("De 0 a 3 anos:");
    Integer filhosZeroATres = filhos.nextInt();

    System.out.println("De 4 a 16:");
    Integer filhosQuatroADezesseis = filhos.nextInt();

    System.out.println("De 17 a 18:");
    Integer filhosDezesseteADezoito = filhos.nextInt();

    Integer qtdFilhos = filhosDezesseteADezoito + filhosQuatroADezesseis + filhosZeroATres;
    Double bolsa1 = filhosZeroATres * 25.12;
    Double bolsa2 = filhosQuatroADezesseis * 15.88;
    Double bolsa3 = filhosDezesseteADezoito * 12.44;
    Double bolsaTotal = bolsa1 + bolsa2 + bolsa3;

    System.out.println("Você tem um total de " + qtdFilhos + " filhos e vai receber R$" + bolsaTotal + " de bolsa");
  }
}