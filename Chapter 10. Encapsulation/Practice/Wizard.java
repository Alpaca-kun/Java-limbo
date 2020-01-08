/**
 * Wizard
 */
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHP () {
        return this.hp;
    }

    public void setHP (int newHP) {
        if (newHP < 0)
            this.hp = 0;
        else
            this.hp = newHP;
    }

    public int getMP () {
        return this.mp;
    }

    public int setMP (int newMP) {
        if (newMP < 0)
            throw new IllegalArgumentException("The MP you entered is negative.");
        else
            this.mp = newMP;
    }

    public Wand getWand () {
        return this.wand;
    }

    public void setWand (Wand newWand) {
        if (newWand == null)
            throw new IllegalArgumentException("The Wand you entered is NULL");
        this.wand = newWand;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String newName) {
        if (newName == null)
            throw new IllegalArgumentException("The name you entered is NULL");
        else if (newName.length() < 3)
            throw new IllegalArgumentException("The name you entered is too short");
        else
            this.name = newName;
    }

    public void heal (Hero h) {
        int basePoint = 10;
        int recoveryPoint = (int) (basePoint * this.getWand().getPower());

        h.setHp(h.getHp() + recoveryPoint);
        System.out.println(h.getName() + " recovered " + recoveryPoint + " points!");;
    }
}