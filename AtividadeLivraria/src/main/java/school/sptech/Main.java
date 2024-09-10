package school.sptech;


import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DatabaseConfiguration conexao = new DatabaseConfiguration();
        JdbcTemplate assistente = conexao.getTemplate();

        String sqlCreate = """
                CREATE TABLE IF NOT EXISTS livro (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    nome VARCHAR(200),
                    preco float
                )
                """;
        assistente.execute(sqlCreate);

        Scanner texto = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        LivroDao metodos = new LivroDao();

        for(;;) {
            System.out.println("+--------------------+");
            System.out.println("| Livraria SPTech    |");
            System.out.println("+--------------------+");
            System.out.println("| 1) Cadastrar livro |");
            System.out.println("| 2) Exibir livro    |");
            System.out.println("| 3) Atualizar livro |");
            System.out.println("| 4) Remover livro   |");
            System.out.println("| 5) Buscar por nome |");
            System.out.println("| 6) Sair            |");
            System.out.println("+--------------------+");

            Integer opcao = numero.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do livro a ser cadastrado:");
                String nome = texto.nextLine();
                System.out.println("Digite o preço do livro a ser cadastrado:");
                Double preco = numero.nextDouble();
                numero.nextLine();

                LivroEntity livro = new LivroEntity(nome, preco);
                metodos.cadastrarLivro(livro);
            } else if (opcao == 2) {
                System.out.println("Aqui estão os livros cadastrados: ");
                System.out.println("----------------------------------");
                metodos.exibirLivros();
            } else if (opcao == 3) {
                metodos.exibirLivros();
                System.out.println("Escolha o id do livro que você deseja alterar:");
                Integer id = numero.nextInt();
                System.out.println("Digite o novo nome:");
                String novoNome = texto.nextLine();
                System.out.println("Digite o novo preço:");
                Double novoPreco = numero.nextDouble();
                numero.nextLine();
                metodos.atualizarLivros(id, novoNome, novoPreco);
            } else if (opcao == 4) {
                metodos.exibirLivros();
                System.out.println("Escolha o id do livro que você deseja remover:");
                Integer id = numero.nextInt();
                metodos.removerLivro(id);
            } else if (opcao == 5) {
                System.out.println("Digite o nome do livro que quer encontrar:");
                String nome = texto.nextLine();
                metodos.buscarPorNome(nome);
            } else if (opcao == 6) {
                break;
            } else {
                System.out.println("Por favor, escolha uma opção válida!");
            }
        }
    }
}