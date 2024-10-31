package school.sptech;

import school.sptech.exceptions.ArgumentoInvalidoException;
import school.sptech.exceptions.DevNaoEncontradoException;
import school.sptech.exceptions.VagaIndisponivelException;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Dev> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }

    public Consultoria() {
        this.devs = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public Boolean existePorNome (String nome) {
        if (devs.isEmpty() || nome == null || nome.isBlank()) {
            throw new ArgumentoInvalidoException("Paramêtro(s) inválido(s)");
        }

        for (Dev devAtual : devs) {
            if (devAtual.nome.equalsIgnoreCase(nome)) {
                return true;
            }
        }
        throw new DevNaoEncontradoException("Dev não encontrado!");
    }

    public void contratarDev(Dev dev) {
        if (dev == null) {
            throw new ArgumentoInvalidoException("Paramêtro(s) inválido(s)");
        }

        if(devs.size() < vagas) {
            devs.add(dev);
        }
        throw new VagaIndisponivelException("Não há vagas para fazer a contratação");
    }

    public Integer getQuantidadeDevs() {
        return devs.size();
    }

    public Integer getQuantidadeDevsMobile () {
        Integer contador = 0;

        for (Dev devAtual : devs) {
            if(devAtual instanceof DevMobile) {
                contador++;
            }
        }
        return contador;
    }

    public Double getTotalSalarios () {
        Double total = 0.0;

        for (Dev devAtual : devs) {
            total += devAtual.getSalario();
        }
        return total;
    }

    public Dev getDevPorNome (String nome) {
        if (nome == null || nome.isBlank()) {
            throw new ArgumentoInvalidoException("Paramêtro(s) inválido(s)");
        }

        for (Dev devAtual : devs) {
            if(devAtual.nome.equalsIgnoreCase(nome)) {
                return devAtual;
            }
        }
        throw new DevNaoEncontradoException("Dev não encontrado!");
    }
}
