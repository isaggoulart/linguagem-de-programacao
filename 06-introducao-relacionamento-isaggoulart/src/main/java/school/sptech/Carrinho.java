package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Carrinho() {
    }

    public Integer getQuantidade() {
        if(produtos.isEmpty()) {
            return 0;
        } else {
            return produtos.size();
        }
    }

    public void adicionar(Produto produto){
        this.produtos.add(produto);
    }

    public Boolean existsPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);

            if(produtoAtual.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String categoria){
        Integer contador = 0;

        for (int i = 0; i < produtos.size(); i++) {
            Produto produtoAtual = produtos.get(i);

            if(produtoAtual.getCategoria().equalsIgnoreCase(categoria)){
                contador++;
            }
        }
        return contador;
    }

    public void limpar(){
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        if(existsPorNome(nome)) {
            for (int i = 0; i < produtos.size(); i++) {
                Produto produtoAtual = produtos.get(i);

                if(produtoAtual.getNome().equalsIgnoreCase(nome)){
                    produtos.remove(produtoAtual);
                }
            }
        }
    }

    public Produto getPorNome(String nome) {
        if(existsPorNome(nome)) {
            for (int i = 0; i < produtos.size(); i++) {
                Produto produtoAtual = produtos.get(i);

                if(produtoAtual.getNome().equalsIgnoreCase(nome)) {
                    return produtoAtual;
                }
            }
        }
            return null;
    }

    public Double getValorTotal () {
        Double total = 0.0;

        for(Produto produto: produtos) {
            total+= produto.getPreco();
        }
        return total;
    }
}
