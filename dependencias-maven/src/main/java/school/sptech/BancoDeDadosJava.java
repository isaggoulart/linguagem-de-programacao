package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class BancoDeDadosJava {
    public static void main(String[] args) {
        /*
        JDBC - Java Database Connectivity
            - primeira dependência criada para conectar JAVA no BD
            - essa ideia deu origem a várias outras dependências que abstraem ainda mais o processo

        JDBC - mais rudimetar (foi o primeiro)
        Spring JDBC - meio-termo (mas ainda assim é fácil de usar)
        JPA - alto nível de abstração

        H2 - banco embarcado para devs (JAVA)
        */

        DatabaseConfiguration conexao = new DatabaseConfiguration();
        JdbcTemplate assistente = conexao.getTemplate();

        String sqlCreate = """
            CREATE TABLE IF NOT EXISTS filme (
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(255),
                diretor VARCHAR(255)
            )
            """;
        assistente.execute(sqlCreate);
/*
        String nome = "O Poderoso Chefão";
        String diretor = "Francis Ford Coppola";

        String sqlInsert = "INSERT INTO filme (nome, diretor) VALUES (?, ?)";

        assistente.update(sqlInsert, nome, diretor);
*/
        //List<Map<String, Object>> maps = assistente.queryForList("select * from filme");

        List<Filme> filmes = assistente.query("select * from filme", new BeanPropertyRowMapper<>(Filme.class));

        for(Filme filmeDaVez : filmes) {
            System.out.println("Nome: " + filmeDaVez.getNome());
            System.out.println("Diretor: " + filmeDaVez.getDiretor());
        }



    }
}
