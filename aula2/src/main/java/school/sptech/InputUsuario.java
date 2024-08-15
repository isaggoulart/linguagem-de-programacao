package school.sptech;

import java.util.Scanner;

public class InputUsuario {
    public static void main(String[] args) {
        // objeto do tipo Scanner;
        // um obj tem comportamentos e características de objetos da vida real;
        // o Scanner é um objeto pronto que pode ser utilizado para que eu crie meus próprios métodos;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String valorDigitado = leitor.nextLine();
        System.out.println("Olá, " + valorDigitado);

        System.out.println("Agora, digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        System.out.println("Sua idade é: " + idadeDigitada);

        // usar so o next() não pega caracteres depois do espaço (o sobrenome de uma pessoa, por ex.);

//        System.out.println("Digite novamente seu nome: ");
//        String valorDigitado2 = leitor.next();
//        System.out.println("Seu nome é " + valorDigitado2);

    }
}