package school.sptech;


import org.springframework.jdbc.core.JdbcTemplate;

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
    }
}