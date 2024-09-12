package school.sptech.prateleira;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private List<Livro> livros;
    private Integer limite;
    private Double peso;

    public Prateleira(Integer limite, Double peso) {
        this.limite = limite;
        this.peso = peso;
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void adicionarLivro(Livro livro) {
        if(livros.size() < limite) {
            this.livros.add(livro);
        } else {
            System.out.println("Não é possível colocar mais livros nessa prateleira");
        }
    }

    public void removerLivro(String codigo) {
        Integer contador = 0;
        for (int i = 0; i < livros.size(); i++) {
            Livro livroDaVez = this.livros.get(i);

            if(livroDaVez.getCodigo().equals(codigo)) {
                livros.remove(livroDaVez);
                contador++;
            }
        }

        if(contador == 0) {
            System.out.println("O código inserido não é válido.");
        }
    }

    public Integer quantidadeLivros() {
        return livros.size();
    }

    public Double getPesoTotal() {
        Double pesoTotal = this.peso;

        for (int i = 0; i < livros.size(); i++) {
            pesoTotal+= livros.get(i).calcularPeso();
        }
        return pesoTotal;
    }

    public Livro getLivroPorNome(String nome) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getNome().equalsIgnoreCase(nome)) {
                return livros.get(i);
            }
        }
        return null;
    }
}
