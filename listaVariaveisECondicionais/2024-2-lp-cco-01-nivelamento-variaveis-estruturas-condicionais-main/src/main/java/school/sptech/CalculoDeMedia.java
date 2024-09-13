package school.sptech;

import java.util.Scanner;

public class CalculoDeMedia {
    public static void main(String[] args) {
        Scanner nomeUsuario = new Scanner(System.in);
        Scanner numeroReal = new Scanner(System.in);

        System.out.println("Bem-vindo(a). Por favor, informe seu nome:");
        String nome = nomeUsuario.nextLine();
        System.out.println("Informe a primeira nota:");
        Double nota1 = numeroReal.nextDouble();
        System.out.println("Informe a segunda nota:");
        Double nota2 = numeroReal.nextDouble();

        Double media = (nota1 + nota2)/2;
        String fraseFinal = String.format("Olá %s. Sua média foi de %f", nome, media);
        System.out.println(fraseFinal);
    }
}
