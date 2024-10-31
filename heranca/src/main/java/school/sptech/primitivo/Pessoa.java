package school.sptech.primitivo;

public class Pessoa {
    private String nome; // NÃO TEM TIPO PRIMITIVO PQ É UM VETOR DE CARACTERES
    private Integer idade; // poderia ser int
    private Double altura;
    private Boolean maiorIdade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    @Override // significa que o metodo está sendo sobrescrito na herança
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", maiorIdade=" + maiorIdade +
                '}';
    }
}
