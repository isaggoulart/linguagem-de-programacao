package school.sptech;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Isabela", "11900000000");
        Contato c2 = new Contato("Beatriz", "11900011000");
        Grupo g1 = new Grupo("Grupo1");

       g1.adiciona(c1);
       g1.adiciona(c2);

        System.out.println(g1.getContatos());


    }
}