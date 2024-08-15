package school.sptech;

import java.util.Scanner;

public class ComparacaoTexto {
    public static void main(String[] args) {
        System.out.println("Digite um nome: ");
        Scanner leitor = new Scanner(System.in);
        String nome1 = leitor.nextLine();
        String nome2 = "Isabela";

        // essa comparação é feita com endereços de memória, por isso não funciona com o Scanner
        // essa propriedade é peculiar de strings, números são comparados com valores;
//        if (nome1 == nome2) {
//            System.out.println("nomes são iguais");
//        } else {
//            System.out.println("nomes não são iguais");
//        }

        // versão que funciona
        //equalsIgnoreCase() -> essa função faz com que o comparativo dos textos não seja Case Sensitive;

        if (nome1.equals(nome2)) {
            System.out.println("nomes são iguais");
        } else {
            System.out.println("nomes não são iguais");
        }
    }
}