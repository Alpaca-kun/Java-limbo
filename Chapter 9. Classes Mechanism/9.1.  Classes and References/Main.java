/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Section 9.1.1~
        Hero hero1; // Ensure the variable hero1 of Hero type

        hero1 = new Hero();
        // Ensure the adress and necessary memory to allocate the Hero instance
        hero1.name = "Criz";
        hero1.hp = 100;

        Hero hero2;

        hero2 = hero1; // The variable hero2 copied the adress of hero1
        hero2.hp = 200;

        System.out.println("THe life of hero 1 is: " + hero1.hp);
        System.out.println("THe life of hero 2 is: " + hero2.hp);

        System.out.println("----------------------------------------");

        // Section 9.1.8~
        Sword sword1 = new Sword();
        
        sword1.name = "Fire Sword";
        sword1.damage = 10;
        
        Hero hero3 = new Hero();

        hero3.name = "Chris";
        hero3.hp = 100;
        hero3.sword = sword1;

        System.out.println("Actual weapon of " + hero3.name + " is " + hero3.sword.name);

        Wizard wizard1 = new Wizard();
        
        wizard1.name = "Christy";
        wizard1.hp = 50;

        wizard1.heal(hero1);
        wizard1.heal(hero1);
        wizard1.heal(hero3);

        System.out.println("Actual HP of " + hero1.name + " is " + hero1.hp);
        System.out.println("Actual HP of " + hero3.name + " is " + hero3.hp);
    }
}