/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Hero.money = 0; // A static field can be declared without instantiating any class
        System.out.println("The heroes have " + Hero.money + "$");

        Hero h1 = new Hero();
        Hero h2 = new Hero();

        Hero.money = 100;
        System.out.println("The heroes have " + Hero.money + "$");

        h1.money += 100;
        System.out.println("The heroes have " + Hero.money + "$");
    }
}