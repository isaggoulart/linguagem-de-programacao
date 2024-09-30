package school.sptech;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.util.List;

public class CriarCSV {
    public static void main(String[] args) {
        InputStream inputStream;

        try {
            inputStream = new FileInputStream("livros.json");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
            e.printStackTrace();
            throw  new RuntimeException(e);
        }

        LivroMapper mapper = new LivroMapper();
        List<Livro> livrosMapeados;

        try {
            livrosMapeados = mapper.mapearLivro(inputStream);
        } catch (IOException e) {
            System.out.println("Houve um erro ao mapear o JSON: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }


        for (Livro livrosMapeado : livrosMapeados) {
            System.out.println(livrosMapeado);
        }

        gerarCSV(livrosMapeados);
    }

    private static void gerarCSV(List<Livro> livrosMapeados) {
        try {
            OutputStream outputStream = new FileOutputStream("livros.csv");
            BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(outputStream));

            CSVFormat formato = CSVFormat.Builder.create().setHeader( "id","nome", "autor", "data", "editora", "preco", "preco_desconto", "nota").setDelimiter(";").build();

            CSVPrinter printer = new CSVPrinter(escritor, formato);

            for (Livro livrosMapeado : livrosMapeados) {
                printer.printRecord(livrosMapeado.getId(), livrosMapeado.getNome(), livrosMapeado.getAutor(), livrosMapeado.getDataFormatada(), livrosMapeado.getEditora(), livrosMapeado.getPrecoFormatado(), livrosMapeado.getPrecoComDesconto(), livrosMapeado.getNota());
            }

            printer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo " + e.getMessage());
            throw  new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
