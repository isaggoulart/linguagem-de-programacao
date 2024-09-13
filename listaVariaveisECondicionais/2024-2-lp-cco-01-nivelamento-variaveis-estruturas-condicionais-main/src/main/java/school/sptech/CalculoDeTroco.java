package school.sptech;

import java.util.Scanner;

public class CalculoDeTroco {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);
        System.out.println("Forneça as seguintes informações:");
        System.out.println("Valor unitário do produto:");
        Integer valorUnitario = produto.nextInt();

        System.out.println("Quantas unidades foram vendidas:");
        Integer qtdVendida = produto.nextInt();

        System.out.println("O valor que o cliente entregou no pagamento:");
        Integer valorPago = produto.nextInt();

        Integer totalAPagar = valorUnitario * qtdVendida;
        Integer troco = valorPago - totalAPagar;

        System.out.println("Seu troco será de R$" + troco);
    }
}
