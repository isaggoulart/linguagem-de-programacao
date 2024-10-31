package school.sptech;

public class Aluno {
    private String nome;
    private Integer ra;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, Integer ra, Double nota1, Double nota2) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {
    }

    public Double calcularMedia() {
        return (nota1+nota2) / 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}
