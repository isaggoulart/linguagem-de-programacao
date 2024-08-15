package school.sptech;

public class LacosRepeticao {
    public static void main(String[] args) {
        for (Integer i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        Integer contador = 0;
        while (contador < 10) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}