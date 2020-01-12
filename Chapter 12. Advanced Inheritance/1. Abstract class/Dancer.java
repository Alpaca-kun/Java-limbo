/**
 * Dancer
 */
public class Dancer extends Character {
    public void dance () {
        System.out.println(this.name + " danced passionately!");
    }

    // That override is obligatory! If exists an abstract method the 
    // compiler returns an error. So, needs to materialize the abstract
    // methods
    public void attack (Matango m) {
        System.out.println(this.name + " attacked!");
        System.out.println("3 damages to " + m.name);

        m.hp -= 3;
    }
}