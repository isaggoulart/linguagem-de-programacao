package school.sptech;

public class Dev {
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;


    public Dev(String nome, Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Dev() {
    }

    public Double getSalario() {
        return this.qtdHoras * this.valorHora;
    }
}
