package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String titular;
    private String agencia;
    private String numero;
    private List<OperacaoBancaria> operacoes;

    public ContaCorrente(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.operacoes = new ArrayList<>();
    }

    public ContaCorrente() {
        this.operacoes = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void adicionarOperacao(String categoria, String descricao, Double valor) {
        if(categoria != null && descricao != null && !categoria.isBlank() && !descricao.isBlank() && valor != null && valor != 0.0) {
            OperacaoBancaria novaOperacao = new OperacaoBancaria(categoria, descricao, valor);
            operacoes.add(novaOperacao);
        }
    }

    public List<OperacaoBancaria> buscarOperacoesPorCategoria(String categoria) {
        List<OperacaoBancaria> operacoesDeUmaCategoria = new ArrayList<>();
        if(categoria != null) {

            for (int i = 0; i < operacoes.size(); i++) {
                OperacaoBancaria operacaoAtual = operacoes.get(i);

                if(operacaoAtual.getCategoria().equalsIgnoreCase(categoria)) {
                    operacoesDeUmaCategoria.add(operacaoAtual);
                }
            }
        }
        return operacoesDeUmaCategoria;
    }

    public List<OperacaoBancaria> buscarOperacoesPorValor(Double valor) {
        List<OperacaoBancaria> operacoesComUmValor = new ArrayList<>();
        if(valor != null) {

            for(OperacaoBancaria operacaoAtual: operacoes) {
                if(operacaoAtual.getValor().equals(valor)) {
                    operacoesComUmValor.add(operacaoAtual);
                }
            }
        }
        return operacoesComUmValor;
    }

    public List<OperacaoBancaria> buscarOperacoesSaida() {
        List<OperacaoBancaria> operacosSaida = new ArrayList<>();

        for(OperacaoBancaria operacaoAtual : operacoes) {
            if(operacaoAtual.getValor() < 0.0) {
                operacosSaida.add(operacaoAtual);
            }
        }
        return operacosSaida;
    }

    public List<OperacaoBancaria> buscarOperacoesEntrada() {
        List<OperacaoBancaria> operacoesEntrada = new ArrayList<>();

        for (OperacaoBancaria operacaoAtual : operacoes) {
            if(operacaoAtual.getValor() > 0.0) {
                operacoesEntrada.add(operacaoAtual);
            }
        }
        return operacoesEntrada;
    }

    public List<OperacaoBancaria> buscarOperacoesPorDescricao(String descricao) {
        List<OperacaoBancaria> operacoesComUmaDescricao = new ArrayList<>();

        if(descricao != null && !descricao.isBlank()) {
            for (OperacaoBancaria operacaoAtual : operacoes) {
                if (operacaoAtual.getDescricao().toLowerCase().contains(descricao.toLowerCase())) {
                    operacoesComUmaDescricao.add(operacaoAtual);
                }
            }
        }
        return operacoesComUmaDescricao;
    }

    public Double buscarMaiorValor() {
        if(operacoes.isEmpty()) {
            return 0.0;
        } else {
            Double maiorValor = operacoes.get(0).getValor();
            for(OperacaoBancaria operacaoAtual:operacoes) {
                if(operacaoAtual.getValor() > maiorValor) {
                    maiorValor = operacaoAtual.getValor();
                }
            }
            return maiorValor;
        }
    }

    public Double buscarMenorValor() {
        if(operacoes.isEmpty()) {
            return 0.0;
        } else {
            Double menorValor = operacoes.get(0).getValor();
            for(OperacaoBancaria operacaoAtual:operacoes) {
                if(operacaoAtual.getValor() < menorValor) {
                    menorValor = operacaoAtual.getValor();
                }
            }
            return menorValor;
        }
    }

    public Double obterSaldo() {
        if(operacoes.isEmpty()) {
            return 0.0;
        } else {
            Double saldo = operacoes.get(0).getValor();

            for (int i = 1; i < operacoes.size(); i++) {
                OperacaoBancaria operacaoAtual = operacoes.get(i);
                saldo += operacaoAtual.getValor();
            }
            return saldo;
        }
    }
}
