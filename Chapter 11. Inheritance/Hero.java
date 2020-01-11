/**
 * Hero
 */
public class Hero {
    private String name = "Christian";
    private int hp = 100;

    public Hero () {
        System.out.println("The hero class was instantiated!");
    }

    public String getName() {
        return this.name;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public int getHP () { return this.hp; }
    public void setHP (int newHP) { this.hp = newHP; }
    
    public void attack (Monster m) {
        int newHP = m.getHP() - 5;
        m.setHP(newHP);

        System.out.println(this.name + " attacked!");
        System.out.println(this.name + " caused 5 damage!");
    }

    public void run () {
        System.out.println("The hero ran away!!!");
    }

    // Declaring the method with "final" makes it impossible to
    // inherit this method
    public final void slip () {
        this.hp -= 5;

        System.out.println(this.getName() + " slipped out!");
        System.out.println(this.getName() + " took 5 damage!!!");
    }
}