package school.sptech;

public class LivroEntity {
    private Integer id;
    private String nome;
    private Double preco;

    public LivroEntity(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public LivroEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
