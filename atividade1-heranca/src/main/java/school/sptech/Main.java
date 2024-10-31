package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendedorComissao vendedorComissao = new VendedorComissao(
                1,
                "Isabela",
                1000.0,
                25.3
        );

        VendedorComissaoMaisFixo vendedorComissaoMaisFixo = new VendedorComissaoMaisFixo(
                2,
                "Beatriz",
                9000.0,
                30.0,
                2000.0
        );


        List<VendedorComissao> testeVendedores = new ArrayList<>();
        testeVendedores.add(vendedorComissao);
        testeVendedores.add(vendedorComissaoMaisFixo);

        Empresa empresa = new Empresa("ACME", "94728467891537");
        empresa.adicionarVendedor(vendedorComissao);
        empresa.adicionarVendedor(vendedorComissaoMaisFixo);

    //    for (VendedorComissao vendedorAtual : testeVendedores) {
    //        if(vendedorAtual instanceof VendedorComissaoMaisFixo) {
    //            ((VendedorComissaoMaisFixo) vendedorAtual).soExisteSubclasse();
    //        }
    //    }

        VendedorComissao xpto = new VendedorComissaoMaisFixo();
        // Declarei que o xpto se comporta como o tipo mais alto de sua classe
        // portanto, ele vai se comportar como um VendedorComissao em tempo de compilacao
        //em tempo de execução, ele se comporta como um VendedorComissaoMaisFixo;
    }
}