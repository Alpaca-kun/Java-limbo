/**
 * Hero
 */
public class Hero {
    // Usually, the fields are private and the methods are public
    private int hp;
    private String name;
    // Sword sword;
    static int money;

    public String getName () {
        return this.name;
    }

    public void setName (String newName) {
        if (newName == null) 
            throw new IllegalArgumentException("The name you entered is NULL.\nOperation cancelled.");
        else if (newName.length() <= 1)
            throw new IllegalArgumentException("The name you entered is too short.\nOperation cancelled.");
        else if (newName.length() > 8)
            throw new IllegalArgumentException("The name you entered is too long.\nOperation cancelled.");
        else
            this.name = newName;
    }

    void sleep () {
        this.hp = 100;
        System.out.println(this.name + " slept and recovered all HP!");
    }

    /*
    public void attack (Matango m) {
        
    }
    */

    private void die () {
        System.out.println(this.name + " died!");
        System.out.println("GAME OVER");
    }
}