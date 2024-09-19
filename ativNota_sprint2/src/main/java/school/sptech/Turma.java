package school.sptech;

import java.util.ArrayList;
import java.util.Collections;

public class Turma {
    private ArrayList<Aluno> alunos;
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno getAlunoPorRa(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoAtual = alunos.get(i);
            if(alunoAtual.getRa().equals(ra)) {
                return alunoAtual;
            }
        }
        return null;
    }

    public ArrayList<Aluno> getAlunoPorNome(String nome) {
        ArrayList<Aluno> alunoEncontrado = new ArrayList<>();

        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoDaVez = alunos.get(i);

            if(alunoDaVez.getNome().equalsIgnoreCase(nome)) {
                alunoEncontrado.add(alunoDaVez);
            }
        }
        return alunoEncontrado;
    }

    public Aluno getAlunoComMaiorMedia () {
        if(alunos.isEmpty()) {
            return null;
        } else {
            Double maiorMedia = 0.0;
            Aluno alunoComMaiorMedia = null;
            for (int i = 0; i < alunos.size(); i++) {
                Aluno alunoAtual = alunos.get(i);

                if (maiorMedia < alunoAtual.calcularMedia()) {
                    alunoComMaiorMedia = alunoAtual;
                }
            }
            return alunoComMaiorMedia;
        }
    }

    public Aluno getAlunoComMenorMedia () {
        if(alunos.isEmpty()) {
            return null;
        } else {
            Double menorMedia = 0.0;
            Aluno alunoComMenorMedia = null;

            for (int i = 0; i < alunos.size(); i++) {
                Aluno alunoAtual = alunos.get(i);
                if (alunoAtual.calcularMedia() < menorMedia) {
                    alunoComMenorMedia = alunoAtual;
                }
            }
            return alunoComMenorMedia;
        }
    }

    public Double calcularMediaDaTurma () {
        if(alunos.isEmpty()) {
            return 0.0;
        } else {
            Double totalTodasAsNotas = 0.0;

            for (int i = 0; i < alunos.size(); i++) {
                Aluno alunoAtual = alunos.get(i);

                totalTodasAsNotas += alunoAtual.calcularMedia();
            }
            Double mediaTurma = totalTodasAsNotas / alunos.size();
            return mediaTurma;
        }
    }

    public Double getMediaPorRa(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno alunoAtual = alunos.get(i);

            if(alunoAtual.getRa().equals(ra)) {
                return alunoAtual.calcularMedia();
            }
        }
        return 0.0;
    }

    public Double getMediana() {
        if(alunos.isEmpty()) {
            return 0.0;
        } else {
            ArrayList<Double> mediaPorAluno = new ArrayList<>();

            for (int i = 0; i < alunos.size(); i++) {
                Aluno alunoAtual = alunos.get(i);
                mediaPorAluno.add(alunoAtual.calcularMedia());
            }
            Collections.sort(mediaPorAluno);
            if (mediaPorAluno.size() % 2 != 0) {
                Integer posicaoMediana = (mediaPorAluno.size() + 1) / 2 - 1;
                return mediaPorAluno.get(posicaoMediana);
            } else {
                Integer posicaoValor1 = mediaPorAluno.size()/2 - 1;
                Integer posicaoValor2 = mediaPorAluno.size()/2;

                return (mediaPorAluno.get(posicaoValor1) + mediaPorAluno.get(posicaoValor2)) / 2;
            }
        }
    }
}
