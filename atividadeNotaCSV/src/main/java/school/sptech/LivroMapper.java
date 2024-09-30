package school.sptech;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LivroMapper {
    public List<Livro> mapearLivro (InputStream arquivoJson) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Livro> livrosLidos = mapper.readValue(arquivoJson, new TypeReference<List<Livro>>() {
        });

        return livrosLidos;
    }
}


