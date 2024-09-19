package school.sptech;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;
    private String ra;

    public Aluno(String nome) {
        this.nome = nome;
        notas = new ArrayList<>();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void adicionarNota (Double nota) {
        notas.add(nota);
    }

    public Double calcularMedia() {
        if(notas.isEmpty()) {
            return 0.0;
        } else {
            Double total = 0.0;

            for(Double nota: notas) {
                total += nota;
            }

            Double media = total / notas.size();
            return media;
        }
    }
}
