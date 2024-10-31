package school.sptech;

public class AlunoGraduacao extends Aluno{
    private Double notaMonografia;

    public AlunoGraduacao(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    public AlunoGraduacao() {
    }

    public void teste() {
        super.getRa(); // o super força a chamada da classe mãe
        // só precisa ser usado quando houve sobrescrita do metodo na classe herdeira e eu quero acessar o original.
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcularMedia() {
        return (super.getNota1() + super.getNota2() + getNotaMonografia()) / 3;
    }
}
