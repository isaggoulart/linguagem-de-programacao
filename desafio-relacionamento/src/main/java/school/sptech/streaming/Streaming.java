package school.sptech.streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Streaming {
    private List<Filme> filmes;

    public Streaming() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme){
        this.filmes.add(filme);
    }

    public void removerFilme(Integer id){
        Integer contador = 0;
        for (int i = 0; i < filmes.size(); i++) {
            Filme filmeDaVez = filmes.get(i);
            if(filmeDaVez.getId() == id) {
                filmes.remove(filmeDaVez);
                contador++;
            }
        }
        if(contador == 0) {
            System.out.println("Este filme ainda não existe no serviço!");
        }
    }

    public Integer getQuantidadeDeFilmes(){
        return filmes.size();
    }

    Double getMediaFilmes() {
        Double notasTotais = 0.0;
        for (int i = 0; i < filmes.size(); i++) {
            notasTotais += filmes.get(i).getNotaImdb();
        }
        Double mediaTotal = notasTotais / filmes.size();
        return mediaTotal;
    }

    Filme getFilmePeloNome(String nome) {
        for (int i = 0; i < filmes.size(); i++) {
            Filme filmeDaVez = filmes.get(i);
            if((filmeDaVez.getNome()).equalsIgnoreCase(nome)) {
                return filmeDaVez;
            }
        }
        return null;
    }

    List<Filme> getFilmesPorCategoria(String categoria) {
        List<Filme> filmesPorCategoria = new ArrayList<>();

        for (int i = 0; i < filmes.size(); i++) {
            Filme filmeDaVez = filmes.get(i);

            if(filmeDaVez.getCategoria().equalsIgnoreCase(categoria)) {
                filmesPorCategoria.add(filmeDaVez);
            }
        }
        return filmesPorCategoria;
    }

    Filme getFilmeMaiorNota() {
        if(filmes.size() == 0) {
            return null;
        } else {
            Filme filmeComMaiorNota = filmes.get(0);

            for (int i = 0; i < filmes.size(); i++) {
                Filme filmedaVez = filmes.get(i);

                if(filmeComMaiorNota.getNotaImdb() < filmedaVez.getNotaImdb()) {
                filmeComMaiorNota = filmedaVez;
                }
            }
            return filmeComMaiorNota;
        }
    }

    Filme sortearFilme() {
        Integer posicaoFilmeSorteado = ThreadLocalRandom.current().nextInt(0, filmes.size());
        Filme filmeSorteado = filmes.get(posicaoFilmeSorteado);
        return filmeSorteado;
    }
}
