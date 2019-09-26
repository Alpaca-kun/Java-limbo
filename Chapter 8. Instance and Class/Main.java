/**
 * Main
 * 
 * Firstly I will simulate a simple RPG with a Hero and a Monster
 * The function of the Main class is to give the orders to others instances
 */
public class Main {

    public static void main(String[] args) {
        // Born in this world, Hero!
        Hero hero = new Hero();

        hero.name = "Christian";
        hero.hp = 100;

        // Born in this world. Cleric!
        Cleric cleric = new Cleric();

        cleric.name = "Christina";
        
        /*
        System.out.println("A new hero called " + hero.name + " borned in this world!");

        hero.sit(10);
        hero.slip();
        hero.sit(25);
        hero.fled();
        */

        // Born in this world. Monster!
        Matango matango1 = new Matango();
        matango1.hp = 50;
        matango1.suffix = 'A';

        Matango matango2 = new Matango();
        matango2.hp = 25;
        matango2.suffix = 'B';

        // Fight them, Hero!
        
        // Run out, Monster!   
        hero.slip();

        cleric.hp -= 5;
        cleric.selfAid();
        cleric.pray(2);

        matango1.fled();
        matango2.fled();
        hero.fled();

    }
}