package school.sptech;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
        }
    }
}
