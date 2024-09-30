package school.sptech.excecções;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    // são exceções que o compilador pega e grita antes de ela estourar na execução

    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado método lerArquivo");
            e.printStackTrace();
        }

        try {
            lancaException();
        } catch (Exception e) {
            System.out.println("lancaException tem um argumento inválido");
        } finally {
            System.out.println("Terminou o método lancaException");
        }
    }

    public static void lerArquivo ()
            throws FileNotFoundException {
        FileInputStream input = new FileInputStream("pessoas");
    }

    public static void lancaException() throws Exception {
        String nome = "João";

        if(!nome.equals("Murillo")) {
            throw new IllegalArgumentException();
        }

        if(nome == null) {
            throw new NullPointerException();
        }
    }
}
