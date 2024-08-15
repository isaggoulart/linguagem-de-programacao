package school.sptech;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    public static void main(String[] args) {
        // Em JS, usa-se o Math.random() * 10
        // Em Java, essa função também existe e funciona, mas há outras opções

        Random random = new Random();
        Integer i = random.nextInt(0,20);
        System.out.println(i);

        Integer i2 = ThreadLocalRandom.current().nextInt(0,20);
        System.out.println(i2);
    }
}
