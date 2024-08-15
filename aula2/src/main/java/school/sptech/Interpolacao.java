package school.sptech;

public class Interpolacao {
    public static void main(String[] args) {
        //Em JS é possível interpolar usando `${}`

        String filme = "Titanic";
        Integer anoLancamento = 1998;
        Double bilheteria = 10124.50;

        // Concatenação (+)
        String frase1 = "Nome filme: " + filme + " Ano de lançamento: " + anoLancamento;
        System.out.println(frase1);

        String frase2 = String.format("Nome: %s Ano de lançamento: %d Bilheteria: %.1f",
                filme, anoLancamento, bilheteria);
        System.out.println(frase2);

        String frase3 = "Nome: %s Ano de lançamento: %d Bilheteria: %.1f"
                .formatted(filme, anoLancamento, bilheteria);
        System.out.println(frase3);

        String textoMaior = """
                Filme: %s
                Ano de lançamento: %d
                Bilheteria: %f
                """.formatted(filme,anoLancamento,bilheteria);
        System.out.println(textoMaior);
    }
}
