/**
 * Character
 *  
 * 
 */
public abstract class Character {
    String name;
    int hp;

    public void run () {
        System.out.println(this.name + " ran away!");
    }

    // If an attack method is created here, it doesn't have other information
    // to construct the attack value. So, in that case there is the necessity 
    // to create an abstract class as follows
    public abstract void attack (Matango m);
}