package school.sptech.exercicio;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.util.List;

public class TransferenciaDados {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("pessoas.json");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException();
        }

        PessoaMapper mapper = new PessoaMapper();
        List<Pessoa> pessoasMapeadas;
        try {
            pessoasMapeadas = mapper.mapearJson(inputStream);

        } catch (IOException e) {
            System.out.println("Houve um ro ao mapear o JSON para o objeto pessoa: "+e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        for (Pessoa pessoasMapeada : pessoasMapeadas) {
            System.out.println(pessoasMapeada);
        }

        gerarCSV(pessoasMapeadas);
    }

    private static void gerarCSV(List<Pessoa> pessoasMapeadas) {
        try {
            OutputStream outputStream = new FileOutputStream("pessoas.csv");
            BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(outputStream));

            CSVFormat formato = CSVFormat.Builder.create().setHeader("nome", "cpf").setDelimiter(";").build();

            CSVPrinter printer = new CSVPrinter(escritor, formato);

            for (Pessoa pessoasMapeada : pessoasMapeadas) {
                printer.printRecord(pessoasMapeada.getNome(), pessoasMapeada.getCpf());
            }

            printer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
