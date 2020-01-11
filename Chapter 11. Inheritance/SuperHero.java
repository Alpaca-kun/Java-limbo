/**
 * SuperHero
 */
public class SuperHero extends Hero {
    private boolean flying;

    public SuperHero () {
        System.out.println("The Super Hero class was instantiated!!!");
    }

    public void attack (Monster m) {
        // "super" is a reserved word that represents the Parent Instance
        // If use the "super", it will be called the method of the Hero Class
        super.attack(m);
        
        if (this.flying) 
            super.attack(m);
        
        // If declare the own method like "this.attack()"
        // It will be caused a infinite loop
    }

    public void fly() {
        this.flying = true;

        System.out.println("Flying!");
    }

    public void land() {
        this.flying = false;

        System.out.println("Landed!");
    }

    // Overriding a method
    // If declare a method with same name as the parent class, it is possible
    // to edit the method's content
    public void run() {
        System.out.println("The Super Hero ran away!!!");
    }
}