package school.sptech.excecções;

public class ExceptionPersonalizada {
    public static void main(String[] args) {
        Integer numero = 5;

        try {
            validarNumero(numero);
        } catch (NumErradoException e) {
            System.out.println(e.getMessage());;
        }
    }

    private static void validarNumero(Integer numero) throws NumErradoException {
        if(numero != 10) {
            throw new NumErradoException("O número %d não é 10".formatted(numero));
        }
        System.out.println("Número válido");
    }
}
