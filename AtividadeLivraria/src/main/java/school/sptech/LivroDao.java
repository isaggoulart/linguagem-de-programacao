package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class LivroDao {
    DatabaseConfiguration conexao;
    JdbcTemplate assistente;

    public LivroDao() {
        this.conexao = new DatabaseConfiguration();
        this.assistente = conexao.getTemplate();
    }

    public Integer cadastrarLivro(LivroEntity livro){
        String nome = livro.getNome();
        Double preco = livro.getPreco();

        String sqlInsert = "INSERT INTO livro (nome, preco) VALUES (?, ?)";
        assistente.update(sqlInsert, nome, preco);
        return 0;
    }

    public Integer exibirLivros () {
        List<LivroEntity> query = assistente.query("select * from livros", new BeanPropertyRowMapper<>(LivroEntity.class));

        for (LivroEntity livroDaVez : query) {
            System.out.println("ID do livro: " + livroDaVez.getId());
            System.out.println("Nome do livro: " + livroDaVez.getNome());
            System.out.println("Preço do livro: " + livroDaVez.getPreco());
            System.out.println("---------------");
        }
        return 0;
    }


    public Integer atualizarLivros (Integer id, String novoNome, Double novoPreco) {
        List<LivroEntity> query = assistente.query("select * from livros", new BeanPropertyRowMapper<>(LivroEntity.class));

        for (LivroEntity livroDaVez : query) {

            if(livroDaVez.getId() == id) {

                String sqlUpdate = "Update livros set nome = ?, preco = ? where id = ?";
                assistente.update(sqlUpdate, novoNome, novoPreco,id);
            }
        }

        return 0;
    }

   public Integer removerLivro(Integer id) {
       List<LivroEntity> query = assistente.query("select * from livros", new BeanPropertyRowMapper<>(LivroEntity.class));

       for (LivroEntity livroDaVez : query) {
           if (livroDaVez.getId() == id) {
               String sqlDelete = "Delete from livro where id = ?";
               assistente.update(sqlDelete, id);
           }
       }
       return 0;
   }




}
