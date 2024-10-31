package school.sptech;

public class VendedorComissaoMaisFixo extends VendedorComissao{
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa, Double salarioFixo) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    public VendedorComissaoMaisFixo() {
    }

    @Override
    public Double calcularSalario() {
        Double salario = super.calcularSalario() + salarioFixo;
        return salario;
    }

    public void soExisteSubclasse() {
        System.out.println("Só existe na subclasse");
    }
}
