package school.sptech;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploData {
    public static void main(String[] args) {
        /*
        Date
        Datetime
        Calendar
        ZonedDateTime
        (...)
        */

        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatador.format(dataAtual));

        LocalDate outraData = LocalDate.of(2005, 3, 11);
        System.out.println(formatador.format(outraData));

        if(dataAtual.isAfter(outraData)) {
            System.out.println("é posterior");
        } else {
            System.out.println("antecede");
        }

        DayOfWeek diaSemana = dataAtual.getDayOfWeek();
        System.out.println(diaSemana);
    }
}
