package school.sptech;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite a base desejada");
        Integer base = numero.nextInt();
        System.out.println("Digite o expoente desejado");
        Integer expoente = numero.nextInt();

        Integer resultado = base;

        if (expoente == 0) {
            System.out.println("O resultado da conta é 1");
        } else if (expoente == 1) {
            System.out.println("O resultado da conta é " + base);
        } else {
            for (Integer i = 1; i < expoente; i++) {
                resultado *= base;
            }
            System.out.println("O resultado da conta é " + resultado);
        }
    }
}
