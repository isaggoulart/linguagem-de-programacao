package school.sptech;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Faker falsinho = new Faker(new Locale("pt_BR"));

        Address adress = falsinho.address();
        Name nome = falsinho.name();

        System.out.println(adress.country());
        System.out.println(nome.name());
    }
}