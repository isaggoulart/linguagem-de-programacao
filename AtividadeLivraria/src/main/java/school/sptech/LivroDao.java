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

    public void cadastrarLivro(LivroEntity livro){
        String nome = livro.getNome();
        Double preco = livro.getPreco();

        String sqlInsert = "INSERT INTO livro (nome, preco) VALUES (?, ?)";
        assistente.update(sqlInsert, nome, preco);
    }

    public void exibirLivros () {
        List<LivroEntity> query = assistente.query("SELECT * from livro", new BeanPropertyRowMapper<>(LivroEntity.class));

        for (LivroEntity livroDaVez : query) {
            System.out.println("ID do livro: " + livroDaVez.getId());
            System.out.println("Nome do livro: " + livroDaVez.getNome());
            System.out.println("Preço do livro: " + livroDaVez.getPreco());
            System.out.println("--------------------------");
        }
    }


    public void atualizarLivros (Integer id, String novoNome, Double novoPreco) {
        Integer contador = 0;
        List<LivroEntity> query = assistente.query("select * from livro", new BeanPropertyRowMapper<>(LivroEntity.class));

        for (LivroEntity livroDaVez : query) {

            if(livroDaVez.getId() == id) {
                contador++;
                String sqlUpdate = "Update livro set nome = ?, preco = ? where id = ?";
                assistente.update(sqlUpdate, novoNome, novoPreco,id);
                System.out.println("A atualização foi realizada com sucesso!");
            }
        }
        if (contador == 0) {
            System.out.println("Parece que o livro que você escolheu aida não está cadastrado :(");
        }
    }


   public void removerLivro(Integer id) {
        Integer contador = 0;
       List<LivroEntity> query = assistente.query("select * from livro", new BeanPropertyRowMapper<>(LivroEntity.class));

       for (LivroEntity livroDaVez : query) {
           if (livroDaVez.getId() == id) {
               contador++;
               String sqlDelete = "Delete from livro where id = ?";
               assistente.update(sqlDelete, id);
               System.out.println("O livro foi removido com sucesso!");
           }
       }
       if (contador == 0) {
           System.out.println("Ops! Parece que você quer excluir um livro que não está cadastrado");
       }
   }


   public void buscarPorNome(String nome) {
       Integer contador = 0;
       List<LivroEntity> query = assistente.query("select * from livro", new BeanPropertyRowMapper<>(LivroEntity.class));

       for (LivroEntity livroDaVez : query) {
           if ((livroDaVez.getNome()).equalsIgnoreCase(nome)) {
               contador ++;
               System.out.println("Aqui estão as informações do livro escolhido: ");
               System.out.println("ID do livro: " + livroDaVez.getId());
               System.out.println("Nome do livro: " + livroDaVez.getNome());
               System.out.println("Preço do livro: " + livroDaVez.getPreco());
           }
       }
       if (contador == 0) {
           System.out.println("Parece que este livro ainda não está cadastrado");
       }
   }

}
