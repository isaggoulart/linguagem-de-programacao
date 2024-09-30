package school.sptech.arquivos;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LeituraArquivo {
    public static void main(String[] args) {
        //representa o fluxo de entrada de dados byte a byte
        //ByteArrayInputStream: leitura de dados em memória
        //FileInputStream: leitura de dados local
        //BufferedInputStream: leitura de dados em memória usando buffer

        try {
            InputStream inputStream = new FileInputStream("arquivo.txt");
            int byteAtual = -1;

            //while ((byteAtual = inputStream.read()) != -1) {
            //    System.out.println((char)byteAtual);
            //}

            BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String linha;

            while((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro ao ler byte " + e.getMessage());
            e.printStackTrace();
        }
    }
}
