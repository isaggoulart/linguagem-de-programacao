package school.sptech;

public class DevMobile extends Dev{
    private Integer qtdHoraMobile;
    private Double valorHoraMobile;

    public DevMobile(String nome, Integer qtdHoras, Double valorHora, Integer qtdHoraMobile, Double valorHoraMobile) {
        super(nome, qtdHoras, valorHora);
        this.qtdHoraMobile = qtdHoraMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    public DevMobile() {
    }

    public DevMobile(Integer qtdHoraMobile, Double valorHoraMobile) {
        this.qtdHoraMobile = qtdHoraMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    public Integer getQtdHoraMobile() {
        return qtdHoraMobile;
    }

    public void setQtdHoraMobile(Integer qtdHoraMobile) {
        this.qtdHoraMobile = qtdHoraMobile;
    }

    public Double getValorHoraMobile() {
        return valorHoraMobile;
    }

    public void setValorHoraMobile(Double valorHoraMobile) {
        this.valorHoraMobile = valorHoraMobile;
    }

    @Override
    public Double getSalario() {
        return this.qtdHoraMobile * this.valorHoraMobile;
    }
}
