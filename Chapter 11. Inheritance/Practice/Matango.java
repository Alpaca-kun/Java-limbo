/**
 * Matango
 */
public class Matango {
    int hp = 50;
    private char suffix;

    public Matango (char newSuffix) {
        this.suffix = newSuffix;
    }

    public void attack (Hero h) {
        System.out.println("Matango " + this.suffix + " attacked!!!");
        System.out.println("It caused 10 damage!!!");

        h.setHP(h.getHP() - 10);
    }
}