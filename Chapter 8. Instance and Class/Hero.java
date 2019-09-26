/**
 * Hero
 */
public class Hero {
    // Properties
    String name;
    int hp;

    // Methods
    void attack(){

    }

    void fled() {
        System.out.println(this.name + " fled the battle!");
        System.out.println("Game Over");
        System.out.println("The final HP of " + this.name + " was " + this.hp);
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + " used SIT.");
        System.out.println(this.name +" sits down for " + sec + " seconds.");
        System.out.println(this.name + " recovered " + sec + " of HP!");
    }

    void sleep() {
        this.hp = 100;
        
        System.out.println(this.name + " used SLEEP.");
        System.out.println(this.name + " slept and became healthly!");
    }

    void slip () {
        this.hp -= 5;

        System.out.println(this.name + " slipped!");
        System.out.println(this.name + " taked 5 damage!");
    }

}