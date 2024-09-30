package school.sptech.excecções;

import java.util.ArrayList;
import java.util.List;

public class UncheckedException {
    //significa que o compilador não vai sugerir tratamento para a excecção

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros.get(3));
        // essa linha gera uma exceção unchecked
        //não há erros de lógica nem nada parecido, por isso o compilador não acusa antes

        //String nome = null;
        //System.out.println(nome.toLowerCase());
        //a exceção clássica do null pointer também é unchecked

        //String numero = "Murilo";
        //Integer.parseInt(numero);
    }
}
