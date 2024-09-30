package school.sptech.arquivos;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class EscritaArquivo {
    public static void main(String[] args) {
    //ByteArrayOutputStream: escreve um arquivo em memória
    //FileOutputStream: escreve um arquivo local
    //BufferedOutputStream: escreve um arquivo em memória usando buffer

    {
        try (
                OutputStream outputstream = new FileOutputStream("arquivo.txt");
                BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(outputstream, StandardCharsets.UTF_8));
                ){

            escritor.write("Diego é um professor legal");
            escritor.newLine();
            escritor.write("Java é bom demais");



        } catch (FileNotFoundException e) {
            System.out.println("Erro ao escrever o arquivo" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ero ao escrever o arquivo" + e.getMessage());
            e.printStackTrace();
        }
    }
}
}
