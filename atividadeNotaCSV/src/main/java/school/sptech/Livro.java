package school.sptech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Livro {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("author")
    private String autor;

    @JsonProperty("month")
    private Integer mes;

    @JsonProperty("day")
    private Integer dia;

    @JsonProperty("year")
    private Integer ano;

    @JsonProperty("publisher")
    private String editora;

    @JsonProperty("price")
    private Double preco;

    @JsonProperty("rating")
    private Double nota;

    public Livro(String nome, String autor, Double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro() {
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getDataFormatada() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = formatador.format(LocalDate.of(this.ano, this.mes, this.dia));
        return dataFormatada;
    }

    public String getPrecoComDesconto() {
            Double novoPreco = preco * 0.9;
            return String.format("%.2f", novoPreco);

    }

    public String getPrecoFormatado() {
        return String.format("%.2f", this.preco);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", mes=" + mes +
                ", dia=" + dia +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                ", preco=" + preco +
                ", nota=" + nota +
                '}';
    }
}
