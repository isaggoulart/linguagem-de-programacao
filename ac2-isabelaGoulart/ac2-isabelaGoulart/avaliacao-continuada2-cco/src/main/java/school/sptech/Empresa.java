package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;
import school.sptech.exception.JogoInvalidoException;
import school.sptech.exception.JogoNaoEncontradoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Jogo> jogos;

    public Empresa(String nome) {
        this.nome = nome;
        this.jogos = new ArrayList<>();
    }

    public Empresa() {
        this.jogos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarJogo(Jogo jogo) {
        if (jogo == null ||
        jogo.getCodigo() == null ||
        jogo.getCodigo().isBlank() ||
        jogo.getNome() == null ||
        jogo.getNome().isBlank() ||
        jogo.getGenero() == null ||
        jogo.getGenero().isBlank() ||
        jogo.getPreco() == null ||
        jogo.getPreco() <= 0 ||
        jogo.getAvaliacao() == null ||
        jogo.getAvaliacao() < 0 ||
        jogo.getAvaliacao() > 5 ||
        jogo.getDataLancamento() == null ||
        jogo.getDataLancamento().isAfter(LocalDate.now())) {
            throw new JogoInvalidoException("Parâmetros inválidos!");
        }

        jogos.add(jogo);
    }

    public Jogo buscarJogoPorCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new ArgumentoInvalidoException("Parâmetro inválido!");
        }

        for (Jogo jogoAtual : jogos) {
            if (jogoAtual.getCodigo().equals(codigo)) {
                return jogoAtual;
            }
        }
        throw new JogoNaoEncontradoException("O jogo não existe na lista!");
    }

    public void removerJogoPorCodigo(String codigo) {
        Jogo jogo = buscarJogoPorCodigo(codigo);
        jogos.remove(jogo);
    }

    public Jogo buscarJogoComMelhorAvaliacao() {
        if (jogos.isEmpty()) {
            throw new JogoNaoEncontradoException("A lista está vazia!");
        }

        Jogo melhorAvaliacao = jogos.get(0);
        for (Jogo jogoAtual : jogos) {
            if (jogoAtual.getAvaliacao() > melhorAvaliacao.getAvaliacao()) {
                melhorAvaliacao = jogoAtual;
            }

            if (jogoAtual.getAvaliacao().equals(melhorAvaliacao.getAvaliacao())) {
                if (jogoAtual.getDataLancamento().isAfter(melhorAvaliacao.getDataLancamento())) {
                    melhorAvaliacao = jogoAtual;
                }
            }
        }
        return melhorAvaliacao;
    }

    public List<Jogo> buscarJogoPorPeriodo(LocalDate dataInicio, LocalDate dataFim) {
        if (dataInicio == null ||
        dataFim == null ||
        dataInicio.isAfter(dataFim)) {
            throw new ArgumentoInvalidoException("Parâmetros inválidos!");
        }

        List<Jogo> jogosPorPeriodo = new ArrayList<>();

        for (Jogo jogoAtual : jogos) {
            if (jogoAtual.getDataLancamento().isAfter(dataInicio) &&
            jogoAtual.getDataLancamento().isBefore(dataFim)) {
                jogosPorPeriodo.add(jogoAtual);
            }
        }
        return jogosPorPeriodo;
    }
}
