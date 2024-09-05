public class Calculadora {

    Integer qtdOperacoes;

    void somar(Integer numero1, Integer numero2){
        Integer soma = numero1 + numero2;
        qtdOperacoes++;
    }

    void subtrair(Integer numero1, Integer numero2) {
        Integer subtracao = numero1 - numero2;
        qtdOperacoes++;
    }
}
