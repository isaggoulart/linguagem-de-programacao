package school.sptech;

public class Condicionais {
    public static void main(String[] args) {
        /*
        Projetos Java tem pelo menos um métodos main (entrypoint);
        Geralmente só usamos um main por projeto na vida real;
         */

        Integer idade = 31;
        Boolean isMaiorDeIdade = idade>= 18;

        if(isMaiorDeIdade) {
            System.out.println("É maior de idade" );
        } else {
            System.out.println("É menor de idade" );
        }

//        String resultadoFormatado = isMaiorDeIdade ? "é maior de idade" : "não é maior de idade";
//        System.out.println(resultadoFormatado);

        /*
        OPERADORES EM JAVA
        = atribuição
        == igualdade
        > < >= <= maior, menor, maior ou igual, menor ou igual
        != diferente de
        && and
        || or
        ! not

        ++ adiciona 1
        += pega o valor anterior e acescenta algo
        -- subtrai 1
        Math.pow() potência
        + - * / mais menos, multiplicação, divisão
        % resto
         */

        //  SWITCH CASE
        Integer opcao = 23;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}