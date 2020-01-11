/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        PoisonMatango p = new PoisonMatango('A');

        p.attack(h);
    }
}