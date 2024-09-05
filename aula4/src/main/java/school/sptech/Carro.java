package school.sptech;

    public class Carro {
        /*
        Atributos = características (propriedade)

        Métodos = comportamento

        --> Uma classe pode ter só um, só o outro, ou os dois
         */

        String modelo;
        String fabricante;
        Integer anoLancamento;
        Double velocidade = 0.0;

        // VOID --> significa que o method não retorna nada (para quem chamou a função)
        // Estruturando métodos: tipo do retorno, nome do method, argumentos (opcional)
        void acelerar() {
            velocidade += 10.0;
        }
    }
