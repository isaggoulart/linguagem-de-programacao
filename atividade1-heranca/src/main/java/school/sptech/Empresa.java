package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<VendedorComissao> vendedores;


    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.vendedores = new ArrayList<>();
    }

    public void adicionarVendedor(VendedorComissao vendedor) {
        this.vendedores.add(vendedor);
    }

    public Double totalParaPagamento() {
        Double folhaSalarial = 0.0;
        for (VendedorComissao vendedorAtual : vendedores) {
            folhaSalarial += vendedorAtual.calcularSalario();
        }
        return folhaSalarial;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
