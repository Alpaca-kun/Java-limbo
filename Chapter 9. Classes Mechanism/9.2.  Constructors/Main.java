/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("Chris");

        System.out.println("The name of new hero is " + h.name);
        System.out.println("The HP of new hero is " + h.hp);

        Hero h2 = new Hero();

        System.out.println("The name of new hero is " + h2.name);
        System.out.println("The HP of new hero is " + h2.hp);
    }
}