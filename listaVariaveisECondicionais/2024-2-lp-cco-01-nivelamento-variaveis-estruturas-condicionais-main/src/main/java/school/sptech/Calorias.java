package school.sptech;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        Scanner minutos = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeUsuario = nome.nextLine();

        System.out.println("Digite a quantidade de minutos do treino que você passou:");
        System.out.println("Se aquecendo");
        Integer aquecimento = minutos.nextInt();
        System.out.println("Realizando exercícios aeróbicos");
        Integer aerobico = minutos.nextInt();
        System.out.println("Realizando exercícios de musculação");
        Integer musculacao = minutos.nextInt();

        Integer totalMinutos = aquecimento + musculacao +aerobico;
        Integer caloriasAquecimento = aquecimento * 12;
        Integer caloriasAerobico = aerobico * 20;
        Integer caloriasMusculacao = musculacao * 25;
        Integer totalCalorias = caloriasAerobico + caloriasAquecimento + caloriasMusculacao;

        String fraseFinal = String.format("Olá, %s, você fez um total de %d minutos de exercício e perdeu cerca de %d calorias", nomeUsuario, totalMinutos, totalCalorias);
        System.out.println(fraseFinal);
    }
}
